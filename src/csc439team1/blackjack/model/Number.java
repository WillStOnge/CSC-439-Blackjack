package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * The Number enum represents the 13 types of playing card 'numbers'.
 * Note the ordering of the card numbers: ACE, TWO, THREE, ... , KING.
 *
 * @author Justin Gallagher and Will St. Onge
 * @version 0.4
 */
public enum Number
{
	ACE("ACE", 11),
	TWO("2", 2),
	THREE("3", 3),
	FOUR("4", 4),
	FIVE("5", 5),
	SIX("6", 6),
	SEVEN("7", 7),
	EIGHT("8", 8),
	NINE("9", 9),
	TEN("10", 10),
	JACK("JACK", 10),
	QUEEN("QUEEN", 10),
	KING("KING", 10);

	private final String name;
	private final int value;
	private final Logger logger = Logger.getLogger(this.getClass().getName());

	/**
	 * Number enum constructor that sets the name of the number.
	 *
	 * @param name  represents the name of the number.
	 * @param value integer value of the card.
	 */
	Number(String name, int value)
	{
		logger.entering(getClass().getName(), "Number constructor");
		this.name = name;
		this.value = value;
		logger.exiting(getClass().getName(), "Number constructor");
	}

	/**
	 * Overridden toString() method for the Number class that returns the string representation an
	 * individual playing card's associated 'number'.
	 *
	 * @return the string representation of the playing card's 'number'
	 */
	@Override
	public String toString()
	{
		logger.entering(getClass().getName(), "toString");
		logger.exiting(getClass().getName(), "toString");
		return name;
	}

	/**
	 * Returns the value of the number.
	 *
	 * @return the value of the number.
	 */
	public int getValue()
	{
		logger.entering(getClass().getName(), "getValue");
		logger.exiting(getClass().getName(), "getValue");
		return value;
	}
}
