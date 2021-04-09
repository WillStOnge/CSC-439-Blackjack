package csc439team1.blackjack.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

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
			assertThat(card.getNumber().toString(), isA(String.class));
		}
	}

	@Test
	public void getSuit()
	{
		Card card;

		for (Suit suit : Suit.values())
		{
			card = new Card(Number.ACE, suit, false);
			assertThat(card.getSuit(), is(suit));
			assertThat(card.getSuit().toString(), isA(String.class));
			assertThat(card.isHidden(), is(false));
		}
	}

	@Test
	public void setHiddenTest()
	{
		Card card = new Card(Number.ACE, Suit.SPADES);
		card.setHidden(true);

		assertThat(card.isHidden(), is(true));
	}

	@Test
	public void testToString()
	{
		Card card = new Card(Number.ACE, Suit.SPADES);
		assertThat(card.toString(), is("ACE of SPADES"));
	}
}
