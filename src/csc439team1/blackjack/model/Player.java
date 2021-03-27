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
	// Needs to have info about the number of chips, the bet, and methods to increment/decrement those variables.
	private int numChips;
	private int bet;

	/**
	 * Constructor for the player class.
	 */
	public Player()
	{
		super();
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
	 * increment the player's number of chips
	 */
	public void addChip()
	{
		numChips++;
	}

	/**
	 * take away a player's chip
	 */
	public void loseChip()
	{
		numChips--;
	}

	/**
	 * @return the players bet value
	 */
	public int getBet()
	{
		return bet;
	}

	/**
	 * This method prompts the user to place a bet between $10 and $500
	 */
	public int placeBet()
	{
		Scanner scanner = new Scanner(System.in);
		bet = 0;
		while (bet < 10 || bet > 500)
		{
			System.out.println("Player: Please place a bet between $10 - $500:");
			try
			{
				bet = scanner.nextInt();
			} catch (InputMismatchException e)
			{
				System.out.println("Please enter your bet as an integer value, ex: 50");
			}
		}
		scanner.close();

		return bet;
	}

	/**
	 * This method increments the player's bet by $1
	 */
	public void upBet()
	{
		bet++;
	}

	/**
	 * This method decrements the player's bet by $1
	 */
	public void lowerBet()
	{
		bet--;
	}
}