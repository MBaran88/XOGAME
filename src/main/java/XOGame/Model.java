package XOGame;

/**
 * Created by RENT on 2017-06-22.
 */
public class Model {

    public int movesCounter;
    public String userSymbol;

    public Model(){
        movesCounter = 0;
    }

    public void setChoice(){
        if (movesCounter % 2==0){
            userSymbol = "X";
        }
        else userSymbol = "0";
    }
    public void incrementMovesCounter(){
        movesCounter++;
    }
}
