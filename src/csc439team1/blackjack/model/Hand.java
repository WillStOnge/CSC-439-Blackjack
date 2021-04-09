package csc439team1.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * The Hand class is used to hold the current cards held by a player.
 *
 * @author Will St. Onge
 * @version 0.4
 */
public class Hand
{
	private final List<Card> cards;
	private final Logger logger;

	/**
	 * Hand class constructor that sets up the internal card list.
	 */
	public Hand()
	{
		logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "Hand");
		cards = new ArrayList<>();
		logger.exiting(getClass().getName(), "Hand");
	}

	/**
	 * The getCards method returns the collection of cards in the hand.
	 *
	 * @return the collection of cards.
	 */
	public List<Card> getCards()
	{
		logger.entering(getClass().getName(), "getCards");
		logger.exiting(getClass().getName(), "getCards");
		return cards;
	}

	/**
	 * The addCard method adds the card to the collection of cards in the hand.
	 *
	 * @param card represents the card to be added to the hand.
	 */
	public void addCard(Card card)
	{
		logger.entering(getClass().getName(), "addCard");
		cards.add(card);
		logger.exiting(getClass().getName(), "addCard");
	}

	/**
	 * The size method returns the size of the collection of cards in the hand.
	 *
	 * @return the size of the collection of cards.
	 */
	public int size()
	{
		logger.entering(getClass().getName(), "size");
		logger.exiting(getClass().getName(), "size");
		return cards.size();
	}

	/**
	 * Scores the deck.
	 *
	 * @return the score(s) of the deck.
	 */
	public int score()
	{
		logger.entering(getClass().getName(), "score");

		int score = 0, aces = 0;
		Number number;

		// Computes the score of the deck (ace is always 11).
		for (Card card : cards)
		{
			number = card.getNumber();
			score += number.getValue();

			if (number == Number.ACE)
			{
				logger.info("Found an ace in the hand.");
				aces++;
			}
		}

		// Subtract 10 for each ace if we are over 21.
		while (score > 21 && aces > 0)
		{
			score -= 10;
			aces--;
		}

		logger.info("Computed score was " + score);

		logger.exiting(getClass().getName(), "score");

		return score;
	}
}