package csc439team1.blackjack.view;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.model.PlayerBase;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The CLIView class is an is the class that interacts with the user by displaying output to
 * the command line. It extends the View class.
 *
 * @author Justin Gallagher
 * @version 0.3
 */
public class CLIView extends ViewBase
{
    Scanner input;
    private final Logger logger;

    /**
     * Sets up the console scanner for the view.
     */
    public CLIView()
    {
        logger = Logger.getLogger(this.getClass().getName());
        logger.entering(getClass().getName(), "CLIView constructor");
        input = new Scanner(System.in);
        logger.exiting(getClass().getName(), "CLIView constructor");

    }

    /**
     * A display message output that indicates a game of Blackjack has begun.
     */
    @Override
    public void displayStartGame()
    {
        logger.entering(getClass().getName(), "displayStartGame");
        System.out.println("Welcome to Blackjack! The game will now begin.");
        System.out.println("First, we will buy chips so you can begin betting.");
        System.out.println("Note that you can type 'quit' and hit the ENTER key anytime to exit the game.");
        logger.exiting(getClass().getName(), "displayStartGame");
    }

    /**
     * A display message that outputs the hand to the user. If the given player is an instance
     * of the Player class, it will show the current player's hand. Otherwise, the dealer's hand is
     * shown.
     *
     * @param player abstract player determines which hand to show
     * @param score  integer containing the score of the player
     */
    @Override
    public void displayHand(PlayerBase player, int score)
    {
        logger.entering(getClass().getName(), "displayHand");
        if (player instanceof Player)
        {
            System.out.println("Your current hand score: " + score);
            System.out.println("Your current hand : " + Arrays.toString(player.getHand().getCards().toArray()));
        }
        else
            System.out.println("The dealer's hand : " + Arrays.toString(player.getHand().getCards().toArray()));
        logger.exiting(getClass().getName(), "displayHand");
    }

    /**
     * A display message output that indicates the user has quit the game.
     */
    @Override
    public void displayQuit()
    {
        logger.entering(getClass().getName(), "displayHand");
        System.out.println("Quitting game now, thank you for playing!");
        logger.exiting(getClass().getName(), "displayHand");
    }

    /**
     * A display message output that indicates the game is over.
     */
    @Override
    public void displayGameOver()
    {
        System.out.println("Game over!");
    }

    /**
     * A display message output that indicates whether the player or the dealer has won the game.
     *
     * @param player abstract player used to determine which player has won
     */
    @Override
    public void displayWinner(PlayerBase player)
    {
        logger.entering(getClass().getName(), "displayWinner");
        if (player instanceof Player)
            System.out.println("You win! Score: " + player.score());
        else
            System.out.println("Dealer wins! Score: " + player.score());
        logger.exiting(getClass().getName(), "displayWinner");
    }

    /**
     * A display message output that indicates whether the player or the dealer busts.
     *
     * @param player abstract player used to determine which player busts
     */
    @Override
    public void displayBust(PlayerBase player)
    {
        logger.entering(getClass().getName(), "displayBust");
        if (player instanceof Player)
            System.out.println("You bust!");
        else
            System.out.println("Dealer bust! Score: " + player.score());
        logger.exiting(getClass().getName(), "displayWinner");
    }

    /**
     * A display message output that indicates the score of the given player.
     *
     * @param player abstract player used to determine which player's score to output
     */
    @Override
    public void displayScore(PlayerBase player)
    {
        logger.entering(getClass().getName(), "displayScore");
        if (player instanceof Player)
            System.out.println("Your current score is: " + player.score());
        else
            System.out.println("The dealer's current score is: " + player.score());
        logger.exiting(getClass().getName(), "displayScore");
    }

    /**
     * A display output message that indicates a tie has occurred in the game.
     *
     * @param score the score of the tied game
     */
    @Override
    public void displayTie(int score)
    {
        logger.entering(getClass().getName(), "displayTie");
        System.out.println("Tie! Score: " + score);
        logger.exiting(getClass().getName(), "displayTie");
    }

    /**
     * A display output message that indicates a hit has occurred in the game.
     *
     * @param player abstract player used to determine which player's hit to output
     */
    @Override
    public void displayHit(PlayerBase player)
    {
        logger.entering(getClass().getName(), "displayHit");
        if (player instanceof Player)
            System.out.println("You hit!");
        else
            System.out.println("Dealer hit!");
        logger.exiting(getClass().getName(), "displayHit");
    }

