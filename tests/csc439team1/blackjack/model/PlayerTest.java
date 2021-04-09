package csc439team1.blackjack.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest
{
	@Test
	public void initTest()
	{
		Player player = new Player();
		Assert.assertNotNull(player);
	}

	@Test
	public void setBetTest()
	{
		Player player = new Player();
		player.setBet(1);
		Assert.assertEquals(1, player.getBet());
	}

	@Test
	public void setNumChipsTest()
	{
		Player player = new Player();
		player.setChips(10);
		Assert.assertEquals(10, player.getChips());
	}

	@Test
	public void addChipsTest()
	{
		Player player = new Player();
		player.addChips(1);
		Assert.assertEquals(1, player.getChips());
	}

	@Test
	public void loseChipsTest()
	{
		Player player = new Player();
		player.removeChips(1);
		Assert.assertEquals(-1, player.getChips());
	}

	@Test
	public void playerBaseAddCardTest()
	{
		Player player = new Player();
		player.getHand().addCard(new Card(Number.ACE, Suit.HEARTS));
		assertThat(player.getHand().size(), is(1));
	}

	@Test
	public void playerBaseScoreTest()
	{
		Player player = new Player();
		player.addCard(new Card(Number.ACE, Suit.HEARTS));
		int score = player.score();
		Assert.assertEquals(Number.ACE.getValue(), score);
	}

	@Test
	public void clearHand()
	{
		Player player = new Player();
		player.addCard(new Card(Number.ACE, Suit.HEARTS));
		player.clearHand();
		assertThat(player.getHand().getCards().size(), is(0));
	}
}