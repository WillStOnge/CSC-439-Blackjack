package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * Represents the player who has a number of chips and may place a bet
 *
 * @author Alex Smithson
 * @version 0.4
 */
public class Player extends PlayerBase
{
	private int chips;
	private int bet;
	private final Logger logger;

	/**
	 * Constructor for the player class.
	 */
	public Player()
	{
		super();
		logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "Player");
		chips = 0;
		bet = 0;
		logger.exiting(getClass().getName(), "Player");
	}

	/**
	 * Retrieves the number of chips held by the player.
	 *
	 * @return the player's number of chips.
	 */
	public int getChips()
	{
		logger.entering(getClass().getName(), "getChips");
		logger.exiting(getClass().getName(), "getChips");
		return chips;
	}

	/**
	 * Sets the players chip count.
	 *
	 * @param chips is assigned to the number of chips a player has.
	 */
	public void setChips(int chips)
	{
		logger.entering(getClass().getName(), "setChips");
		this.chips = chips;
		logger.exiting(getClass().getName(), "setChips");
	}

	/**
	 * Add to the player's number of chips.
	 *
	 * @param chips Number of chips to add.
	 */
	public void addChips(int chips)
	{
		logger.entering(getClass().getName(), "addChips");
		this.chips += chips;
		logger.exiting(getClass().getName(), "addChips");
	}

	/**
	 * Take away player's chips
	 *
	 * @param chips Number of chips to take away.
	 */
	public void removeChips(int chips)
	{
		logger.entering(getClass().getName(), "removeChips");
		this.chips -= chips;
		logger.exiting(getClass().getName(), "removeChips");
	}

	/**
	 * Retrieves the current bet of the player.
	 *
	 * @return the players bet value
	 */
	public int getBet()
	{
		logger.entering(getClass().getName(), "getBet");
		logger.exiting(getClass().getName(), "getBet");
		return bet;
	}

	/**
	 * Sets the players bet.
	 *
	 * @param bet the bet value of the player.
	 */
	public void setBet(int bet)
	{
		logger.entering(getClass().getName(), "setBet");
		this.bet = bet;
		logger.exiting(getClass().getName(), "setBet");
	}
}