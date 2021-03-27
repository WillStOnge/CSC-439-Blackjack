package csc439team1.blackjack.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class DealerTest
{

    @Test
    public void dealFaceDownTest(){
        Dealer dealer = new Dealer();
        dealer.getHand().addCard(Number.TWO, Suit.SPADES, true);
        boolean hidden = dealer.getHand().getCards().get(0).isHidden();
        Assert.assertTrue(hidden);
    }
}
