package csc439team1.blackjack.model;

import java.util.logging.Logger;

/**
 * Represents the actions which can be taken under certain conditions determined by the controller.
 *
 * @author Will St. Onge
 * @version 0.4
 */
public enum Action
{
	HIT("hit"),
	STAND("stand"),
	DOUBLE("double");

	private final String name;
	private final Logger logger = Logger.getLogger(this.getClass().getName());

	/**
	 * Action enum constructor that sets the name of the action.
	 *
	 * @param name Name of the action
	 */
	Action(String name)
	{
		logger.entering(getClass().getName(), "Action constructor");
		this.name = name;
		logger.exiting(getClass().getName(), "Action constructor");
	}

	/**
	 * Overridden toString() method for the Action enum that returns the string representation of an action.
	 *
	 * @return the string representation of an action.
	 */
	@Override
	public String toString()
	{
		logger.entering(getClass().getName(), "toString");
		logger.exiting(getClass().getName(), "toString");
		return name;
	}
}
