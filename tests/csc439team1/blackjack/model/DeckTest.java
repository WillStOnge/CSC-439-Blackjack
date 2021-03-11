package csc439team1.blackjack.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.rmi.NoSuchObjectException;

public class DeckTest {

    @Test(expected = NoSuchObjectException.class)
    public void pickExceptionTest() throws NoSuchObjectException {
        Deck deck = new Deck();
        for (int i = 0; i < 53; i++)
            deck.pick();
    }



    @Test
    public void pickTest(){
        Deck deck = new Deck();
        deck.size();
        assertEquals(deck.size(), 52);
        try {
            deck.pick();
        } catch (NoSuchObjectException e){}
        assertEquals(deck.size(), 51);
    }
}
