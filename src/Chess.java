import javax.swing.*;
import java.awt.*;

public class Chess extends JFrame {

    public Chess(){
        super("My really cool chess program");
        GamePanel gamePanel = new GamePanel();
        ButtonPanel buttonPanel = new ButtonPanel();
        Container window = getContentPane();
        window.add(gamePanel, BorderLayout.CENTER);
        window.add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {

        Chess game = new Chess();
        game.setBounds(50,50,1024,768);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);

    }
}