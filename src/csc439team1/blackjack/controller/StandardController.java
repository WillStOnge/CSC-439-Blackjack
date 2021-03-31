package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.*;
import csc439team1.blackjack.view.ViewBase;

/**
 * The standard blackjack controller. This is the brains of the program and contains all of the core game logic.
 *
 * @author Will St. Onge
 * @version 0.3
 */
public class StandardController extends ControllerBase
{
	private final Player player;
	private final Shoe shoe;

	/**
	 * Constructs a new standard controller. Call playBlackjack() to start playing blackjack.
	 *
	 * @param view The view to use for prompting the player.
	 */
	public StandardController(ViewBase view)
	{
		super(view);
		player = new Player();
		shoe = new Shoe(3);
	}

	/**
	 * Starts the game and loops until the game is over.
	 * The game can end if the player doesn't wish to continue or they run out of chips.
	 */
	@Override
	public void playBlackjack()
	{
		boolean keepPlaying = true;

		view.displayStartGame();
		buyChips();

		while (keepPlaying)
		{
			placeBet();

			// Deal initial cards to dealer and player
			dealCard(player);
			dealCard(player);
			dealCard(dealer, true);
			dealCard(dealer);

			view.displayHand(player, player.score());
			view.displayHand(dealer, dealer.score());

			// Keep prompting the player until they stand, bust, or reach a score of 21.
			while (view.promptAction(Action.HIT, Action.STAND) != Action.STAND && player.score() < 21)
			{
				dealCard(player);
				view.displayHit();
				view.displayHand(player, player.score());
			}

			// Deal cards to the dealer until their score is >= 17.
			while (dealer.score() < 17)
				dealCard(dealer);

			winnerCheck();

			// Check if the player has run out of chips.
			if (player.getChips() <= 0 || shoe.size() == 0)
			{
				view.displayGameOver();
				break;
			}

			player.clearHand();
			dealer.clearHand();

			// Check if player wishes to continue playing.
			keepPlaying = view.promptKeepPlaying();
		}
	}

	/**
	 * Displays the winner and if anyone busted.
	 */
	public void winnerCheck()
	{
		// Check for any busts.
		if (player.score() > 21)
		{
			view.displayWinner(dealer);
			view.displayBust(player);
			player.setBet(0);
		}
		else if (dealer.score() > 21)
		{
			view.displayWinner(player);
			view.displayBust(dealer);
		}
		else
		{
			// If nobody busted, check for the winner or a push.
			if (dealer.score() > player.score())
			{
				view.displayWinner(dealer);
				player.setBet(0);
			}
			else if (dealer.score() < player.score())
			{
				view.displayWinner(player);
				player.addChips(player.getBet() * 2);
				player.setBet(0);
			}
			else
			{
				view.displayTie(player.score());
				player.addChips(player.getBet());
				player.setBet(0);
			}
		}
	}

	/**
	 * Prompts player to make a bet (min 10, max 500 or player chip balance; whichever is less).
	 */
	public void placeBet()
	{
		int bet = view.promptPlayerBet();

		if (bet > player.getChips())
			throw new IllegalArgumentException("Bet must be less than equal to the number of chips held.");
		if (bet < 10 || bet > 500)
			throw new IllegalArgumentException("Bet must be between 10 and 500.");

		player.setBet(bet);
		player.removeChips(bet);
	}

	/**
	 * Prompts the player to buy chips at the beginning on the game.
	 */
	public void buyChips()
	{
		int chips = view.promptBuyChips();

		if (chips < 10)
			throw new IllegalArgumentException("You must buy at least 10 chips");

		player.setChips(chips);
	}

	/**
	 * Deals a random, face-up card from the shoe to the player.
	 *
	 * @param player the player to deal the card to.
	 */
	public void dealCard(PlayerBase player)
	{
		dealCard(player, false);
	}

	/**
	 * Deals a random card from the shoe to the player.
	 *
	 * @param player the player to deal the card to.
	 * @param hidden determines whether or not the card will be face up or down.
	 */
	public void dealCard(PlayerBase player, boolean hidden)
	{
		Card card = shoe.pick();
		card.setHidden(hidden);
		player.addCard(card);
	}
}