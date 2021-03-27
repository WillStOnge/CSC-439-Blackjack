package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.*;
import csc439team1.blackjack.view.View;

import javax.swing.text.View;

/**
 * The standard blackjack controller. This is the brains of the program and contains all of the core game logic.
 *
 * @author Will St. Onge
 * @version 0.3
 */
public class StandardController
{
	private final Player player;
	private final Dealer dealer;
	private final Shoe shoe;
	private final View view;

	/**
	 * Constructs a new standard controller. Call playBlackjack() to start playing blackjack.
	 *
	 * @param view The view to use for prompting the player.
	 */
	public StandardController(View view)
	{
		player = new Player();
		dealer = new Dealer();
		shoe = new Shoe(3);
		this.view = view;
	}

	/**
	 * Starts the game and loops until the game is over.
	 */
	public void playBlackjack()
	{
		boolean keepPlaying = true;

		buyChips();

		while (keepPlaying)
		{
			Action action;

			placeBet();

			// Deal initial cards to dealer and player
			dealCard(player);
			dealCard(player);
			dealCard(dealer, true);
			dealCard(dealer);

			// TODO Check for a blackjack.

			// TODO Check for win/tie and prompt for retry.

			// TODO Determine what actions are allowed.

			// TODO Prompt the player with which action they wish to take, then execute it.

			// TODO Uhhh, bust check?

			// Keep prompting the player until they stand or bust.
			while ((action = getNextAction(Action.HIT, Action.STAND)) != Action.STAND)
			{
				dealCard(player);
				// TODO Display hit message and hand

				// TODO Check for a bust.
			}

			// TODO Deal cards to the dealer until they are >= 17

			// TODO Determine the winner (check both for busts, then compare their scores).

			keepPlaying = keepPlaying();
		}
	}

	/**
	 * Prompts player to make a bet (min 10, max 500 or player chip balance; whichever is less).
	 */
	public void placeBet()
	{
		int bet = 0; // TODO Prompt player for bet.
		// TODO Reduce chips from player and set their bet.
	}

	/**
	 * Prompts the player to buy chips at the beginning on the game.
	 */
	public void buyChips()
	{
		int chips = 0;// TODO Prompt player for the number of chips wanted and adds them to their object.
		// TODO Also need to remove the appropriate money from their object.
	}

	/**
	 * Deals a random face-up card from the shoe to the player.
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
		// TODO Deal the card to the player.
	}

	/**
	 * Prompts the player to see if they want to continue playing after the end of a round.
	 *
	 * @return whether the player wants to continue playing or not.
	 */
	public boolean keepPlaying()
	{
		// TODO Check if player still wants to play.
		return false;
	}

	/**
	 * Displays the hand and score of a player or the dealer.
	 *
	 * @param hand The hand to be displayed.
	 */
	public void showHand(Hand hand)
	{
		int score = hand.score();
		// TODO Print the deck and its score.
	}

	/**
	 * Gets the next action wanted by the player.
	 *
	 * @param allowedActions the actions allowed to be performed with the current game's state.
	 * @return the action picked by the player.
	 */
	public Action getNextAction(Action... allowedActions)
	{
		// TODO Prompt the player with the allowed actions and return the one picked.
		return Action.HIT;
	}
}