package Main;

public class Card
{
    private String name;

    private Suit suit;

    private Rank rank;

    public Card(final String name, Suit suit, Rank rank)
    {
        this.name = name;
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit()
    {
        return this.suit.getSuitName();
    }

    public int getRank()
    {
        return this.rank.getCardRank();
    }

    public String getName()
    {
        return this.name;
    }

    public void setSuit(final Suit newSuit)
    {
        this.suit = newSuit;
    }

}
