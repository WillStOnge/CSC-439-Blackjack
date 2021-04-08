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
	private final int BET_RETURNED;
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
		BET_RETURNED = 2;
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
			Action action = null;
			boolean doubled = false;

			placeBet();

			// Deal initial cards to dealer and player
			dealCard(player);
			dealCard(player);
			dealCard(dealer, true);
			dealCard(dealer);

			view.displayHand(player, player.score());
			view.displayHand(dealer, dealer.score());

			// Check if player wants to double. They can only double if their score is between 9 and 11 after the first 2 cards are dealt.
			if (player.score() >= 9 && player.score() <= 11 && (action = view.promptAction(Action.HIT, Action.STAND, Action.DOUBLE)) != Action.STAND)
			{
				hit(player);

				if (action == Action.DOUBLE)
				{
					player.removeChips(player.getBet());
					player.setBet(player.getBet());
					doubled = true;

					// Force player to stand if they don't bust.
					if (player.score() <= 21)
						action = Action.STAND;
				}
			}

			// Keep prompting the player until they stand, bust, or reach a score of 21.
			while (!doubled && player.score() < 21 && (action = view.promptAction(Action.HIT, Action.STAND)) != Action.STAND)
				hit(player);

			if (action == Action.STAND)
				view.displayStand(player);

			// Don't continue if player busts or gets 21.
			if (player.score() < 21)
			{
				// Deal cards to the dealer until their score is >= 17.
				while (dealer.score() < 17)
					hit(dealer);

				// Display if dealer stood or not.
				if (dealer.score() <= 21)
					view.displayStand(dealer);
			}

			winnerCheck();

			// Check if the player has run out of chips.
			if (player.getChips() <= 0)
			{
				view.displayGameOver();
				break;
			}

			player.clearHand();
			dealer.clearHand();

			// Check if player wishes to continue playing.
			keepPlaying = view.promptKeepPlaying();

			if (!keepPlaying)
				view.displayQuit();
		}
	}

	/**
	 * Hits the player/dealer with a random card from the shoe.
	 *
	 * @param player the player which should be hit.
	 */
	public void hit(PlayerBase player)
	{
		dealCard(player);
		view.displayHit(player);
		view.displayHand(player, player.score());
	}

	/**
	 * Displays the winner and if anyone busted.
	 */
	public void winnerCheck()
	{
		// Check for any busts.
		if (player.score() > 21)
		{
			view.displayBust(player);
			view.displayWinner(dealer);
			player.setBet(0);
		}
		else if (dealer.score() > 21)
		{
			view.displayBust(dealer);
			view.displayWinner(player);
			player.addChips(player.getBet() * BET_RETURNED);
			player.setBet(0);
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
				view.displayScore(dealer);
				view.displayWinner(player);
				player.addChips(player.getBet() * BET_RETURNED);
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

	/**
	 * Returns the player object.
	 *
	 * @return the player object.
	 */
	public Player getPlayer()
	{
		return player;
	}

	/**
	 * Returns the player object.
	 *
	 * @return the player object.
	 */
	public Dealer getDealer()
	{
		return dealer;
	}
}