import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private final String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    private final String[] faceCards = {"Ace", "Jack", "Queen", "King"};
    private static final Random randomGenerator = new Random();

    /* TODO
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/

    public Deck() {
        //What's the difference between instantiating and initializing the deck over here
        //vs doing it up above?
        deck = new LinkedList<Card>();

        for (String suit : suits) {
            for (int j = 2; j < 11; j++) {
                deck.add(new Card<Integer, String>(j, suit));
            }

            for (String faceCard : faceCards) {
                deck.add(new Card<String, String> (faceCard, suit));
            }
        }
    }

    /* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */

    public Card dealCard() {

        Card myCard = deck.get(randomGenerator.nextInt(deck.size()));

        deck.remove(myCard);

        return myCard;
    }

    /* TODO: Return the size of the deck (number of cards left in it)*/

    public int size() {
        return deck.size();
    }

       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/

    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator<>(this);
    }
}
