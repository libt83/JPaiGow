package Test;

import Main.Hand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest
{
    private Hand testHand1, testHand2, testHand3;

    @Before
    public void setUp()
    {
        String[] cards1 = {"3s", "2s", "Kh", "Ah", "6d", "7d", "2c"};
        String[] cards2 = {"3h", "??", "Kh", "Ah", "6h", "7h", "2h"};
        String[] cards3 = {"3s", "2s", "Ks", "As", "6s", "7s", "Ts"};

        testHand1 = new Hand(cards1);
        testHand2 = new Hand(cards2);
        testHand3 = new Hand(cards3);
    }

    // test to determine if the number of hearts in hand is accurate
    @Test
    public void testGetHeartTotal()
    {
        int totalHearts1 = testHand1.getHeartTotal();
        int totalHearts2 = testHand2.getHeartTotal();
        int totalHearts3 = testHand3.getHeartTotal();

        assertEquals(2, totalHearts1);
        assertEquals(6, totalHearts2);
        assertEquals(0, totalHearts3);
    }

    // test to determine if a Joker is present in the hand
    @Test
    public void testHasJoker()
    {
        boolean hasJoker1 = testHand1.hasJoker();
        boolean hasJoker2 = testHand2.hasJoker();
        boolean hasJoker3 = testHand3.hasJoker();

        assertFalse(hasJoker1);
        assertTrue(hasJoker2);
        assertFalse(hasJoker3);
    }

}