package csc439team1.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * The Deck class is used to create an instance that represents a
 * deck of playing cards and includes the following properties:
 * <p>
 * deck is of type List and represents the deck
 *
 * @author Alex Smithson
 * @version 0.4
 */
public class Deck
{
	private final List<Card> deck;
	private final Random rand;
	private final Logger logger;

	/**
	 * The Deck class constructor creates the List that represents the deck
	 * and populates it with 52 unique Card instances
	 */
	public Deck()
	{
		logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "Deck");

		deck = new ArrayList<>();
		rand = new Random();

		for (Number curNumber : Number.values())
			for (Suit curSuit : Suit.values())
				deck.add(new Card(curNumber, curSuit));

		logger.exiting(getClass().getName(), "Deck");
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
		logger.entering(getClass().getName(), "pick");

		Card returnCard;

		if (deck.size() == 0)
		{
			IllegalStateException ex = new IllegalStateException("The deck is empty");
			logger.throwing(getClass().getName(), "pick", ex);
			throw ex;
		}

		returnCard = deck.get(rand.nextInt(deck.size()));
		deck.remove(returnCard);

		logger.info("Picked card: " + returnCard.toString());
		logger.exiting(getClass().getName(), "pick");

		return returnCard;
	}

	/**
	 * This method returns the size of the List, deck.
	 *
	 * @return deck.size()
	 */
	public int size()
	{
		logger.entering(getClass().getName(), "size");
		logger.exiting(getClass().getName(), "size");
		return deck.size();
	}
}