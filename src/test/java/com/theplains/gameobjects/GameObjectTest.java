package com.theplains.gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameObjectTest {

    private GameObject object;

    private StaticPosition position = mock(StaticPosition.class);

    private ImageIcon image = mock(ImageIcon.class);

    @BeforeEach
    void setUp() {
        object = new StaticGameObject(position);

        when(image.getIconWidth()).thenReturn(10);
        when(image.getIconHeight()).thenReturn(20);
    }

    @Test
    void getWidth() {
        assertEquals(0, object.getWidth());
        object.setTexture(image);
        assertEquals(10, object.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(0, object.getHeight());
        object.setTexture(image);
        assertEquals(20, object.getHeight());
    }
}