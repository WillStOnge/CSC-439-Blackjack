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
}

