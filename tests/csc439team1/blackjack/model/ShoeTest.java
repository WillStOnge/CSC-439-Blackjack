package csc439team1.blackjack.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShoeTest
{
    @Test(expected = IllegalStateException.class)
    public void pickExceptionTest()
    {
        int numDecks = 0;
        Shoe shoe = new Shoe(numDecks);
        shoe.pick();
    }

    @Test
    public void testPick()
    {
        int numDecks = 2;
        Shoe shoe = new Shoe(numDecks);
        Card testCard = shoe.pick();
        assertNotNull(testCard);
        for (int i = 0; i < 102; i++)
            shoe.pick();

        assertEquals(1, shoe.numDecks());
    }

    @Test
    public void numDecksTest()
    {
        int numDecks = 5;
        Shoe shoe = new Shoe(numDecks);
        assertEquals(shoe.numDecks(), numDecks);
    }

    @Test
    public void sizeTest()
    {
        int numDecks = 5;
        Shoe shoe = new Shoe(numDecks);
        assertEquals(shoe.size(), numDecks * 52);
    }
}