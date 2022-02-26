public class Card <V,S> {
    private V value;
    private S suit;

    public Card(V value, S suit){
        this.value = value;
        this.suit = suit;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() { return this.value; }

    public void setSuit(S suit) {
        this.suit = suit;
    }

    public S getSuit() {
        return this.suit;
    }

    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }
}
