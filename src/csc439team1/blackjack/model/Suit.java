package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * The Suit enum represents the 4 types of playing card suits.
 *
 * @author Justin Gallagher
 * @version 0.4
 */
public enum Suit
{
	HEARTS("HEARTS"),
	SPADES("SPADES"),
	DIAMONDS("DIAMONDS"),
	CLUBS("CLUBS");

	private final String name;
	private final Logger logger = Logger.getLogger(this.getClass().getName());

	/**
	 * Suit enum constructor that sets the name of the suit.
	 *
	 * @param name represents the name of the suit.
	 */
	Suit(String name)
	{
		logger.entering(getClass().getName(), "Suit constructor");
		this.name = name;
		logger.exiting(getClass().getName(), "Suit constructor");
	}

	/**
	 * Overridden toString() method for the Suit class that returns the string representation of the
	 * suit of an individual playing card in all uppercase.
	 *
	 * @return the string representation of the playing card's suit
	 */
	@Override
	public String toString()
	{
		logger.entering(getClass().getName(), "toString");
		logger.exiting(getClass().getName(), "toString");
		return name;
	}
}
