package gameobjects;

import javax.swing.*;

public abstract class GameObject {
    private ImageIcon texture;

    public ImageIcon getTexture() {
        return texture;
    }

    public void setTexture(ImageIcon texture) {
        this.texture = texture;
    }

    public abstract ObjectPosition getPosition();
}
