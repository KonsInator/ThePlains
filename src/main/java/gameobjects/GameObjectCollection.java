package gameobjects;

import java.util.ArrayList;
import java.util.Collection;

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
    public GO getById(ObjectId id) {
        for (GO o : this) {
           if (o.hasId(id)) {
               return o;
           }
        }
        return null;
    }

    /**
     * remove a {@link GO} out of Collection with given id
     */
    public void removeById(ObjectId id) {
        this.removeIf(go -> go.hasId(id));
    }
}
