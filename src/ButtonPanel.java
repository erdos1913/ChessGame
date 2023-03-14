import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    JButton startButton;
    JButton moveRedButton;
    JButton moveBlueButton;

    public ButtonPanel(){
        startButton = new JButton("Start the Game");
        moveRedButton = new JButton("Move Red");
        moveBlueButton = new JButton("Move Blue");

        startButton.addActionListener(
                new ActionListener(){

                    public void actionPerformed(ActionEvent e) {
                        System.out.println("An event happened " + e.toString());

                    }
                }
        );



        add(startButton);
        add(moveRedButton);
        add(moveBlueButton);

    }

}
