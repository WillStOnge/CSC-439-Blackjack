package csc439team1.blackjack.model;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Represents the player who has a number of chips and may place a bet
 *
 * @author Alex Smithson
 * @version 0.3
 */
public class Player extends PlayerBase
{
	private int numChips;
	private int bet;

	/**
	 * Constructor for the player class.
	 */
	public Player()
	{
		super();
		numChips = 0;
		bet = 0;
	}

	/**
	 * Retrieves the number of chips held by the player.
	 *
	 * @return the player's number of chips.
	 */
	public int getNumChips()
	{
		return numChips;
	}

	/**
	 * Sets the players chip count.
	 *
	 * @param numChips is assigned to the number of chips a player has.
	 */
	public void setNumChips(int numChips)
	{
		this.numChips = numChips;
	}

	/**
	 * Add to the player's number of chips.
	 *
	 * @param addedChips Number of chips to add.
	 */
	public void addChips(int addedChips)
	{
		numChips += addedChips;
	}

	/**
	 * Take away player's chips
	 *
	 * @param lostChips Number of chips to take away.
	 */
	public void loseChips(int lostChips)
	{
		numChips -= lostChips;
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
	 * @param newBetValue the bet value of the player.
	 */
	public void setBet(int newBetValue) {
		bet = newBetValue;
	}
}