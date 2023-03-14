import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){
        super();
    }

    public void paintComponent(Graphics g){
        int centerX = this.getWidth()/2;
        int centerY = this.getHeight()/2;
        g.drawString("Welcome to my game.  it is amazing.  god bless and good luck.",centerX,centerY);

    }
}
