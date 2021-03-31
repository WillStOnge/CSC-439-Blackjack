package csc439team1.blackjack.model;

/**
 * The PlayerBase abstract class gives base functionality for Player and Dealer alike.
 *
 * @author Alex Smithson
 * @version 0.3
 **/
public abstract class PlayerBase
{
	private final Hand hand;

	/**
	 * Constructor for the abstract player base class.
	 */
	public PlayerBase()
	{
		hand = new Hand();
	}

	/**
	 * This method gets the score of all of the cards in the hand. Automatically reduces aces value from 11 to 1 if
	 * the total score is greater than 21.
	 *
	 * @return the score of the player's deck.
	 */
	public int score()
	{
		return hand.score();
	}

	/**
	 * Adds a card to the player's hand.
	 *
	 * @param card the card to add to the player's deck.
	 */
	public void addCard(Card card)
	{
		hand.addCard(card);
	}

	/**
	 * Standard getter returns the player's Hand object.
	 *
	 * @return the players hand.
	 */
	public Hand getHand()
	{
		return hand;
	}

	/**
	 * Clears the hand of the player.
	 */
	public void clearHand()
	{
		hand.getCards().clear();
	}
}