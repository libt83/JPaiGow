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
    private String[] myHand;

    // the suit counters
    private int heartCount, spadeCount,
            diamondCount, clubCount;

    // indicates the presence of a Joker in the hand
    private boolean jokerInHand;

    /**
     * Constructs a PaiGow hand with suit counters and
     * a boolean for the presence of a joker in the hand.
     *
     * @param theHand - the hand
     *
     */
    public Hand(final String[] theHand)
    {
        this.myHand = theHand;
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
        for(String str : this.myHand)
        {
            if(str.equals("??"))
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
        for (String str : this.myHand)
        {
            switch (str.charAt(1))
            {
                case 'h':
                    this.heartCount += 1;
                    break;
                case 's':
                    this.spadeCount += 1;
                    break;
                case 'd':
                    this.diamondCount += 1;
                    break;
                case 'c':
                    this.clubCount += 1;
                    break;
                default:
                    break;
            }
        }
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
        return this.heartCount;
    }

    /**
     * Gets the total number of cards with a spade suit in the hand.
     *
     * @return the total number of spades in hand
     */
    public int getSpadeTotal()
    {
        return this.spadeCount;
    }

    /**
     * Gets the total number of cards with a diamond suit in the hand.
     *
     * @return the total number of diamonds in hand
     */
    public int getDiamondTotal()
    {
        return this.diamondCount;
    }

    /**
     * Gets the total number of cards with a club suit in the hand.
     *
     * @return the total number of clubs in hand
     */
    public int getClubTotal()
    {
        return this.clubCount;
    }
}
