package csc439team1.blackjack.model;

/**
 * The Number enum represents the 13 types of playing card 'numbers'.
 * Note the ordering of the card numbers:
 * ACE, TWO, THREE, ... , KING
 *
 * @author Justin Gallagher
 * @version 0.1
 */
public enum Number
{
	ACE,
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	TEN,
	JACK,
	QUEEN,
	KING;

	/**
	 * Overridden toString() method for the Number class that prints out the string representation an
	 * individual playing card's associated 'number'.
	 *
	 * @return the string representation of the playing card's 'number'
	 */
	@Override
	public String toString() {
		String numString = "";
		switch (this) {
			case ACE:
				numString = "A";
				break;
			case TWO:
				numString = "2";
				break;
			case THREE:
				numString = "3";
				break;
			case FOUR:
				numString = "4";
				break;
			case FIVE:
				numString = "5";
				break;
			case SIX:
				numString = "6";
				break;
			case SEVEN:
				numString = "7";
				break;
			case EIGHT:
				numString = "8";
				break;
			case NINE:
				numString = "9";
				break;
			case TEN:
				numString = "10";
				break;
			case JACK:
				numString = "J";
				break;
			case QUEEN:
				numString = "Q";
				break;
			case KING:
				numString = "K";
				break;
		}
		return numString;
	}
}
