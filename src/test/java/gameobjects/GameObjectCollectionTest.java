package gameobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class GameObjectCollectionTest {

    private GameObject o1;
    private GameObject o2;
    private GameObject o3;
    private GameObject o4;
    private GameObject o5;

    @Mock ObjectId id1;
    @Mock ObjectId id2;
    @Mock ObjectId id3;
    @Mock ObjectId id4;
    @Mock ObjectId id5;
    @Mock ObjectId id6;

    private GameObjectCollection<GameObject> collection;

    @BeforeEach
    void setUp() {
        o1 = mock(GameObject.class, Mockito.CALLS_REAL_METHODS);
        o2 = mock(GameObject.class, Mockito.CALLS_REAL_METHODS);
        o3 = mock(GameObject.class, Mockito.CALLS_REAL_METHODS);
        o4 = mock(GameObject.class, Mockito.CALLS_REAL_METHODS);
        o5 = mock(GameObject.class, Mockito.CALLS_REAL_METHODS);

        o1.id = id1;
        o2.id = id2;
        o3.id = id3;
        o4.id = id4;
        o5.id = id5;

        collection = new GameObjectCollection<>(List.of(o1, o2, o3, o4, o5));
    }

    @Test
    void testGetByIdContained() {
        assertEquals(o1, collection.getById(id1));
        assertEquals(o2, collection.getById(id2));
        assertEquals(o3, collection.getById(id3));
        assertEquals(o4, collection.getById(id4));
        assertEquals(o5, collection.getById(id5));
    }

    @Test
    void testGetByIdNotContained() {
        assertNull(collection.getById(id6));
    }

    @Test
    void testRemoveById() {
        collection.removeById(id1);
        assertFalse(collection.contains(o1));
        assertTrue(collection.containsAll(List.of(o2, o3, o4, o5)));

        collection.removeById(id6);
        assertTrue(collection.containsAll(List.of(o2, o3, o4, o5)));
    }
}