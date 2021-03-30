package csc439team1.blackjack.model;

/**
 * The Number enum represents the 13 types of playing card 'numbers'.
 * Note the ordering of the card numbers: ACE, TWO, THREE, ... , KING.
 *
 * @author Justin Gallagher and Will St. Onge
 * @version 0.3
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

	/**
	 * Number enum constructor that sets the name of the number.
	 *
	 * @param name  represents the name of the number.
	 * @param value integer value of the card.
	 */
	Number(String name, int value)
	{
		this.name = name;
		this.value = value;
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
		return name;
	}

	/**
	 * Returns the value of the number.
	 *
	 * @return the value of the number.
	 */
	public int getValue()
	{
		return value;
	}
}
