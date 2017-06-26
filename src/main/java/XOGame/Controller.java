package XOGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-06-23.
 */
public class Controller implements ActionListener {
    Model model;
    View view;
    int counter = 1;
    boolean isX_Turn;
    char [][] Scoreboard;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        Scoreboard = new char[3][3];
        addActionListeners();
    }

    private void addActionListeners() {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                view.buttons[j][i].addActionListener(this);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        counter++;
        if (counter % 2 == 0) {
            isX_Turn = true;
        } else {
            isX_Turn = false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (view.buttons[i][j] == event.getSource()) {
                    view.chooseLocation(i, j, isX_Turn);
                    fillScoreBoard(i, j, isX_Turn);
                    view.buttons[i][j].removeActionListener(this);
                }
            }
        }
        if (model.checkBoard(Scoreboard, 'X'))
            view.gameOver();
        if (model.checkBoard(Scoreboard, 'O'))
            view.gameOver();
        if (model.checkDraw(Scoreboard))
            view.Draw();
    }
    public void fillScoreBoard(int X_Coordinate, int Y_Coordinate, boolean isX_Turn){
        if (isX_Turn) {
            Scoreboard[X_Coordinate][Y_Coordinate] = 'X';
        }else{
            Scoreboard[X_Coordinate][Y_Coordinate] = 'O';
        }
    }
}
