package gameobjects;

import javax.swing.*;
import java.util.Objects;

/**
 * object or entity with texture in game
 */
public abstract class GameObject<OP extends ObjectPosition> {

    protected ObjectId id;
    protected ImageIcon texture;
    protected OP position;

    @Deprecated
    public GameObject() {}

    public GameObject(OP position) {
        this.id = ObjectId.getUniqueId();
        this.position = position;
    }

    public ObjectId getId() {
        return id;
    }

    public boolean hasId(ObjectId id) {
        return Objects.equals(id, this.id);
    }

    public ImageIcon getTexture() {
        return texture;
    }

    public void setTexture(ImageIcon texture) {
        this.texture = texture;
    }

    public int getWidth() {
        if (texture == null) {
            return 0;
        } else {
            return texture.getIconWidth();
        }
    }

    public int getHeight() {
        if (texture == null) {
            return 0;
        } else {
            return texture.getIconHeight();
        }
    }

    public OP getPosition() {
        return position;
    }
}
