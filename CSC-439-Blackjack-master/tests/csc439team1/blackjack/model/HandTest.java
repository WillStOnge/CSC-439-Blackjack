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

	@Test
	public void testScore()
	{
		Hand hand = new Hand();
		Card card = new Card(Number.ACE, Suit.SPADES);
		Card card1 = new Card(Number.KING, Suit.SPADES);

		hand.addCard(card);
		assertThat(hand.score(), is(11));

		hand.addCard(card);
		assertThat(hand.score(), is(12));

		hand.addCard(card1);
		assertThat(hand.score(), is(12));

		hand.addCard(card1);
		assertThat(hand.score(), is(22));
	}
}