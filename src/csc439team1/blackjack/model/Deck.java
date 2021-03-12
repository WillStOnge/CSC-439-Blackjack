package csc439team1.blackjack.model;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Deck class is used to create an instance that represents a
 * deck of playing cards and includes the following properties:
 *
 * numCards is the number of cards remaining in the deck
 * deck is the data structure that represents the deck
 *
 * @author Alex Smithson
 * @version 0.2
 */
public class Deck
{
    private List<Card> deck;

    /**
     * The Deck class constructor creates the List that represents the deck
     * and populates it with 52 unique Card instances
     */
    public Deck()
    {
        deck = new ArrayList<Card>();

        for (Number curNumber : Number.values())
            for (Suit curSuit : Suit.values())
                deck.add(new Card(curNumber, curSuit));
    }

    /**
     * This method selects a card from the deck via Math.random()
     * and removes it from the List, deck.
     *
     * @return a randomly selected card
     * @throws NoSuchObjectException if there are no cards left in the deck.
     */
    public Card pick() throws NoSuchObjectException
    {
        Card returnCard;

        if (deck.size() == 0)
            throw new NoSuchObjectException("The deck is empty");

        returnCard = deck.get((int) Math.random() * deck.size());
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