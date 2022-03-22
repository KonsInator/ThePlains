package com.theplains.gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ObjectPositionRepWithTLandBRTest {

    private Point tl;
    private Point br;
    private ObjectPositionRepWithTLandBR pos;

    @BeforeEach
    void setUp() {
        tl = new Point(1, 1);
        br = new Point(2, 2);
        pos = Mockito.mock(ObjectPositionRepWithTLandBR.class, Mockito.CALLS_REAL_METHODS);
        pos.topLeft = tl;
        pos.bottomRight = br;
    }

    @Test
    void getTopLeft() {
        assertEquals(tl, pos.getTopLeft());
    }

    @Test
    void getBottomRight() {
        assertEquals(br, pos.getBottomRight());
    }

    @Test
    void rightX() {
        assertEquals(2, pos.rightX());
    }

    @Test
    void leftX() {
        assertEquals(1, pos.leftX());
    }

    @Test
    void topY() {
        assertEquals(1, pos.topY());
    }

    @Test
    void bottomY() {
        assertEquals(2, pos.bottomY());
    }
}