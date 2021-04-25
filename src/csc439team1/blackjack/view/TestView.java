package csc439team1.blackjack.view;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.PlayerBase;

import java.util.logging.Logger;

public class TestView extends ViewBase
{
	private int bet = 100, chips = 1000;
	private Action action = Action.HIT;
	private boolean keepPlaying = false;
	private final Logger logger = Logger.getLogger(this.getClass().getName());


	/**
	 * A display message output that indicates a game of Blackjack has begun.
	 */
	@Override
	public void displayStartGame() {
		logger.entering(getClass().getName(), "displayStartGame");
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
	public void displayHand(PlayerBase player, int score) {
		logger.entering(getClass().getName(), "displayHand");
		logger.exiting(getClass().getName(), "displayHand"); }

	/**
	 * A display message output that indicates the user has quit the game.
	 */
	@Override
	public void displayQuit() {
		logger.entering(getClass().getName(), "displayQuit");
		logger.exiting(getClass().getName(), "displayQuit");
	}

	/**
	 * A display message output that indicates the game is over.
	 */
	@Override
	public void displayGameOver() {
		logger.entering(getClass().getName(), "displayGameOver");
		logger.exiting(getClass().getName(), "displayGameOver");
	}

	/**
	 * A display message output that indicates whether the player or the dealer has won the game.
	 *
	 * @param player abstract player used to determine which player has won
	 */
	@Override
	public void displayWinner(PlayerBase player) {
		logger.entering(getClass().getName(), "displayWinner");
		logger.exiting(getClass().getName(), "displayWinner");
	}

	/**
	 * A display message output that indicates whether the player or the dealer busts.
	 *
	 * @param player abstract player used to determine which player busts
	 */
	@Override
	public void displayBust(PlayerBase player) {
		logger.entering(getClass().getName(), "displayBust");
		logger.exiting(getClass().getName(), "displayBust");
	}

	/**
	 * A display message output that indicates the score of the given player.
	 *
	 * @param player abstract player used to determine which player's score to output
	 */
	@Override
	public void displayScore(PlayerBase player) {
		logger.entering(getClass().getName(), "displayScore");
		logger.exiting(getClass().getName(), "displayScore");
	}

	/**
	 * A display output message that indicates a tie has occurred in the game.
	 *
	 * @param score the score of the tied game
	 */
	@Override
	public void displayTie(int score) {
		logger.entering(getClass().getName(), "displayTie");
		logger.exiting(getClass().getName(), "displayTie");
	}

	/**
	 * A display output message that indicates a hit has occurred in the game.
	 */
	@Override
	public void displayHit(PlayerBase player) {
		logger.entering(getClass().getName(), "displayHit");
		logger.exiting(getClass().getName(), "displayHit");
	}

	/**
	 * A display output message that indicates a stand has occurred in the game.
	 */
	@Override
	public void displayStand(PlayerBase player) {
		logger.entering(getClass().getName(), "displayStand");
		logger.exiting(getClass().getName(), "displayStand"); }

	/**
	 * A display prompt that asks the player for the amount of chips they wish to buy.
	 *
	 * @return the number of chips purchased by the player
	 */
	@Override
	public int promptBuyChips()
	{
		logger.entering(getClass().getName(), "promptBuyChips");
		logger.exiting(getClass().getName(), "promptBuyChips");
		return chips;
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
		logger.exiting(getClass().getName(), "promptPlayerBet");
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
	public Action promptAction(Action... actions)
	{
		logger.entering(getClass().getName(), "promptAction");
		logger.exiting(getClass().getName(), "promptAction");
		return action;
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
		if (!keepPlaying)
		{
			logger.info("Player chose to keep playing");
			keepPlaying = true;

			logger.exiting(getClass().getName(), "promptKeepPlaying");
			return true;
		}
		else {
			logger.info("Player chose not to keep playing");
			logger.exiting(getClass().getName(), "promptKeepPlaying");
			return false;
		}
	}

	/**
	 * A display output message that indicates a double has occurred in the game.
	 */
	@Override
	public void displayDouble() {
		logger.entering(getClass().getName(), "displayDouble");
		logger.exiting(getClass().getName(), "displayDouble");
	}

	/**
	 * Set the bet field for testing.
	 *
	 * @param bet the new bet value.
	 */
	public void setBet(int bet)
	{
		logger.entering(getClass().getName(), "setBet");
		this.bet = bet;
		logger.exiting(getClass().getName(), "setBet");
	}

	/**
	 * Set the chips field for testing.
	 *
	 * @param chips the new chips value.
	 */
	public void setChips(int chips)
	{
		logger.entering(getClass().getName(), "setChips");
		this.chips = chips;
		logger.exiting(getClass().getName(), "setChips");
	}

	/**
	 * Set the action field for testing.
	 *
	 * @param action the new action value.
	 */
	public void setAction(Action action)
	{
		logger.entering(getClass().getName(), "setAction");
		this.action = action;
		logger.exiting(getClass().getName(), "setAction");
	}
}
