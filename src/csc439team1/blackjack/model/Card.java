package csc439team1.blackjack.model;

/**
 * The Card class is used to create a objects that represents a
 * single playing card from a deck and includes the following properties:
 * Number and Suit.
 *
 * @author Justin Gallagher
 * @version 0.1
 */
public class Card
{
	private final Number number;
	private final Suit suit;
	private boolean hidden;

	/**
	 * Card class constructor that sets the number and suit of the card.
	 *
	 * @param number represents the number of the card
	 * @param suit   represents the suit of the card
	 */
	public Card(Number number, Suit suit)
	{
		this.number = number;
		this.suit = suit;
		this.hidden = false;
	}

	/**
	 * Card class constructor that sets the number and suit of the card.
	 *
	 * @param number represents the number of the card
	 * @param suit   represents the suit of the card
	 * @param hidden whether the card should be hidden or not.
	 */
	public Card(Number number, Suit suit, boolean hidden)
	{
		this.number = number;
		this.suit = suit;
		this.hidden = hidden;
	}

	/**
	 * The getNumber class returns the number of the playing card.
	 *
	 * @return the number of the playing card
	 */
	public Number getNumber()
	{
		return number;
	}

	/**
	 * The getSuit class returns the suit of the playing card.
	 *
	 * @return the suit of the playing card
	 */
	public Suit getSuit()
	{
		return suit;
	}

	/**
	 * Returns whether a card is hidden or not.
	 *
	 * @return whether a card is hidden or not.
	 */
	public boolean isHidden()
	{
		return hidden;
	}

	/**
	 * Sets the hidden value of the card.
	 *
	 * @param hidden whether a card is hidden or not.
	 */
	public void setHidden(boolean hidden)
	{
		this.hidden = hidden;
	}

	/**
	 * Overridden toString method.
	 *
	 * @return string representation of the card (eg. KING of SPADES).
	 */
	@Override
	public String toString()
	{
		return suit + " of " + number;
	}
}

