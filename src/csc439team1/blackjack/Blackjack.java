package csc439team1.blackjack;

import csc439team1.blackjack.controller.StandardController;
import csc439team1.blackjack.view.CLIView;
import csc439team1.blackjack.view.ViewBase;

import java.util.logging.Logger;

/**
 * This class holds the main method that initiates the blackjack game.
 *
 * @author Alex Smithson
 * @version 0.3
 */
public class Blackjack
{
	/**
	 * Entry point for the program. Initializes a view and controller, then starts the game.
	 *
	 * @param args command line arguments passed by the user (unused).
	 */
	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger(Blackjack.class.getName());
		logger.entering(Blackjack.class.getName(), "main");
		ViewBase view = new CLIView();
		StandardController controller = new StandardController(view);
		controller.playBlackjack();
		logger.exiting(Blackjack.class.getName(), "main");
	}
}