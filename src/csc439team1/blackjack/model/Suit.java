package csc439team1.blackjack.model;

/**
 * The Suit enum represents the 4 types of playing card suits.
 *
 * @author Justin Gallagher
 * @version 0.1
 */
public enum Suit
{
	HEARTS,
	SPADES,
	DIAMONDS,
	CLUBS;

	/**
	 * Overridden toString() method for the Suit class that prints out the string representation of the
	 * suit of an individual playing card in all uppercase.
	 *
	 * @return the string representation of the playing card's suit
	 */
	@Override
	public String toString() {
		String suitString = "";
		switch (this) {
			case HEARTS:
				suitString = "HEARTS";
				break;
			case SPADES:
				suitString = "SPADES";
				break;
			case DIAMONDS:
				suitString = "DIAMONDS";
				break;
			case CLUBS:
				suitString = "CLUBS";
				break;
		}
		return suitString;
	}
}
