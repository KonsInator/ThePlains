package gameobjects;

import java.awt.*;

/**
 * movable rectangle
 */
public class Position {

    private Point topLeft;
    private Point bottomRight;

    public Position(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void move(int dx, int dy) {
        topLeft.translate(dx, dy);
        bottomRight.translate(dx, dy);
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
