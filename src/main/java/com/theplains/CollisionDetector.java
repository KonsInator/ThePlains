package com.theplains;

import com.theplains.gameobjects.ObjectPosition;

/**
 * class to detect collisions of {@link ObjectPosition}s
 */
public class CollisionDetector {

    /**
     * detects mutual collisions of two {@link ObjectPosition}s
     */
    public static boolean colliding(ObjectPosition pos1, ObjectPosition pos2) {
        return pos1.rightX() >= pos2.leftX() &&
                pos1.leftX() <= pos2.rightX() &&
                pos1.bottomY() >= pos2.topY() &&
                pos1.topY() <= pos2.bottomY();
    }

    private CollisionDetector() {}
}
