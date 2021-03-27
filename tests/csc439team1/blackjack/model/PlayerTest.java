package csc439team1.blackjack.model;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlayerTest
{
	@Test
	public void placeBetTest()
	{
		Player player = new Player();
		int bet = player.placeBet();
		Assert.assertTrue(bet >= 10 && bet <= 500);
	}

	@Test
	public void setNumChipsTest()
	{
		Player player = new Player();
		player.setNumChips(10);
		Assert.assertEquals(10, player.getNumChips());
	}

	@Test
	public void playerBase_addCardTest()
	{
		Player player = new Player();
		player.getHand().addCard(new Card(Number.ACE, Suit.HEARTS));
		assertThat(player.getHand().size(), is(1));
	}

	@Test
	public void playerBase_scoreTest()
	{
		Player player = new Player();
		player.getHand().addCard(new Card(Number.ACE, Suit.HEARTS));
		int score = player.score();
		Assert.assertEquals(Number.ACE.getValue(), score);
	}
}