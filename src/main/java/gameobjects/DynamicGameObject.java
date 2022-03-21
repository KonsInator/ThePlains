package gameobjects;

/**
 * {@inheritDoc}
 * {@link GameObject} with {@link DynamicPosition}
 */
public class DynamicGameObject extends GameObject<DynamicPosition>{

    public DynamicGameObject(DynamicPosition position) {
        super(position);
    }

    /**
     * deligates method to {@link #position}
     * @param dx shifts the {@link #position} in x-direction
     * @param dy shifts the {@link #position} in y-direction
     */
    public void move(int dx, int dy) {
        position.move(dx, dy);
    }
}
