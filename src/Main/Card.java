package Main;

class Card
{
    private String name;

    private Suit suit;

    private Rank rank;

    Card(final String name, Suit suit, Rank rank)
    {
        this.name = name;
        if(!name.equals("Joker"))
            this.suit = suit;
        this.rank = rank;
    }

    public String getSuit()
    {
        return this.suit.getCardName();
    }

}
