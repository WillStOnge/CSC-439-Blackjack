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
	 * @return the player's number of chips
	 */
	public int getNumChips()
	{
		return numChips;
	}

	/**
	 * @param numChips is assigned to the number of chips a player has
	 */
	public void setNumChips(int numChips)
	{
		this.numChips = numChips;
	}

	/**
	 * add to the player's number of chips
	 */
	public void addChips(int addedChips)
	{
		numChips += addedChips;
	}

	/**
	 * take away player's chips
	 */
	public void loseChips(int lostChips)
	{
		numChips-= lostChips;
	}

	/**
	 * @return the players bet value
	 */
	public int getBet()
	{
		return bet;
	}

	/**
	 *
	 * @param newBetValue is a new
	 */
	public void setBet(int newBetValue) {
		bet = newBetValue;
	}
}