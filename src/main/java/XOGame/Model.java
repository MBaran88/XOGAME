package XOGame;


/**
 * Created by RENT on 2017-06-22.
 */
public class Model {
    public static final char DefaultCharInit = '\u0000';

    /*[2,0] [2,1] [2,2]
      [1,0] [1,1] [1,2]
      [0,0] [0,1] [0,2]
     */
    public boolean checkBoard(char board[][], char symbol) {
        if (checkDiagonals(board, symbol) || checkCols(board, symbol) || checkRows(board, symbol))
            return true;
        return false;
    }

    public boolean checkDraw(char board[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (board[i][j] == DefaultCharInit)
                    return false;
            }
        }
        return true;
    }

    public boolean checkDiagonals(char board[][], char symbol) {
        int TLDiagonal = 0;
        int BLDiagonal = 0;

        for (int i = 0; i <2 ; i++) {
            if (board[i][i]==symbol)
                TLDiagonal++;
        }
        if (TLDiagonal==3){
            return true;
        }
        for (int i = 0; i <2 ; i++) {
            if (board[i][2-i]==symbol)
                BLDiagonal++;
            }
        if (BLDiagonal == 3){
                return true;
        }
        return false;
        }
    public boolean checkCols(char board[][],char symbol){
        int sumCols = 0;
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2; j++) {
                if (symbol==board[i][j])
                    sumCols++;
                if (sumCols==3){
                    return true;
                }
            }
        sumCols=0;
        }
        return false;
    }

}

