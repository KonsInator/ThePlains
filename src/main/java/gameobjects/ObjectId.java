package gameobjects;

import java.util.concurrent.atomic.AtomicLong;

/**
 * unique ID for {@link GameObject}s based on {@link AtomicLong}
 */
public class ObjectId extends Number {
    private static AtomicLong idCounter = new AtomicLong();

    public static ObjectId getUniqueId() {
        return new ObjectId(idCounter.getAndIncrement());
    }

    private final long value;

    private ObjectId(long value) {
        this.value = value;
    }

    /**
     * Method that should be used to get the actual long {@link #value} of the {@link ObjectId}
     * @return the actual long value
     */
    public long value() {
        return value;
    }

    /**
     * {@inheritDoc}
     * To get the actual {@link #value} in {@link long} use {@link #value()} instead!
     * @return {@link #value} cast to {@link int}
     */
    @Override
    public int intValue() {
        return (int)value;
    }

    /**
     * {@inheritDoc}
     * To get the actual {@link #value} use {@link #value()} instead!
     * @return
     */
    @Override
    public long longValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     * To get the actual {@link #value} in {@link long} use {@link #value()} instead!
     * @return {@link #value} cast to {@link float}
     */
    @Override
    public float floatValue() {
        return (float)value;
    }

    /**
     * {@inheritDoc}
     * To get the actual {@link #value} in {@link long} use {@link #value()} instead!
     * @return {@link #value} cast to {@link double}
     */
    @Override
    public double doubleValue() {
        return (double)value;
    }
}
