package csc439team1.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * The Shoe class represents a shoe object in the game of Blackjack.
 * A shoe is a collection of decks.
 *
 * @author Justin Gallagher
 * @version 0.4
 */
public class Shoe
{
	private final Random rand;
	private final List<Deck> shoe;
	private final Logger logger;

	/**
	 * The Shoe class constructor creates a shoe collection of decks using the numDecks variable
	 * to determine how many decks to add to the shoe collection.
	 *
	 * @param numDecks number of shoe
	 */
	public Shoe(int numDecks)
	{
		logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "Shoe constructor");

		rand = new Random();
		shoe = new ArrayList<>();

		for (int i = 0; i < numDecks; i++)
			shoe.add(new Deck());

		logger.exiting(getClass().getName(), "Shoe constructor");
	}

	/**
	 * The pick method returns a random card from a deck in the shoe collection.
	 *
	 * @return a randomly picked card from a deck in the shoe collection
	 */
	public Card pick()
	{
		logger.entering(getClass().getName(), "pick");

		if (shoe.size() == 0)
		{
			IllegalStateException ex = new IllegalStateException("Shoe empty, no decks found.");
			logger.throwing(getClass().getName(), "pick", ex);
			throw ex;
		}

		Deck pickedDeck = shoe.get(rand.nextInt(shoe.size()));
		Card pickedCard = pickedDeck.pick();

		if (pickedDeck.size() == 0)
			shoe.remove(pickedDeck);

		logger.exiting(getClass().getName(), "pick");

		return pickedCard;
	}

	/**
	 * The numDecks method returns the size of the shoe collection (total number of decks in shoe).
	 *
	 * @return the number of decks in the shoe collection
	 */
	public int numDecks()
	{
		logger.entering(getClass().getName(), "numDecks");
		logger.exiting(getClass().getName(), "numDecks");
		return shoe.size();
	}

	/**
	 * The size method returns the number of cards currently in the shoe.
	 *
	 * @return the number of cards in the shoe collection
	 */
	public int size()
	{
		logger.entering(getClass().getName(), "size");
		int numCards = 0;

		for (Deck deck : shoe)
			numCards += deck.size();

		logger.exiting(getClass().getName(), "size");

		return numCards;
	}
}