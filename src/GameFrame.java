import javax.swing.*;

public class GameFrame extends JFrame {
    /*
    The JFrame class provides the foundation for the main application window:
    It serves as a container for other components, such as a JPanel
     It is used to define the overall properties of the application window
     */
    public GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
