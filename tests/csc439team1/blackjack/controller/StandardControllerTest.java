package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.view.CLIView;
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
		StandardController controller = new StandardController(new CLIView());
		controller.winnerCheck();
	}

	@Test
	public void placeBet()
	{
		StandardController controller = new StandardController(new CLIView());

		String input = "100";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		controller.placeBet();
	}

	@Test
	public void buyChips()
	{
		StandardController controller = new StandardController(new CLIView());

		String input = "100";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		controller.buyChips();
	}

	@Test
	public void dealCard()
	{
		StandardController controller = new StandardController(new CLIView());
		Player player = new Player();
		controller.dealCard(player);

		assertThat(player.getHand().size(), is(1));
	}

	@Test
	public void keepPlaying()
	{
		StandardController controller = new StandardController(new CLIView());

		String input = "N";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		assertThat(controller.keepPlaying(), is(false));
	}

	@Test
	public void getNextAction()
	{
		StandardController controller = new StandardController(new CLIView());

		String input = "HIT";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		controller.getNextAction(Action.HIT, Action.DOUBLE, Action.STAND);
	}
}