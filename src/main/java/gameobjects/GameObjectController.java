package gameobjects;

import javax.swing.*;
import java.util.ArrayList;

public class GameObjectController {

    private JPanel panel;

    private ArrayList<StaticGameObject> staticObjects= new ArrayList<>();
    private ArrayList<DynamicGameObject> dynamicObjects= new ArrayList<>();

    public GameObjectController(JPanel panel) {
        this.panel = panel;
    }
}
