package csc439team1.blackjack.view;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.PlayerBase;

import java.io.IOException;

public class TestView extends ViewBase
{
	private int bet = 100, chips = 1000;
	private Action action = Action.HIT;

	/**
	 * A display message output that indicates a game of Blackjack has begun.
	 */
	@Override
	public void displayStartGame() { }

	/**
	 * A display message that outputs the hand to the user. If the given player is an instance
	 * of the Player class, it will show the current player's hand. Otherwise, the dealer's hand is
	 * shown.
	 *
	 * @param player abstract player determines which hand to show
	 * @param score  integer containing the score of the player
	 */
	@Override
	public void displayHand(PlayerBase player, int score) { }

	/**
	 * A display message output that indicates the user has quit the game.
	 */
	@Override
	public void displayQuit() { }

	/**
	 * A display message output that indicates the game is over.
	 */
	@Override
	public void displayGameOver() { }

	/**
	 * A display message output that indicates whether the player or the dealer has won the game.
	 *
	 * @param player abstract player used to determine which player has won
	 */
	@Override
	public void displayWinner(PlayerBase player) { }

	/**
	 * A display message output that indicates whether the player or the dealer busts.
	 *
	 * @param player abstract player used to determine which player busts
	 */
	@Override
	public void displayBust(PlayerBase player) { }

	/**
	 * A display message output that indicates the score of the given player.
	 *
	 * @param player abstract player used to determine which player's score to output
	 */
	@Override
	public void displayScore(PlayerBase player) { }

	/**
	 * A display output message that indicates a tie has occurred in the game.
	 *
	 * @param score the score of the tied game
	 */
	@Override
	public void displayTie(int score) { }

	/**
	 * A display output message that indicates a hit has occurred in the game.
	 */
	@Override
	public void displayHit() { }

	/**
	 * A display output message that indicates a stand has occurred in the game.
	 */
	@Override
	public void displayStand() { }

	/**
	 * A display prompt that asks the player for the amount of chips they wish to buy.
	 *
	 * @return the number of chips purchased by the player
	 */
	@Override
	public int promptBuyChips() throws IOException
	{
		return chips;
	}

	/**
	 * A display prompt that asks the player for the amount they are willing to bet.
	 *
	 * @return the amount the player will bet
	 */
	@Override
	public int promptPlayerBet() throws IOException
	{
		return bet;
	}

	/**
	 * A display prompt that gives the player a list of actions that they will choose from to
	 * proceed with the game. Actions include HIT, STAND, and DOUBLE.
	 *
	 * @param actions contains the hit, stand, and double actions
	 * @return the selected action
	 */
	@Override
	public Action promptAction(Action... actions) throws IOException
	{
		return action;
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
		return true;
	}

	/**
	 * Set the bet field for testing.
	 *
	 * @param bet the new bet value.
	 */
	public void setBet(int bet)
	{
		this.bet = bet;
	}

	/**
	 * Set the chips field for testing.
	 *
	 * @param chips the new chips value.
	 */
	public void setChips(int chips)
	{
		this.chips = chips;
	}

	/**
	 * Set the action field for testing.
	 *
	 * @param action the new action value.
	 */
	public void setAction(Action action)
	{
		this.action = action;
	}
}
