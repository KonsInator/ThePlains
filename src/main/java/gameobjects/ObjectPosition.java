package gameobjects;

import java.awt.*;

/**
 * rectangle representation with top-left and bottom-right corner
 */
public interface ObjectPosition {

    Point getTopLeft();
    void setTopLeft(Point topLeft);

    Point getBottomRight();
    void setBottomRight(Point bottomRight);
}
