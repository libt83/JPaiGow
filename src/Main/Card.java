package Main;

class Card
{
    private String name;

    private Suit suit;

    Card(final String name, final Suit suit)
    {
        this.name = name;
        this.suit = suit;
    }

    public String getSuit()
    {
        return this.suit.getName();
    }
}
