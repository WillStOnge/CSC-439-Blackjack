package csc439team1.blackjack.model;

/**
 * Represents the actions which can be taken under certain conditions determined by the controller.
 *
 * @author Will St. Onge
 * @version 0.3
 */
public enum Action
{
	HIT("hit"),
	STAND("stand");

	private final String name;

	/**
	 * Action enum constructor that sets the name of the action.
	 *
	 * @param name Name of the action
	 */
	Action(String name)
	{
		this.name = name;
	}

	/**
	 * Overridden toString() method for the Action enum that returns the string representation of an action.
	 *
	 * @return the string representation of an action.
	 */
	@Override
	public String toString()
	{
		return name;
	}
}
