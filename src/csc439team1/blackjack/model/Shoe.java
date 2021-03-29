package csc439team1.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Shoe class represents a shoe object in the game of Blackjack.
 * A shoe is a collection of decks.
 *
 * @author Justin Gallagher
 * @version 0.2
 */
public class Shoe
{
    private final Random rand;
    private final List<Deck> shoe;

    /**
     * The Shoe class constructor creates a shoe collection of decks using the numDecks variable
     * to determine how many decks to add to the shoe collection.
     *
     * @param numDecks number of shoe
     */
    public Shoe(int numDecks)
    {
        rand = new Random();
        shoe = new ArrayList<>();

        for (int i = 0; i < numDecks; i++)
            shoe.add(new Deck());
    }

    /**
     * The pick method returns a random card from a deck in the shoe collection.
     *
     * @return a randomly picked card from a deck in the shoe collection
     */
    public Card pick()
    {
        if (shoe.size() == 0)
            throw new IllegalStateException("Shoe empty, no decks found.");

        Deck pickedDeck = shoe.get(rand.nextInt(shoe.size()));
        Card pickedCard = pickedDeck.pick();

        if (pickedDeck.size() == 0)
            shoe.remove(pickedDeck);

        return pickedCard;
    }

    /**
     * The numDecks method returns the size of the shoe collection (total number of decks in shoe).
     *
     * @return the number of decks in the shoe collection
     */
    public int numDecks()
    {
        return shoe.size();
    }

    /**
     * The size method returns the number of cards currently in the shoe.
     *
     * @return the number of cards in the shoe collection
     */
    public int size()
    {
        int numCards = 0;

        for (Deck deck : shoe)
            numCards += deck.size();

        return numCards;
    }
}