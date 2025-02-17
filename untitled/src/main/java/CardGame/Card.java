package CardGame;

public class Card {
    private Suit suit;
    private String symbol;
    private int value;


//Getters and Setters
    public Suit getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    //    Making a Card
    public Card(Suit suit, String symbol, int value){
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

//toString
    @Override
    public String toString(){
        return symbol + " of " + suit.getSymbol();
    }

}
