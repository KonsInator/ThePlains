package gameobjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectIdTest {

    @Test
    void getUniqueId() {
        assertEquals(0L, ObjectId.getUniqueId().longValue());
        assertEquals(1L, ObjectId.getUniqueId().longValue());
        assertEquals(2L, ObjectId.getUniqueId().longValue());
        assertEquals(3L, ObjectId.getUniqueId().longValue());
        assertEquals(4L, ObjectId.getUniqueId().longValue());
        assertEquals(5L, ObjectId.getUniqueId().longValue());
    }
}