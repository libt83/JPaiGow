package Main;

public enum Suit
{
    HEART("Hearts"), SPADE("Spades"), DIAMOND("Diamonds"), CLUB("Clubs");

    private String name;

    Suit(final String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
