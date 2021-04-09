package csc439team1.blackjack.view;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.model.PlayerBase;

/**
 * The View class is an abstract class that contains methods that will be used
 * for displaying input and output to the user. This class is a template for CLIView.
 *
 * @author Justin Gallagher
 * @version 0.3
 */
public abstract class ViewBase
{
    /**
     * A display message output that indicates a game of Blackjack has begun.
     */
    public abstract void displayStartGame();

    /**
     * A display message that outputs the hand to the user. If the given player is an instance
     * of the Player class, it will show the current player's hand. Otherwise, the dealer's hand is
     * shown.
     *
     * @param player abstract player determines which hand to show
     * @param score integer containing the score of the player
     */
    public abstract void displayHand(PlayerBase player, int score);

    /**
     * A display message output that indicates the user has quit the game.
     */
    public abstract void displayQuit();

    /**
     * A display message output that indicates the game is over.
     */
    public abstract void displayGameOver();

    /**
     * A display message output that indicates whether the player or the dealer has won the game.
     *
     * @param player abstract player used to determine which player has won
     */
    public abstract void displayWinner(PlayerBase player);

    /**
     * A display message output that indicates whether the player or the dealer busts.
     *
     * @param player abstract player used to determine which player busts
     */
    public abstract void displayBust(PlayerBase player);

    /**
     * A display message output that indicates the score of the given player.
     *
     * @param player abstract player used to determine which player's score to output
     */
    public abstract void displayScore(PlayerBase player);

    /**
     * A display output message that indicates a tie has occurred in the game.
     *
     * @param score the score of the tied game
     */
    public abstract void displayTie(int score);

    /**
     * A display output message that indicates a hit has occurred in the game.
     *
     * @param player abstract player used to determine which player's hit to output
     */
    public abstract void displayHit(PlayerBase player);

    /**
     * A display output message that indicates a stand has occurred in the game.
     *
     * @param player abstract player used to determine which player's stand to output
     */
    public abstract void displayStand(PlayerBase player);

    /**
     * A display prompt that asks the player for the amount of chips they wish to buy.
     *
     * @return the number of chips purchased by the player
     */
    public abstract int promptBuyChips();

    /**
     * A display prompt that asks the player for the amount they are willing to bet.
     *
     * @return the amount the player will bet
     */
    public abstract int promptPlayerBet();

    /**
     * A display prompt that gives the player a list of actions that they will choose from to
     * proceed with the game. Actions include HIT and STAND.
     *
     * @param actions contains the hit and stand actions
     * @return the selected action
     */
    public abstract Action promptAction(Action... actions);

    /**
     * A display prompt that gives the player a choice to either continue playing or to
     * stop the game.
     *
     * @return the selected action of the user determining if they will continue playing or not
     */
    public abstract boolean promptKeepPlaying();

    /**
     * A display output message that indicates a double has occurred in the game.
     */
	public abstract void displayDouble();
}
