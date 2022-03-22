package com.theplains.gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class DynamicGameObjectTest {

    private DynamicGameObject o1;
    private DynamicGameObject o2;

    private DynamicPosition pos1;
    private DynamicPosition pos2;

    @BeforeEach
    public void setUp() {
        pos1 = mock(DynamicPosition.class);
        pos1 = mock(DynamicPosition.class);

        o1 = new DynamicGameObject(pos1);
        o2 = new DynamicGameObject(pos2);
    }

    @Test
    void testHasId() {
        assertTrue(o1.hasId(o1.getId()));
        assertFalse(o1.hasId(o2.getId()));
    }

    @Test
    void testGetPosition() {
        assertEquals(pos1, o1.getPosition());
    }

}