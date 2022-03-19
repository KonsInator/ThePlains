package motion;

public class MotionController {

    private int velocity = 0; // points per ms
    private float[] direction = {0, 0}; // should be between -1 and 1
    private long timeOfLastUpdate = 0;
    private MovingHandle movingHandle;

    public MotionController(MovingHandle movingHandle) {
        this.movingHandle = movingHandle;
    }

    /**
     * move with velocity in direction
     */
    public void move() {
        if (timeOfLastUpdate == 0) {
            timeOfLastUpdate = System.nanoTime() / 1000000;
            return;
        }

        long now = System.nanoTime() / 1000000;
        long timeSinceLastUpdate = now - timeOfLastUpdate;
        timeOfLastUpdate = now;

        movingHandle.move((int)(velocity*direction[0]), (int)(velocity*direction[1]));
    }

    /**
     * @param velocity velocity in points per ms
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    /**
     * @param direction [x, y] where x and y should be between -1 and 1
     */
    public void setDirection(float[] direction) {
        this.direction = direction;
    }
}
