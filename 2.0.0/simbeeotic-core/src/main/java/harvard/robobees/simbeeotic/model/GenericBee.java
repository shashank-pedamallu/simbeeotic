package harvard.robobees.simbeeotic.model;


import com.bulletphysics.collision.shapes.CollisionShape;
import com.bulletphysics.collision.shapes.SphereShape;
import com.bulletphysics.dynamics.DiscreteDynamicsWorld;
import com.bulletphysics.dynamics.RigidBody;
import com.bulletphysics.dynamics.RigidBodyConstructionInfo;
import com.bulletphysics.linearmath.DefaultMotionState;
import com.bulletphysics.linearmath.MatrixUtil;
import com.bulletphysics.linearmath.MotionState;
import com.bulletphysics.linearmath.Transform;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import harvard.robobees.simbeeotic.environment.PhysicalConstants;
import harvard.robobees.simbeeotic.util.LinearMathUtil;
import org.apache.log4j.Logger;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;


/**
 * A simple bee platform that can be used as a starting point for creating
 * more complicated bee models. This base class creates a physical body in
 * the world (a sphere) and has primitive flight controls to simplify
 * movement. Sensors and a radio can be attached at runtime and the logic is
 * supplied as user-defined behavior.
 *
 * @author bkate
 */
public class GenericBee extends GenericModel {

    private GenericBeeLogic logic;

    // parameters
    private float length = 0.2f;   // m
    private float mass = 0.128f;   // g

    // physical state
    private RigidBody body;
    private Vector3f desiredLinVel = new Vector3f();
    private Vector3f hoverForce;
    private boolean hovering = false;

    
    private static Logger logger = Logger.getLogger(GenericBee.class);


    /** {@inheritDoc} */
    @Override
    protected RigidBody initializeBody(DiscreteDynamicsWorld world) {

        float halfLength = length / 2;

        // establish the bee body
        CollisionShape colShape = new SphereShape(halfLength);

        Transform startTransform = new Transform();
        startTransform.setIdentity();

        Vector3f localInertia = new Vector3f(0, 0, 0);
        colShape.calculateLocalInertia(mass, localInertia);

        startTransform.origin.set(new Vector3f(getStartX(), getStartY(), getStartZ() + halfLength));

        MotionState myMotionState = new DefaultMotionState(startTransform);
        RigidBodyConstructionInfo rbInfo = new RigidBodyConstructionInfo(mass, myMotionState,
                                                                         colShape, localInertia);

        // modify the thresholds for deactivating the bee
        // because it moves at a much smaller scale
        rbInfo.linearSleepingThreshold = 0.08f;  // m/s
        rbInfo.angularSleepingThreshold = 0.1f;  // rad/s

        body = new RigidBody(rbInfo);

        // todo: put the bee's properties into the entity info?
        body.setUserPointer(new EntityInfo());

        world.addRigidBody(body, COLLISION_BEE, (short)(COLLISION_TERRAIN | COLLISION_BEE | COLLISION_FLOWER));

        hoverForce = new Vector3f(0, 0, mass * -PhysicalConstants.EARTH_GRAVITY);

        logic.intialize(this);

        return body;
    }


    /** {@inheritDoc} */
    @Override
    public final void update(double currTime) {

        logic.update(currTime);

        if (desiredLinVel.length() > 0) {
            body.activate();
        }

        // apply changes to motion for the next timestep
        Vector3f impulse = new Vector3f(desiredLinVel);
        Transform trans = new Transform();

        trans.setIdentity();
        trans.setRotation(getTruthOrientation());

        trans.transform(impulse);
        impulse.sub(getTruthLinearVelocity());
        impulse.scale(getMass());

        // apply an instantaneous force to get the desired velocity change
        body.applyCentralImpulse(impulse);

        // account for gravity (or not)
        if (hovering) {

            body.activate();
            applyForce(hoverForce);
        }
    }


    /**
     * Performs an instantaneous right-handed rotation of the body about the Z axis. The results of
     * this call will be visible immediately through the bee's sensors. At the same time, the rotation
     * about the X and Y axes are reset to 0 (emulating level flight).
     *
     * @param angle The angle of rotation (rad).
     */
    public final void turn(final float angle) {

        body.activate();
        
        Transform orient = new Transform();
        orient.setIdentity();
        orient.setRotation(getTruthOrientation());

        Vector3f unitX = new Vector3f(1, 0, 0);
        orient.transform(unitX);

        float heading = (float)Math.atan2(unitX.y, unitX.x) + angle;
        Quat4f quat = new Quat4f();

        MatrixUtil.getRotation(LinearMathUtil.eulerZYXtoDCM(0, 0, heading), quat);

        body.getWorldTransform(orient);
        orient.setRotation(quat);

        body.setWorldTransform(orient);
    }


    /**
     * Sets the linear velocity of the bee for the next time step. The results of this
     * call will not be seen immediately, but applied to future movement.
     *
     * @note If the linear velocity is set to zero, the bee will fall to the ground due
     *       to the effects of gravity. To counteract this, enable hover mode.
     *
     * @param vel The desired linear velocity of the bee for the next time step (m/s, in the body frame).
     */
    public final void setDesiredLinearVelocity(final Vector3f vel) {
        desiredLinVel = vel;
    }


    /**
     * Gets the linear velocity that this bee's automated flight control is
     * attempting to maintain.
     *
     * @return The linear velocity (m/s in the body frame).
     */
    public final Vector3f getDesiredLinearVelocity() {
        return new Vector3f(desiredLinVel);
    }


    /**
     * Enables/disables hover mode for this bee. If enabled, the bee's automated
     * flight control will apply a force to counteract gravity. This allows the
     * bee to have zero linear velocity and maintain a position off the ground.
     *
     * @param hover True if hovering should be enabled for the next time step, false otherwise.
     */
    public final void setHovering(final boolean hover) {
        hovering = hover;
    }


    /**
     * Indicates if hovering mode is enabled or disabled.
     *
     * @return True if hover mode is enabled for the next time step, false otherwise.
     */
    public final boolean isHovering() {
        return hovering;
    }


    public final float getLength() {
        return length;
    }


    public final float getMass() {
        return mass;
    }


    public final void setLogic(final GenericBeeLogic logic) {

        if (!isInitialized()) {

            this.logic = logic;

            if (getRadio() != null) {
                getRadio().addMessageListener(logic);
            }
        }
    }


    @Inject(optional = true)
    public final void setLength(@Named(value = "length") final float length) {

        if (!isInitialized()) {
            this.length = length;
        }
    }


    @Inject(optional = true)
    public final void setMass(@Named(value = "mass") final float mass) {

        if (!isInitialized()) {
            this.mass = mass;
        }
    }
}