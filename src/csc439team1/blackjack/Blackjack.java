package csc439team1.blackjack;

import csc439team1.blackjack.controller.StandardController;
import csc439team1.blackjack.view.CLIView;
import csc439team1.blackjack.view.ViewBase;

/**
 * This class holds the main method that initiates the blackjack game.
 *
 * @author Alex Smithson
 * @version 0.3
 */
public class Blackjack
{
	public static void main(String[] args)
	{
		ViewBase view = new CLIView();
		StandardController controller = new StandardController(view);
		controller.playBlackjack();
	}
}