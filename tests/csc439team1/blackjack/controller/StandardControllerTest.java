package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.view.TestView;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StandardControllerTest
{
	@Test
	public void playBlackjack()
	{
		StandardController controller = new StandardController(new TestView());
		controller.playBlackjack();
	}

	@Test
	public void playBlackjack1()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setAction(Action.STAND);
		controller.playBlackjack();
	}

	@Test
	public void winnerCheck()
	{
		StandardController controller = new StandardController(new TestView());
		controller.winnerCheck();
	}

	@Test
	public void placeBet()
	{
		StandardController controller = new StandardController(new TestView());
		controller.buyChips();
		controller.placeBet();
	}

	@Test(expected = IllegalArgumentException.class)
	public void placeBetNegative()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		controller.buyChips();
		view.setBet(1001);
		controller.placeBet();
	}

	@Test(expected = IllegalArgumentException.class)
	public void placeBetNegative1()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		controller.buyChips();
		view.setBet(1);
		controller.placeBet();
	}

	@Test(expected = IllegalArgumentException.class)
	public void placeBetNegative2()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		controller.buyChips();
		view.setBet(501);
		controller.placeBet();
	}

	@Test
	public void buyChips()
	{
		StandardController controller = new StandardController(new TestView());
		controller.buyChips();
	}

	@Test(expected = IllegalArgumentException.class)
	public void buyChipsNegative()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setChips(1);
		controller.buyChips();
	}

	@Test
	public void dealCard()
	{
		StandardController controller = new StandardController(new TestView());
		Player player = new Player();
		controller.dealCard(player);

		assertThat(player.getHand().size(), is(1));
	}
}