package XOGame;
import javax.swing.*;
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
        
    }
}
