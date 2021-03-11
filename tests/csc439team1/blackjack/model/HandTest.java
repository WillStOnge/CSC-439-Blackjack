package csc439team1.blackjack.model;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class HandTest
{

	@Test
	public void addAndGetCards()
	{
		Hand hand = new Hand();
		Card card = new Card(Number.ACE, Suit.SPADES);
		hand.addCard(card);

		assertThat(hand.getCards().get(0), is(card));
	}

	@Test
	public void size()
	{
		Hand hand = new Hand();
		Card card = new Card(Number.ACE, Suit.SPADES);
		hand.addCard(card);

		assertThat(hand.size(), is(1));
	}
}