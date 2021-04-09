package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.*;
import csc439team1.blackjack.model.Number;
import csc439team1.blackjack.view.TestView;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
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
	public void playBlackjackImmediateStand()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setAction(Action.STAND);
		controller.playBlackjack();
	}

	@Test
	public void playBlackjackDouble()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setAction(Action.DOUBLE);
		controller.playBlackjack();
	}

	@Test
	public void winnerCheckPlayerBust()
	{
		StandardController controller = new StandardController(new TestView());

		Player player = controller.getPlayer();
		player.addCard(new Card(Number.KING, Suit.SPADES));
		player.addCard(new Card(Number.KING, Suit.SPADES));
		player.addCard(new Card(Number.KING, Suit.SPADES));

		controller.winnerCheck();
	}

	@Test
	public void winnerCheckDealerBust()
	{
		StandardController controller = new StandardController(new TestView());

		Dealer dealer = controller.getDealer();
		dealer.addCard(new Card(Number.KING, Suit.SPADES));
		dealer.addCard(new Card(Number.KING, Suit.SPADES));
		dealer.addCard(new Card(Number.KING, Suit.SPADES));

		controller.winnerCheck();
	}

	@Test
	public void winnerCheckPlayerWin()
	{
		StandardController controller = new StandardController(new TestView());

		Player player = controller.getPlayer();
		player.addCard(new Card(Number.KING, Suit.SPADES));
		player.addCard(new Card(Number.KING, Suit.SPADES));

		controller.winnerCheck();
	}

	@Test
	public void winnerCheckDealerWin()
	{
		StandardController controller = new StandardController(new TestView());

		Dealer dealer = controller.getDealer();
		dealer.addCard(new Card(Number.KING, Suit.SPADES));
		dealer.addCard(new Card(Number.KING, Suit.SPADES));

		controller.winnerCheck();
	}

	@Test
	public void winnerCheckTie()
	{
		StandardController controller = new StandardController(new TestView());

		Player player = controller.getPlayer();
		player.addCard(new Card(Number.KING, Suit.SPADES));
		player.addCard(new Card(Number.KING, Suit.SPADES));

		Dealer dealer = controller.getDealer();
		dealer.addCard(new Card(Number.KING, Suit.SPADES));
		dealer.addCard(new Card(Number.KING, Suit.SPADES));

		controller.winnerCheck();
	}

	@Test
	public void testZeroChips()
	{
		TestView view = new TestView();
		StandardController controller = new StandardController(view);

		view.setChips(10);
		view.setBet(10);
		view.setAction(Action.STAND);
		controller.playBlackjack();
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
	public void actionToString()
	{
		assertThat(Action.STAND.toString(), is("stand"));
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
	public void hit()
	{
		StandardController controller = new StandardController(new TestView());
		controller.hit(controller.getPlayer());

		assertThat(controller.getPlayer().getHand().getCards().size(), is(1));
	}

	@Test
	public void getPlayer()
	{
		StandardController controller = new StandardController(new TestView());

		assertThat(controller.getPlayer(), isA(Player.class));
	}

	@Test
	public void getDealer()
	{
		StandardController controller = new StandardController(new TestView());

		assertThat(controller.getDealer(), isA(Dealer.class));
	}

	@Test
	public void doubleBetDouble()
	{
		StandardController controller = new StandardController(new TestView());

		assertThat(controller.doubleBet(Action.DOUBLE), is(true));
	}

	@Test
	public void doubleBetHit()
	{
		StandardController controller = new StandardController(new TestView());

		assertThat(controller.doubleBet(Action.HIT), is(false));
	}
}