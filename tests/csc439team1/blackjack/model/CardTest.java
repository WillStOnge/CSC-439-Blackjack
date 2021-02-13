package csc439team1.blackjack.model;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CardTest
{
	@Test
	public void getNumber()
	{
		Card card;

		for (Number number : Number.values())
		{
			card = new Card(number, Suit.SPADES);
			assertThat(card.getNumber(), is(number));
		}
	}

	@Test
	public void getSuit()
	{
		Card card;

		for (Suit suit : Suit.values())
		{
			card = new Card(Number.ACE, suit);
			assertThat(card.getSuit(), is(suit));
		}
	}
}
