package csc439team1.blackjack.model;

import java.util.ArrayList;

/**
 * The Hand class is used to hold the current cards held by a player.
 *
 * @author Will St. Onge
 * @version 0.2
 */
public class Hand
{
	private ArrayList<Card> cards;

	/**
	 * Hand class constructor that sets up the internal card list.
	 */
	public Hand()
	{
		this.cards = new ArrayList<>();
	}

	/**
	 * The getCards method returns the collection of cards in the hand.
	 *
	 * @return the collection of cards.
	 */
	public ArrayList<Card> getCards()
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
}
