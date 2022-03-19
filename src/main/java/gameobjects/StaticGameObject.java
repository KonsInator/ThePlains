package gameobjects;

/**
 * {@inheritDoc}
 * {@link GameObject} with {@link StaticPosition}
 */
public class StaticGameObject extends GameObject{
    private StaticPosition position;

    @Deprecated
    public StaticGameObject() {}

    public StaticGameObject(StaticPosition position) {
        this.position = position;
    }

    @Override
    public ObjectPosition getPosition() {
        return position;
    }
}
