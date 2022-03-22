package com.theplains.gameobjects;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

/**
 * Collection of {@link GameObject}s
 * @param <O>
 */
public class GameObjectCollection<O extends GameObject> extends HashSet<O> {

    public GameObjectCollection(Collection<? extends O> c) {
        super(c);
    }

    /**
     * get a {@link O} out of Collection with given id
     * @return {@link O} with id or {@literal null} if there is no object with given id in collection
     */
    public Optional<O> getById(ObjectId id) {
        for (O o : this) {
           if (o.hasId(id)) {
               return Optional.of(o);
           }
        }
        return Optional.empty();
    }

    /**
     * remove a {@link O} out of collection with given id
     * @return {@literal true} if an element has been removed
     */
    public boolean removeById(ObjectId id) {
        return this.removeIf(go -> go.hasId(id));
    }

    /**
     * remove a {@link O} out of collection with given id
     * @return the removed element in {@link Optional< O >}
     */
    public Optional<O> removeAndGetById(ObjectId id) {
        for (O o : this) {
            if (o.hasId(id)) {
                this.remove(o);
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
