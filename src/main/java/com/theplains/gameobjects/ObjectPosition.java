package com.theplains.gameobjects;

import java.awt.*;

/**
 * rectangle representation with top-left and bottom-right corner
 */
public interface ObjectPosition {

    Point getTopLeft();
    void setTopLeft(Point topLeft);

    Point getBottomRight();
    void setBottomRight(Point bottomRight);

    int rightX();

    int leftX();

    int topY();

    int bottomY();
}
