package com.theplains.gameobjects;

import javax.swing.*;
import java.util.Objects;

/**
 * object or entity with texture in game
 */
public abstract class GameObject<OP extends ObjectPosition> {

    /**
     * unique {@link ObjectId} to identify the {@link GameObject}
     */
    protected ObjectId id;

    /**
     * texture that can be displayed
     */
    protected ImageIcon texture;

    /**
     * position on screen where the {@link #texture} is located
     */
    protected OP position;

    @Deprecated
    public GameObject() {}

    /**
     * Constructor
     * @param position {@link #position}
     */
    public GameObject(OP position) {
        this.id = ObjectId.getUniqueId();
        this.position = position;
    }

    /**
     * @return {@link #id}
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * compares {@link GameObject}s {@link #id} to given id
     * @param id {@link ObjectId} to compare with
     */
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
