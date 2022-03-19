package gameobjects;

import java.awt.*;

/**
 * {@inheritDoc}
 * can be moved relatively with {@link #move(int, int)} method
 */
public class DynamicPosition implements ObjectPosition {

    protected Point topLeft;
    protected Point bottomRight;

    @Deprecated
    public DynamicPosition() {}

    public DynamicPosition(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * @param dx shifts the {@link DynamicPosition} in x-direction
     * @param dy shifts the {@link DynamicPosition} in y-direction
     */
    public void move(int dx, int dy) {
        topLeft.translate(dx, dy);
        bottomRight.translate(dx, dy);
    }
}
