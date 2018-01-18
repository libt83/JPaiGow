package Main;

/**
 * Array-based representation of the 7-card PaiGow hand.
 * The cards are stored within the array as 2-character
 * strings (2h, 3d, As, etc..), except for the Joker, which
 * is represented by 2-character string "??".
 **/

public class Hand
{
    // the PaiGow hand
    private Card[] myHand;

    // array that contains suit counts (0=hearts, 1=spades, 2=diamonds, and 3=clubs)
    private int[] suitFreqArr;

    // indicates the presence of a Joker in the hand
    private boolean jokerInHand;

    /**
     * Constructs a PaiGow hand with suit counters and
     * a boolean for the presence of a joker in the hand.
     *
     * @param theHand - the hand
     *
     */
    public Hand(final Card[] theHand)
    {
        this.myHand = theHand;
        this.suitFreqArr = new int[4];
        this.jokerInHand = this.containsJoker();
        this.countSuits();
    }

    /**
     * Evaluates the hand for the presence of a Joker.
     *
     * @return true if present; false otherwise
     */
    private boolean containsJoker()
    {
        for(Card card : this.myHand)
        {
            if(card.getName().toLowerCase().equals("joker"))
                return true;
        }
        return false;
    }

    /**
     * Evaluates the hand's suits and increments their
     * associated suit counter
     */
    private void countSuits()
    {
        for (Card card : this.myHand)
        {
            switch (card.getSuit().charAt(0))
            {
                case 'H':
                    this.suitFreqArr[0] += 1;
                    break;
                case 'S':
                    this.suitFreqArr[1] += 1;
                    break;
                case 'D':
                    this.suitFreqArr[2] += 1;
                    break;
                case 'C':
                    this.suitFreqArr[3] += 1;
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Determines if the hand contains a flush.
     *
     * @return true if flush is present in hand
     */
    public boolean hasFlush()
    {
        for(int suitTotal : this.suitFreqArr)
        {
            if(suitTotal >= 4)
            {
                if(suitTotal == 4 && this.jokerInHand)
                {
                    return true;
                }

                if(suitTotal > 4)
                {
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * Checks to see if the hand has a Joker.
     *
     * @return true if joker is in hand; false otherwise
     */
    public boolean hasJoker()
    {
        return this.jokerInHand;
    }

    /**
     * Gets the total number of cards with a heart suit in the hand.
     *
     * @return the total number of hearts in hand
     */
    public int getHeartTotal()
    {
        return this.suitFreqArr[0];
    }

    /**
     * Gets the total number of cards with a spade suit in the hand.
     *
     * @return the total number of spades in hand
     */
    public int getSpadeTotal()
    {
        return this.suitFreqArr[1];
    }

    /**
     * Gets the total number of cards with a diamond suit in the hand.
     *
     * @return the total number of diamonds in hand
     */
    public int getDiamondTotal()
    {
        return this.suitFreqArr[2];
    }

    /**
     * Gets the total number of cards with a club suit in the hand.
     *
     * @return the total number of clubs in hand
     */
    public int getClubTotal()
    {
        return this.suitFreqArr[3];
    }
}
