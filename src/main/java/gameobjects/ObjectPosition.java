package gameobjects;

import java.awt.*;

/**
 * rectangle
 */
public interface ObjectPosition {

    Point getTopLeft();
    void setTopLeft(Point topLeft);

    Point getBottomRight();
    void setBottomRight(Point bottomRight);
}
