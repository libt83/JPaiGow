package Main;

public enum Suit
{
    HEART("Hearts"), SPADE("Spades"), DIAMOND("Diamonds"), CLUB("Clubs"), AMBIGUOUS("?");

    private String suitName;

    Suit(final String suitName)
    {
        this.suitName = suitName;
    }

    public String getSuitName()
    {
        return this.suitName;
    }

//    public void setSuit(final String newSuit)
//    {
//        this.suitName = newSuit;
//    }
}
