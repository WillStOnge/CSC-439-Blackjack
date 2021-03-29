package csc439team1.blackjack.model;

import org.junit.Assert;
import org.junit.Test;

public class DealerTest
{
	@Test
	public void initTest(){
		Dealer dealer = new Dealer();
		Assert.assertNotNull(dealer);
	}
}