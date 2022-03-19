import gameobjects.DynamicGameObject;
import gameobjects.StaticGameObject;

import java.util.ArrayList;

public class GameObjectController {

    private GamePanel panel;

    private ArrayList<StaticGameObject> staticObjects = new ArrayList<>();
    private ArrayList<DynamicGameObject> dynamicObjects = new ArrayList<>();

    public GameObjectController(GamePanel panel) {
        this.panel = panel;
    }

    public void addStaticObject(StaticGameObject o) {
        if (o == null) throw new NullPointerException("StaticGameObject cannot be null");

        staticObjects.add(o);
    }

    public void addDynamicObject(DynamicGameObject o) {
        if (o == null) throw new NullPointerException("DynamicGameObject cannot be null");

        dynamicObjects.add(o);
    }

    public void repaintObjects() {
        panel.repaint();
    }
}
