package csc439team1.blackjack.model;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlayerTest
{
	@Test
	public void initTest(){
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
		player.setNumChips(10);
		Assert.assertEquals(10, player.getNumChips());
	}

	@Test
	public void addChipsTest(){
		Player player = new Player();
		player.addChips(1);
		Assert.assertEquals(1, player.getNumChips());
	}

	@Test
	public void loseChipsTest(){
		Player player = new Player();
		player.loseChips(1);
		Assert.assertEquals(-1, player.getNumChips());
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