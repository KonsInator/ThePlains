package gameobjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectIdTest {

    @Test
    void getUniqueId() {
        assertEquals(0L, ObjectId.getUniqueId().get());
        assertEquals(1L, ObjectId.getUniqueId().get());
        assertEquals(2L, ObjectId.getUniqueId().get());
        assertEquals(3L, ObjectId.getUniqueId().get());
        assertEquals(4L, ObjectId.getUniqueId().get());
        assertEquals(5L, ObjectId.getUniqueId().get());
    }
}