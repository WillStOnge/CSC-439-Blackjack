package csc439team1.blackjack.view;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Card;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.model.PlayerBase;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The CLIView class is an is the class that interacts with the user by displaying output to
 * the command line. It extends the View class.
 *
 * @author Justin Gallagher
 * @version 0.3
 */
public class CLIView extends ViewBase
{
    Scanner input = new Scanner(System.in);

    /**
     * A display message output that indicates a game of Blackjack has begun.
     */
    @Override
    public void displayStartGame()
    {
        System.out.println("Welcome to Blackjack! The game will now begin.");
        System.out.println("First, we will buy chips so you can begin betting.");
        System.out.println("Note that you can type 'quit' and hit the ENTER key anytime to exit the game.");
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
        if (player instanceof Player)
        {
            System.out.println("Your current hand score: " + score);
            System.out.print("Your current hand : ");
            System.out.print("[ ");
            for (Card card : player.getHand().getCards())
            {
                String cardString = card.getNumber().toString() + " of " + card.getSuit().toString();
                System.out.printf("%s ", cardString);
            }
        }
        else
        {
            System.out.print("The Dealer's hand : ");
            System.out.print("[ ");
            for (Card card : player.getHand().getCards())
            {
                if (!card.isHidden())
                {
                    String cardString = card.getNumber().toString() + " of " + card.getSuit().toString();
                    System.out.printf("%s ", cardString);
                }
                else
                {
                    System.out.print("### of ### ");
                }
            }
        }
        System.out.print(" ]");
    }

    /**
     * A display message output that indicates the user has quit the game.
     */
    @Override
    public void displayQuit()
    {
        System.out.println("Quitting game now, thank you for playing!");
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
        if (player instanceof Player)
        {
            System.out.println("You win! Score: " + player.score());
        }
        else
        {
            System.out.println("Dealer wins! Score: " + player.score());
        }
    }

    /**
     * A display message output that indicates whether the player or the dealer busts.
     *
     * @param player abstract player used to determine which player busts
     */
    @Override
    public void displayBust(PlayerBase player)
    {
        if (player instanceof Player)
        {
            System.out.println("You bust!");
        }
        else
        {
            System.out.println("Dealer bust! Score: " + player.score());
        }
    }

    /**
     * A display message output that indicates the score of the given player.
     *
     * @param player abstract player used to determine which player's score to output
     */
    @Override
    public void displayScore(PlayerBase player)
    {
        if (player instanceof Player)
        {
            System.out.println("Your current score is: " + player.score());
        }
        else
        {
            System.out.println("The dealer's current score is: " + player.score());
        }
    }

    /**
     * A display output message that indicates a tie has occurred in the game.
     *
     * @param score the score of the tied game
     */
    @Override
    public void displayTie(int score)
    {
        System.out.println("Tie! Score: " + score);
    }

    /**
     * A display output message that indicates a hit has occurred in the game.
     */
    @Override
    public void displayHit()
    {
        System.out.println("You hit!");
    }

    /**
     * A display output message that indicates a stand has occurred in the game.
     */
    @Override
    public void displayStand()
    {
        System.out.println("You stand!");
    }

    /**
     * A display prompt that asks the player for the amount of chips they wish to buy.
     *
     * @return the number of chips purchased by the player
     */
    @Override
    public int promptBuyChips() throws IOException
    {
        System.out.print("How many chips would you like to buy?: ");
        String line = input.nextLine();
        return validateInteger(line);
    }

    /**
     * A display prompt that asks the player for the amount they are willing to bet.
     *
     * @return the amount the player will bet
     */
    @Override
    public int promptPlayerBet() throws IOException
    {
        System.out.println("How many chips would you like to bet?");
        System.out.print("(Note that this game only allows bets from 10-500 chips): ");
        String line = input.nextLine();
        return validateInteger(line);
    }

    /**
     * A display prompt that gives the player a list of actions that they will choose from to
     * proceed with the game. Actions include HIT and STAND.
     *
     * @param actions contains the hit and stand actions
     * @return the selected action
     */
    @Override
    public Action promptAction(Action... actions) throws IOException
    {
        boolean acceptInput = false;
        Action returnedAction = null;
        System.out.print("Type one of the following to make a choice: " + Arrays.toString(actions));
        String line = input.nextLine();

        while (!acceptInput)
        {
            if (line.equalsIgnoreCase("HIT"))
            {
                returnedAction = Action.HIT;
            }
            else if (line.equalsIgnoreCase("STAND"))
            {
                returnedAction = Action.STAND;
            }
            else
            {
                System.out.print("Input not valid, try again: ");
                line = input.nextLine();
            }


            if (!Arrays.asList(actions).contains(returnedAction))
            {
                System.out.println("That is not allowed, try again: " + Arrays.toString(actions));
                line = input.nextLine();
            }
            else
            {
                acceptInput = true;
            }
        }
        return returnedAction;
    }

    /**
     * A display prompt that gives the player a choice to either continue playing or to
     * stop the game.
     *
     * @return the selected action of the user determining if they will continue playing or not
     */
    @Override
    public boolean promptKeepPlaying() throws IOException
    {
        System.out.print("Would you like to keep playing? [Y/N]: ");
        String line = input.nextLine();
        while (true)
        {
            if (line.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if (line.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.print("Input not valid, try again: ");
                line = input.nextLine();
            }
        }
    }

    /**
     * A helper method that assists prompt methods with validating integer input.
     *
     * @param str the input to be validated
     * @return the validated input
     */
    public int validateInteger(String str) throws IOException
    {
        int s;
        while (true)
        {
            try
            {
                s = Integer.parseInt(str);
                return s;
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Input not valid, try again: ");

                //TODO should I add a check for 'quit'?

                str = input.nextLine();
            }
        }
    }
}