    /**
     * A display output message that indicates a stand has occurred in the game.
     *
     * @param player abstract player used to determine which player's stand to output
     */
    @Override
    public void displayStand(PlayerBase player)
    {
        logger.entering(getClass().getName(), "displayStand");

        if (player instanceof Player)
            System.out.println("You stand!");
        else
            System.out.println("Dealer stand!");
        logger.exiting(getClass().getName(), "displayStand");

    }

    /**
     * A display prompt that asks the player for the amount of chips they wish to buy.
     *
     * @return the number of chips purchased by the player
     */
    @Override
    public int promptBuyChips()
    {
        logger.entering(getClass().getName(), "promptBuyChips");

        System.out.print("How many chips would you like to buy?: ");

        logger.exiting(getClass().getName(), "promptBuyChips");
        return validateInteger(lineScanner());
    }

    /**
     * A display prompt that asks the player for the amount they are willing to bet.
     *
     * @return the amount the player will bet
     */
    @Override
    public int promptPlayerBet()
    {
        logger.entering(getClass().getName(), "promptPlayerBet");

        System.out.println("How many chips would you like to bet?");
        System.out.print("(Note that this game only allows bets from 10-500 chips): ");

        logger.exiting(getClass().getName(), "promptPlayerBet");
        return validateInteger(lineScanner());
    }

    /**
     * A display prompt that gives the player a list of actions that they will choose from to
     * proceed with the game. Actions include HIT and STAND.
     *
     * @param actions contains the hit and stand actions
     * @return the selected action
     */
    @Override
    public Action promptAction(Action... actions)
    {
        logger.entering(getClass().getName(), "promptAction");

        Action returnedAction;
        String line;
        System.out.print("Type one of the following to make a choice: " + Arrays.toString(actions) + " ");

        while (true)
        {
            try
            {
                line = lineScanner();
                returnedAction = Action.valueOf(line.toUpperCase());

                if (!Arrays.asList(actions).contains(returnedAction))
                    System.out.println("That is not allowed, try again: " + Arrays.toString(actions));
                else {
                    logger.exiting(getClass().getName(), "promptAction");
                    return returnedAction;
                }
            }
            catch (IllegalArgumentException e)
            {
                logger.warning("CLIView promptAction: " + e.getMessage());
                System.out.print("Input not valid, try again: " + Arrays.toString(actions));
            }
        }
    }

    /**
     * A display prompt that gives the player a choice to either continue playing or to
     * stop the game.
     *
     * @return the selected action of the user determining if they will continue playing or not
     */
    @Override
    public boolean promptKeepPlaying()
    {
        logger.entering(getClass().getName(), "promptKeepPlaying");
        System.out.print("Would you like to keep playing? [Y/N]: ");
        String line;

        while (true)
        {
            line = lineScanner();

            if (line.equalsIgnoreCase("Y")) {
                logger.exiting(getClass().getName(), "promptKeepPlaying");
                return true;
            }
            else if (line.equalsIgnoreCase("N")) {
                logger.exiting(getClass().getName(), "promptKeepPlaying");
                return false;
            }
            else
                System.out.print("Input not valid, try again: ");
        }
    }

    /**
     * A display output message that indicates a double has occurred in the game.
     */
    @Override
    public void displayDouble()
    {
        logger.entering(getClass().getName(), "displayDouble");
        System.out.println("You doubled your bet!");
        logger.exiting(getClass().getName(), "displayDouble");
    }

    /**
     * A helper method that assists prompt methods with scanning input. Checks for quit.
     *
     * @return the input from the line
     */
    public String lineScanner()
    {
        logger.entering(getClass().getName(), "lineScanner");
        logger.info("Reading input from player");
        String line = input.nextLine();

        if (line.equalsIgnoreCase("quit"))
        {
            logger.info("Player has chosen to quit the game, closing the program...");
            displayQuit();
            System.exit(0);
        }
        logger.exiting(getClass().getName(), "lineScanner");
        return line;
    }

    /**
     * A helper method that assists prompt methods with validating integer input.
     *
     * @param str the input to be validated
     * @return the validated input
     */

    public int validateInteger(String str)
    {
        int result;
        logger.entering(getClass().getName(), "validateInteger");

        while (true) {
            try {
                result = Integer.parseInt(str);
                logger.exiting(getClass().getName(), "validateInteger");
                return result;
            } catch (NumberFormatException ex) {
                logger.warning("CLIView validateInteger: " + ex.getMessage());
                System.out.print("Integer input not valid, try again: ");
                str = lineScanner();
            }
        }
    }
}