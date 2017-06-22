package XOGame;


import static XOGame.Values.O;

/**
 * Created by RENT on 2017-06-22.
 */
public class Model {
    int[][] board = new int[3][3];
    public int movesCounter = 0;

    public void setChoice(Integer field, Values value) {
        Integer matrixValue = null;
        if (value == Values.X){
            matrixValue = -1;
        }
        else if (value == Values.O){
            matrixValue = 1;
        }
        board[field % 3][field / 3] = matrixValue;
        movesCounter++;
    }

    public boolean checkBoard(){
        int sumDiagonalLR = 0;
        int sumDiagonalRL = 0;
        int sumColumns = 0;
        int sumVerses = 0;

        for (int i = 0; i <=2 ; i++) {
            sumDiagonalLR += board[i][i];
        }
        for (int i = 0; i <=2 ; i++) {
            sumDiagonalRL += board[i][i -2];
        }
        if (Math.abs(sumDiagonalLR) == 3 || Math.abs(sumDiagonalRL) == 3){
            return true;
        }
        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <=2 ; j++) {
                sumColumns += board[j][i];
                sumVerses += board[i][j];
            }
            if (Math.abs(sumColumns) == 3 || Math.abs(sumVerses) == 3) {
                return true;
            }
            else {
                sumColumns = 0;
                sumVerses = 0;
            }
        }
        return false;
    }


}
