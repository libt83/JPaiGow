package Main;

public enum Suit
{
    HEART("Hearts"), SPADE("Spades"), DIAMOND("Diamonds"), CLUB("Clubs");

    private String cardName;

    Suit(final String cardName)
    {
        this.cardName = cardName;
    }

    public String getCardName()
    {
        return this.cardName;
    }
}
