package XOGame;

/**
 * Hello world!
 *
 */
public class Game
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
    }
}
