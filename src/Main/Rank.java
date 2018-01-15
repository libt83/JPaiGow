package Main;

public enum Rank
{
    DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(12), QUEEN(13), KING(14),
    ACE(15), JOKER(0);

    private int cardRank;

    Rank(final int cardRank)
    {
        this.cardRank = cardRank;
    }

    /**
     * Gets the rank of the card.
     *
     * @return the card's rank
     */
    public int getCardRank()
    {
        return this.cardRank;
    }

    /**
     * Sets the joker's rank when used in straights
     * or for ace high.
     *
     * @param newRank - the joker's new rank.
     */
    public void setJokerRank(final int newRank)
    {
        this.cardRank = newRank;
    }
}
