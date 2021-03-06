package com.theplains;

import com.theplains.gameobjects.DynamicGameObject;
import com.theplains.gameobjects.StaticGameObject;

import java.util.ArrayList;

public class GameObjectController {

    private ArrayList<StaticGameObject> staticObjects = new ArrayList<>();
    private ArrayList<DynamicGameObject> dynamicObjects = new ArrayList<>();

    public void addStaticObject(StaticGameObject o) {
        if (o == null) throw new NullPointerException("StaticGameObject cannot be null");

        staticObjects.add(o);
    }

    public void addDynamicObject(DynamicGameObject o) {
        if (o == null) throw new NullPointerException("DynamicGameObject cannot be null");

        dynamicObjects.add(o);
    }
}
