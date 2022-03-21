package gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class DynamicPositionTest {

    DynamicPosition position;

    @BeforeEach
    public void setUp() {
        position = new DynamicPosition(new Point(0, 0), new Point(1, 2));
    }

    @Test
    void move() {
        position.move(1, 2);
        assertEquals(new Point(1, 2), position.getTopLeft());
        assertEquals(new Point(2, 4), position.getBottomRight());
        position.move(10, 20);
        assertEquals(new Point(11, 22), position.getTopLeft());
        assertEquals(new Point(12, 24), position.getBottomRight());
    }
}