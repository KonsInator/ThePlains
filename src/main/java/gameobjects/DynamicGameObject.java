package gameobjects;

/**
 * {@inheritDoc}
 * {@link GameObject} with {@link DynamicPosition}
 */
public class DynamicGameObject extends GameObject<DynamicPosition>{

    public DynamicGameObject(DynamicPosition position) {
        super(position);
    }

    public void move(int dx, int dy) {
        position.move(dx, dy);
    }
}
