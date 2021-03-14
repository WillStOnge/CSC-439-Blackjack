package csc439team1.blackjack.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeckTest {


    @Test
    public void createAndPickTest(){
        Deck deck = new Deck();

        assertEquals(deck.size(), 52);
        deck.pick();

        assertEquals(deck.size(), 51);
    }

    @Test(expected = IllegalStateException.class)
    public void pickExceptionTest() {
        Deck deck = new Deck();
        for (int i = 0; i < 53; i++)
            deck.pick();
    }
}
