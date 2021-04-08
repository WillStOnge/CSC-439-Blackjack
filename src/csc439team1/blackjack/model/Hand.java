package csc439team1.blackjack.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Hand class is used to hold the current cards held by a player.
 *
 * @author Will St. Onge
 * @version 0.2
 */
public class Hand
{
	private final List<Card> cards;

	/**
	 * Hand class constructor that sets up the internal card list.
	 */
	public Hand()
	{
		cards = new ArrayList<>();
	}

	/**
	 * The getCards method returns the collection of cards in the hand.
	 *
	 * @return the collection of cards.
	 */
	public List<Card> getCards()
	{
		return cards;
	}

	/**
	 * The addCard method adds the card to the collection of cards in the hand.
	 *
	 * @param card represents the card to be added to the hand.
	 */
	public void addCard(Card card)
	{
		cards.add(card);
	}

	/**
	 * The size method returns the size of the collection of cards in the hand.
	 *
	 * @return the size of the collection of cards.
	 */
	public int size()
	{
		return cards.size();
	}

	/**
	 * Scores the deck.
	 *
	 * @return the score(s) of the deck.
	 */
	public int score()
	{
		int score = 0, aces = 0;
		Number number;

		// Computes the score of the deck (ace is always 11).
		for (Card card : cards)
		{
			number = card.getNumber();
			score += number.getValue();

			if (number == Number.ACE)
				aces++;
		}

		// Subtract 10 for each ace if we are over 21.
		while (score > 21 && aces > 0)
		{
			score -= 10;
			aces--;
		}

		return score;
	}
}