package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.view.TestView;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StandardControllerTest
{
	// TODO Fix user input.

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
		controller.placeBet();
	}

	@Test(expected = IllegalArgumentException.class)
	public void placeBetNegative()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setBet(1001);
		controller.placeBet();
	}

	@Test(expected = IllegalArgumentException.class)
	public void placeBetNegative1()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setBet(1);
		controller.placeBet();
	}

	@Test(expected = IllegalArgumentException.class)
	public void placeBetNegative2()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setBet(501);
		controller.placeBet();
	}

	@Test
	public void buyChips()
	{
		StandardController controller = new StandardController(new TestView());
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

	@Test
	public void keepPlaying()
	{
		StandardController controller = new StandardController(new TestView());
		assertThat(controller.keepPlaying(), is(true));
	}

	@Test
	public void getNextAction()
	{
		StandardController controller = new StandardController(new TestView());
		assertThat(controller.getNextAction(Action.HIT, Action.STAND), is(Action.STAND));
	}
}