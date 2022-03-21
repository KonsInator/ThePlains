package gameobjects;

import java.util.concurrent.atomic.AtomicLong;

/**
 * unique ID for {@link GameObject}s based on {@link AtomicLong}
 */
public class ObjectId extends AtomicLong {
    private static AtomicLong idCounter = new AtomicLong();

    public static ObjectId getUniqueId() {
        return new ObjectId(idCounter.getAndIncrement());
    }

    private ObjectId(long id) {
        this.set(id);
    }
}
