package gameobjects;

import java.awt.*;

/**
 * {@inheritDoc}
 */
public class StaticPosition implements ObjectPosition {

    protected Point topLeft;
    protected Point bottomRight;

    public StaticPosition(Point topLeft, Point bottomRight) {
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
}
