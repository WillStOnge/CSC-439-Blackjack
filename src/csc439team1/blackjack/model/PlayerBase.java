package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * The PlayerBase abstract class gives base functionality for Player and Dealer alike.
 *
 * @author Alex Smithson
 * @version 0.4
 **/
public abstract class PlayerBase
{
	private final Hand hand;
	private final Logger logger;

	/**
	 * Constructor for the abstract player base class.
	 */
	public PlayerBase()
	{
		logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "PlayerBase");
		hand = new Hand();
		logger.exiting(getClass().getName(), "PlayerBase");
	}

	/**
	 * This method gets the score of all of the cards in the hand. Automatically reduces aces value from 11 to 1 if
	 * the total score is greater than 21.
	 *
	 * @return the score of the player's deck.
	 */
	public int score()
	{
		logger.entering(getClass().getName(), "score");
		logger.exiting(getClass().getName(), "score");
		return hand.score();
	}

	/**
	 * Adds a card to the player's hand.
	 *
	 * @param card the card to add to the player's deck.
	 */
	public void addCard(Card card)
	{
		logger.entering(getClass().getName(), "addCard");
		hand.addCard(card);
		logger.exiting(getClass().getName(), "addCard");
	}

	/**
	 * Standard getter returns the player's Hand object.
	 *
	 * @return the players hand.
	 */
	public Hand getHand()
	{
		logger.entering(getClass().getName(), "getHand");
		logger.exiting(getClass().getName(), "getHand");
		return hand;
	}

	/**
	 * Clears the hand of the player.
	 */
	public void clearHand()
	{
		logger.entering(getClass().getName(), "clearHand");
		hand.getCards().clear();
		logger.exiting(getClass().getName(), "clearHand");
	}
}