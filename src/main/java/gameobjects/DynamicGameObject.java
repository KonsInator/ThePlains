package gameobjects;

/**
 * {@inheritDoc}
 * {@link GameObject} with {@link DynamicPosition}
 */
public class DynamicGameObject extends GameObject{
    private DynamicPosition position;

    @Deprecated
    public DynamicGameObject() {}

    public DynamicGameObject(DynamicPosition position) {
        this.id = ObjectId.getUniqueId();
        this.position = position;
    }

    public void move(int dx, int dy) {
        position.move(dx, dy);
    }

    @Override
    public ObjectPosition getPosition() {
        return position;
    }
}
