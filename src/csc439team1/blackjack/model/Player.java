package csc439team1.blackjack.model;

/**
 * Represents the player who has a number of chips and may place a bet
 *
 * @author Alex Smithson
 * @version 0.3
 */
public class Player extends PlayerBase
{
	private int chips;
	private int bet;

	/**
	 * Constructor for the player class.
	 */
	public Player()
	{
		super();
		chips = 0;
		bet = 0;
	}

	/**
	 * Retrieves the number of chips held by the player.
	 *
	 * @return the player's number of chips.
	 */
	public int getChips()
	{
		return chips;
	}

	/**
	 * Sets the players chip count.
	 *
	 * @param chips is assigned to the number of chips a player has.
	 */
	public void setChips(int chips)
	{
		this.chips = chips;
	}

	/**
	 * Add to the player's number of chips.
	 *
	 * @param chips Number of chips to add.
	 */
	public void addChips(int chips)
	{
		this.chips += chips;
	}

	/**
	 * Take away player's chips
	 *
	 * @param chips Number of chips to take away.
	 */
	public void removeChips(int chips)
	{
		this.chips -= chips;
	}

	/**
	 * Retrieves the current bet of the player.
	 *
	 * @return the players bet value
	 */
	public int getBet()
	{
		return bet;
	}

	/**
	 * Sets the players bet.
	 *
	 * @param bet the bet value of the player.
	 */
	public void setBet(int bet)
	{
		this.bet = bet;
	}
}