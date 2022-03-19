import javax.swing.*;

public class MainFrame extends JFrame {

    CharacterPanel jumperPanel = new CharacterPanel();

    MainFrame() {

        this.add(jumperPanel);
        this.setTitle("The Plains");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
