package motion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MovingHandleTest {

    MovingHandle handle;

    @BeforeEach
    public void setUp() {
        handle = new MovingHandle(new Point(0, 0), new Point(1, 2));
    }

    @Test
    void move() {
        handle.move(1, 2);
        assertEquals(new Point(1, 2), handle.getTopLeft());
        assertEquals(new Point(2, 4), handle.getBottomRight());
        handle.move(10, 20);
        assertEquals(new Point(11, 22), handle.getTopLeft());
        assertEquals(new Point(12, 24), handle.getBottomRight());
    }
}