package gameobjects;

import javax.swing.*;
import java.util.UUID;

/**
 * object or entity with texture in game
 */
public abstract class GameObject {

    private ImageIcon texture;

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

    public abstract ObjectPosition getPosition();
}
