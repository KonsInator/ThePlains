package gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class StaticGameObjectTest {

    private StaticGameObject o1;
    private StaticGameObject o2;

    private StaticPosition pos1;
    private StaticPosition pos2;

    @BeforeEach
    public void setUp() {
        pos1 = mock(StaticPosition.class);
        pos1 = mock(StaticPosition.class);

        o1 = new StaticGameObject(pos1);
        o2 = new StaticGameObject(pos2);
    }

    @Test
    public void testHasId() {
        assertTrue(o1.hasId(o1.getId()));
        assertFalse(o1.hasId(o2.getId()));
    }

}