package com.theplains.gameobjects;

import java.awt.*;

public abstract class ObjectPositionRepWithTLandBR implements ObjectPosition {

    protected Point topLeft;
    protected Point bottomRight;

    @Deprecated
    public ObjectPositionRepWithTLandBR() {}

    public ObjectPositionRepWithTLandBR(Point topLeft, Point bottomRight) {
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

    @Override
    public int rightX() {
        return bottomRight.x;
    }

    @Override
    public int leftX() {
        return topLeft.x;
    }

    @Override
    public int topY() {
        return topLeft.y;
    }

    @Override
    public int bottomY() {
        return bottomRight.y;
    }
}
