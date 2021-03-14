package csc439team1.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.IllegalStateException;

/**
 * The Deck class is used to create an instance that represents a
 * deck of playing cards and includes the following properties:
 *
 * deck is of type List and represents the deck
 *
 * @author Alex Smithson
 * @version 0.2
 */
public class Deck
{
    private final List<Card> deck;
    private final Random rand;

    /**
     * The Deck class constructor creates the List that represents the deck
     * and populates it with 52 unique Card instances
     */
    public Deck()
    {
        deck = new ArrayList<>();
        rand = new Random();

        for (Number curNumber : Number.values())
            for (Suit curSuit : Suit.values())
                deck.add(new Card(curNumber, curSuit));
    }

    /**
     * This method selects a card from the deck via Math.random()
     * and removes it from the List, deck.
     *
     * @return a randomly selected card
     * @throws IllegalStateException if there are no cards left in the deck.
     */
    public Card pick()
    {
        Card returnCard;

        if (deck.size() == 0)
            throw new IllegalStateException("The deck is empty");

        returnCard = deck.get(rand.nextInt(deck.size()));
        deck.remove(returnCard);

        return returnCard;
    }

    /**
     * This method returns the size of the List, deck.
     *
     * @return deck.size()
     */
    public int size()
    {
        return deck.size();
    }
}