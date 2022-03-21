import javax.swing.*;

public class MainFrame extends JFrame {

    GameObjectController objectController;

    MainFrame() {

        GamePanel gamePanel = new GamePanel();

        objectController = new GameObjectController(gamePanel);

        this.add(gamePanel);
        this.setTitle("The Plains");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
