package com.theplains.gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class CollisionDetectorTest {

    @Mock
    ObjectPosition pos00sq;
    @Mock ObjectPosition pos30sq;
    @Mock ObjectPosition pos10sq;
    @Mock ObjectPosition pos0022;
    @Mock ObjectPosition pos1032;
    @Mock ObjectPosition pos11sq;
    @Mock ObjectPosition pos0033;
    @Mock ObjectPosition pos01sq;
    @Mock ObjectPosition pos02sq;
    @Mock ObjectPosition pos0123;
    @Mock ObjectPosition pos1133;

    @BeforeEach
    void setUp() {
        setUpPositionMock(pos00sq, 0, 0, 1, 1);
        setUpPositionMock(pos10sq, 1, 0, 2, 1);
        setUpPositionMock(pos30sq, 3, 0, 4, 1);
        setUpPositionMock(pos0022, 0, 0, 2, 2);
        setUpPositionMock(pos1032, 1, 0, 3, 2);
        setUpPositionMock(pos11sq, 1, 1, 2, 2);
        setUpPositionMock(pos0033, 0, 0, 3, 3);
        setUpPositionMock(pos01sq, 0, 1, 1, 2);
        setUpPositionMock(pos02sq, 0, 2, 1, 3);
        setUpPositionMock(pos0123, 0, 1, 2, 3);
        setUpPositionMock(pos1133, 1, 1, 3, 3);
    }

    private static void setUpPositionMock(ObjectPosition pos, int leftX, int topY, int rightX, int botY) {
        when(pos.leftX()).thenReturn(leftX);
        when(pos.rightX()).thenReturn(rightX);
        when(pos.topY()).thenReturn(topY);
        when(pos.bottomY()).thenReturn(botY);
    }

    private static void assertColliding(ObjectPosition pos1, ObjectPosition pos2) {
        assertTrue(CollisionDetector.colliding(pos1, pos2));
    }

    private static void assertNotColliding(ObjectPosition pos1, ObjectPosition pos2) {
        assertFalse(CollisionDetector.colliding(pos1, pos2));
    }

    @Test
    public void testCollisionOfIdenticalPosition() {
        assertColliding(pos00sq, pos00sq);
    }

    @Test
    public void testCollisionOfEnclosedPosition() {
        assertColliding(pos0033, pos11sq);
    }

    @Test
    public void testCollisionOfEnclosingPosition() {
        assertColliding(pos11sq, pos0033);
    }

    @Test
    public void testCollisionOfNonCollidingPositionRight() {
        assertNotColliding(pos00sq, pos30sq);
    }

    @Test
    public void testCollisionOfCollidingPositionRightTouch() {
        assertColliding(pos00sq, pos10sq);
    }

    @Test
    public void testCollisionOfCollidingPositionLeftTouch() {
        assertColliding(pos10sq, pos00sq);
    }

    @Test
    public void testCollisionOfNonCollidingPositionLeft() {
        assertNotColliding(pos30sq, pos00sq);
    }

    @Test
    public void testCollisionOfCollidingPositionRight0verlap() {
        assertColliding(pos0022, pos1032);
    }

    @Test
    public void testCollisionOfCollidingPositionLeft0verlap() {
        assertColliding(pos1032, pos0022);
    }

    @Test
    public void testCollisionOfCollidingPositionBelowTouch() {
        assertColliding(pos00sq, pos01sq);
    }

    @Test
    public void testCollisionOfNonCollidingPositionBelow() {
        assertNotColliding(pos00sq, pos02sq);
    }

    @Test
    public void testCollisionOfCollidingPositionBelowOverlap() {
        assertColliding(pos0022, pos0123);
    }

    @Test
    public void testCollisionOfCollidingPositionAboveTouch() {
        assertColliding(pos01sq, pos00sq);
    }

    @Test
    public void testCollisionOfNonCollidingPositionAbove() {
        assertNotColliding(pos02sq, pos00sq);
    }

    @Test
    public void testCollisionOfCollidingPositionAboveOverlap() {
        assertColliding(pos0123, pos0022);
    }

    @Test
    public void testEdgeTouch() {
        assertColliding(pos00sq, pos11sq);
    }

    @Test
    public void testDiagonalOverlap() {
        assertColliding(pos0022, pos1133);
    }
}