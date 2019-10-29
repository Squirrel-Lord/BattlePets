/**
 * Title: Battle Pets
 *
 * Date: 10/11/2019
 *
 * Authors: Alex Ahlrichs, Ross Baldwin, Jared Hollenberger, Zexin Liu, Lincoln Schroeder
 *
 * Purpose: The Main class is used to play Battle Pets. Games can be played between two
 * or more players. At the end of each game, a player can choose to play again or quit.
 */
package TeamVierAugen;

import TeamVierAugen.Controllers.GameController;
import TeamVierAugen.Controllers.InputOutputController;

public class Main
{
    private static GameController controller = new GameController();
    private static InputOutputController ioController = new InputOutputController();

    /**
     * This method creates GameController objects to run the game.
     * @param args system arguments
     */
    public static void main(String[] args)
    {
        // run game here
        controller.run();
        while(ioController.getPlayAgain() == 1)
        {
            controller = new GameController();
            controller.run();
        }
        System.out.println("Thank you for playing!");
    }
}
