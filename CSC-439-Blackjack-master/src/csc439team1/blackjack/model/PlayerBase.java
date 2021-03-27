package csc439team1.blackjack.model;

import java.util.List;

/**
    * The PlayerBase abstract class gives base functionality for player and Dealer alike
    * @author Alex Smithson
    * @version 0.3
 **/
public abstract class PlayerBase
{
    private final Hand HAND = new Hand();

    /**
     * This method gets the score of all of the cards in the hand. Automatically reduces aces value from 11 to 1 if
     * the total score is greater than 21.
     * @param hand
     * @return
     */
    public int score(Hand hand){
        return HAND.score();
    }

    /**
     * Adds a card to the player's hand
     * @param card
     */
    public void addCard(Card card){
        HAND.addCard(card);
    }

    /**
     * Standard getter returns the player's Hand object
     * @return HAND
     */
    public Hand getHand() {
        return HAND;
    }
}
