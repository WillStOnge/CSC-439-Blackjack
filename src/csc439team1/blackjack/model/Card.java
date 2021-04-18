package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * The Card class is used to create a objects that represents a
 * single playing card from a deck and includes the following properties:
 * Number and Suit.
 *
 * @author Justin Gallagher
 * @version 0.4
 */
public class Card
{
	private final Number number;
	private final Suit suit;
	private boolean hidden;
	private final Logger logger;

	/**
	 * Card class constructor that sets the number and suit of the card.
	 *
	 * @param number represents the number of the card
	 * @param suit   represents the suit of the card
	 */
	public Card(Number number, Suit suit)
	{
		this(number, suit, false);
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
		logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "Card constructor");
		this.number = number;
		this.suit = suit;
		this.hidden = hidden;
		logger.exiting(getClass().getName(), "Card constructor");
	}

	/**
	 * The getNumber class returns the number of the playing card.
	 *
	 * @return the number of the playing card
	 */
	public Number getNumber()
	{
		logger.entering(getClass().getName(), "getNumber");
		logger.exiting(getClass().getName(), "getNumber");
		return number;
	}

	/**
	 * The getSuit class returns the suit of the playing card.
	 *
	 * @return the suit of the playing card
	 */
	public Suit getSuit()
	{
		logger.entering(getClass().getName(), "getSuit");
		logger.exiting(getClass().getName(), "getSuit");
		return suit;
	}

	/**
	 * Returns whether a card is hidden or not.
	 *
	 * @return whether a card is hidden or not.
	 */
	public boolean isHidden()
	{
		logger.entering(getClass().getName(), "isHidden");
		logger.exiting(getClass().getName(), "isHidden");
		return hidden;
	}

	/**
	 * Sets the hidden value of the card.
	 *
	 * @param hidden whether a card is hidden or not.
	 */
	public void setHidden(boolean hidden)
	{
		logger.entering(getClass().getName(), "setHidden");
		this.hidden = hidden;
		logger.exiting(getClass().getName(), "setHidden");
	}

	/**
	 * Overridden toString method.
	 *
	 * @return string representation of the card (eg. KING of SPADES).
	 */
	@Override
	public String toString()
	{
		logger.entering(getClass().getName(), "toString");
		logger.exiting(getClass().getName(), "toString");
		return hidden ? "### of ###" : number + " of " + suit;
	}
}

