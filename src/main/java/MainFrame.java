import gameobjects.GameObjectController;

import javax.swing.*;

public class MainFrame extends JFrame {

    GameObjectController objectController;

    MainFrame() {

        JPanel gamePanel = new JPanel();

        objectController = new GameObjectController(gamePanel);

        this.add(gamePanel);
        this.setTitle("The Plains");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
