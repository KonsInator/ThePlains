package com.theplains.gameobjects;

import java.awt.*;

/**
 * {@inheritDoc}
 * can be moved relatively with {@link #move(int, int)} method
 */
public class DynamicPosition extends ObjectPositionRepWithTLandBR {

    public DynamicPosition(Point topLeft, Point bottomRight) {
        super(topLeft, bottomRight);
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
