package gameobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

/**
 * Collection of {@link GameObject}s
 * @param <GO>
 */
public class GameObjectCollection<GO extends GameObject> extends ArrayList<GO> {

    public GameObjectCollection(Collection<? extends GO> c) {
        super(c);
    }

    /**
     * get a {@link GO} out of Collection with given id
     * @return {@link GO} with id or {@literal null} if there is no object with given id in collection
     */
    public Optional<GO> getById(ObjectId id) {
        for (GO o : this) {
           if (o.hasId(id)) {
               return Optional.of(o);
           }
        }
        return Optional.empty();
    }

    /**
     * remove a {@link GO} out of collection with given id
     * @return {@literal true} if an element has been removed
     */
    public boolean removeById(ObjectId id) {
        return this.removeIf(go -> go.hasId(id));
    }

    /**
     * remove a {@link GO} out of collection with given id
     * @return the removed element in {@link Optional<GO>}
     */
    public Optional<GO> removeAndGetById(ObjectId id) {
        for (GO o : this) {
            if (o.hasId(id)) {
                this.remove(o);
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
