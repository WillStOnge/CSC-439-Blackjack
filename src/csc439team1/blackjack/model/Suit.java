package csc439team1.blackjack.model;

/**
 * The Suit enum represents the 4 types of playing card suits.
 *
 * @author Justin Gallagher
 * @version 0.1
 */
public enum Suit
{
	HEARTS("HEARTS"),
	SPADES("SPADES"),
	DIAMONDS("DIAMONDS"),
	CLUBS("CLUBS");

	private final String name;

	/**
	 * Suit enum constructor that sets the name of the suit.
	 *
	 * @param name represents the name of the suit.
	 */
	Suit(String name)
	{
		this.name = name;
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
		return name;
	}
}
