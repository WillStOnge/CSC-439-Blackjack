package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * Represents the dealer who has no functionality outside of PlayerBase
 *
 * @author Alex Smithson
 * @version 0.4
 */
public class Dealer extends PlayerBase
{

	/**
	 * Constructor for the Dealer class.
	 */
	public Dealer()
	{
		super();
		Logger logger = Logger.getLogger(getClass().getName());
		logger.entering(getClass().getName(), "Dealer");
		logger.exiting(getClass().getName(), "Dealer");
	}
}