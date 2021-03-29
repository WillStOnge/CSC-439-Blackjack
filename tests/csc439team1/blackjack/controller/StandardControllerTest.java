package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.Action;
import csc439team1.blackjack.model.Player;
import csc439team1.blackjack.view.CLIView;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StandardControllerTest
{
	@Test
	public void placeBet()
	{
		StandardController controller = new StandardController(new CLIView());
		controller.placeBet();
	}

	@Test
	public void buyChips()
	{
		StandardController controller = new StandardController(new CLIView());
		controller.buyChips();
	}

	@Test
	public void dealCard1Arg()
	{
		StandardController controller = new StandardController(new CLIView());
		Player player = new Player();
		controller.dealCard(player);

		assertThat(player.getHand().size(), is(1));
	}

	@Test
	public void dealCard()
	{
		StandardController controller = new StandardController(new CLIView());
		Player player = new Player();
		controller.dealCard(player, true);
	}

	@Test
	public void keepPlaying()
	{
		StandardController controller = new StandardController(new CLIView());
		controller.keepPlaying();
	}

	@Test
	public void showHand()
	{
		StandardController controller = new StandardController(new CLIView());
		Player player = new Player();
		controller.showHand(player);
	}

	@Test
	public void getNextAction()
	{
		StandardController controller = new StandardController(new CLIView());
		controller.getNextAction(Action.HIT, Action.DOUBLE, Action.STAND);
	}
}