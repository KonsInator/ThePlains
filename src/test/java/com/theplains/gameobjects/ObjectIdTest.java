package com.theplains.gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectIdTest{

    @BeforeEach
    void setUp() {
        ObjectId.resetIdCounter();
    }

    @Test
    void getUniqueId() {
        assertEquals(0L, ObjectId.getUniqueId().value());
        assertEquals(1L, ObjectId.getUniqueId().value());
        assertEquals(2L, ObjectId.getUniqueId().value());
        assertEquals(3L, ObjectId.getUniqueId().value());
        assertEquals(4L, ObjectId.getUniqueId().value());
        assertEquals(5L, ObjectId.getUniqueId().value());
    }
}