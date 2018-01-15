package Test;

import Main.Card;
import Main.Hand;

import org.junit.Before;
import org.junit.Test;

import static Main.Rank.*;
import static Main.Suit.*;
import static org.junit.Assert.*;

public class HandTest
{
    private Hand testHand1, testHand2, testHand3;

    @Before
    public void setUp()
    {
        Card card1 = new Card("Ace", SPADE, ACE);
        Card card2 = new Card("Deuce", HEART, DEUCE);
        Card card3 = new Card("Four", HEART, FOUR);
        Card card4 = new Card("Eight", DIAMOND, EIGHT);
        Card card5 = new Card("King", CLUB, KING);
        Card card6 = new Card("Jack", CLUB, JACK);
        Card card7 = new Card("Queen", CLUB, QUEEN);
        Card joker = new Card("Joker", AMBIGUOUS, JOKER);

        Card[] hand1 = {card1, card2, card3, card4, card5, card6, card7};
        testHand1 = new Hand(hand1);

        card1.setSuit(HEART);
        card4.setSuit(HEART);
        card5.setSuit(HEART);
        card6.setSuit(HEART);
        Card[] hand2 = {card1, card2, card3, card4, card5, card6, joker};
        testHand2 = new Hand(hand2);

        card1.setSuit(CLUB);
        card2.setSuit(CLUB);
        card3.setSuit(CLUB);
        card4.setSuit(CLUB);
        card5.setSuit(CLUB);
        card6.setSuit(CLUB);
        Card[] hand3 = {card1, card2, card3, card4, card5, card6, card7};
        testHand3 = new Hand(hand3);
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