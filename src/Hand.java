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
        this.heartCount = 0;
        this.spadeCount = 0;
        this.diamondCount = 0;
        this.clubCount = 0;
        countSuits(this.myHand);
    }

    /**
     * Evaluates the hand's suits and increments their
     * associated suit counter
     *
     * @param theHand - the hand
     */
    private void countSuits(final String[] theHand)
    {
        for (int i = 0; i < myHand.length; i++)
        {
            switch (myHand[i].charAt(1))
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
}
