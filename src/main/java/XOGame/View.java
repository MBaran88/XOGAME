package XOGame;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by RENT on 2017-06-23.
 */
public class View {
    JButton[][] buttons;
    JPanel ButtonPanel;
    JFrame frame;
    JLabel Label;

    public View(){
        frame = new JFrame("X,O Game (Tic Tac Toe)");
        buttons = new JButton[3][3];
        ButtonPanel = new JPanel();
        Label = new JLabel("JLabelString");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                buttons[j][i]= new JButton("");
                ButtonPanel.add(buttons[j][i]);
            }
        }
        ButtonPanel.setLayout(new GridLayout(3,3));
        frame.add(ButtonPanel,BorderLayout.CENTER);
        frame.add(Label,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setSize(500,350);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void chooseLocation(int X_Coordinate, int Y_Coordinate, boolean isX_Turn){
        if (isX_Turn){
            buttons[X_Coordinate][Y_Coordinate].setText("X");
        } else {
          buttons[X_Coordinate][Y_Coordinate].setText("O");
        }
    }
    public void gameOver(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                buttons[j][i].setEnabled(false);
            }
        }
    Label.setText("Game Over!");
    }
    public void Draw(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                buttons[j][i].setEnabled(false);
            }
        }
    Label.setText("Draw!");
    }
}
