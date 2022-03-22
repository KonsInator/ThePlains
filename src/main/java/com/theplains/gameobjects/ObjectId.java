package com.theplains.gameobjects;

import java.util.concurrent.atomic.AtomicLong;

/**
 * unique ID for {@link GameObject}s based on {@link AtomicLong}
 */
public class ObjectId extends Number {
    private static AtomicLong idCounter = new AtomicLong();

    /**
     * Constructs an {@link ObjectId} with unique {@literal long} value
     * @return {@link ObjectId} with unique {@literal long} value
     */
    public static ObjectId getUniqueId() {
        return new ObjectId(idCounter.getAndIncrement());
    }

    /**
     * resets the {@link #idCounter} to zero
     */
    public static void resetIdCounter() {
        idCounter.set(0);
    }

    /**
     * the id value
     */
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
     * To get the actual {@link #value} in {@literal long} use {@link #value()} instead!
     * @return {@link #value} cast to {@literal int}
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
     * To get the actual {@link #value} in {@literal long} use {@link #value()} instead!
     * @return {@link #value} cast to {@literal float}
     */
    @Override
    public float floatValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     * To get the actual {@link #value} in {@literal long} use {@link #value()} instead!
     * @return {@link #value} cast to {@literal double}
     */
    @Override
    public double doubleValue() {
        return value;
    }
}
