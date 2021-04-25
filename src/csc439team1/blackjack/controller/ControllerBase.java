package csc439team1.blackjack.controller;

import csc439team1.blackjack.model.Dealer;
import csc439team1.blackjack.view.ViewBase;

import java.util.logging.Logger;

/**
 * The abstract class for a blackjack controller.
 *
 * @author Will St. Onge
 * @version 0.3
 */
public abstract class ControllerBase
{
	protected final ViewBase view;
	protected final Dealer dealer;

	/**
	 * Controller constructor which allows the user to specify the view type.
	 *
	 * @param view the desired view for user interaction.
	 */

	protected ControllerBase(ViewBase view)
	{
		Logger logger = Logger.getLogger(this.getClass().getName());
		logger.entering(getClass().getName(), "ControllerBase constructor");
		this.view = view;
		this.dealer = new Dealer();
		logger.exiting(getClass().getName(), "ControllerBase constructor");
	}

	/**
	 * Abstract method to start the game in the concrete controller.
	 */
	public abstract void playBlackjack();
}
