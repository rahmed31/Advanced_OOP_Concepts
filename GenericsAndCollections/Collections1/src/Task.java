import java.util.ArrayList;
import java.util.HashMap;

public class Task {
    private static HashMap<String, Integer> myMap = new HashMap<>();

    static {
        myMap.put("Ace", 1);
        myMap.put("Jack", 11);
        myMap.put("Queen", 12);
        myMap.put("King", 13);
    }

    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));

        /* TODO
Complete a for loop that prints every card
in the deck d */

        for (Card myCard : d) {
            System.out.println(myCard);
        }

    }

 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/

    public static int addCards(ArrayList<Card> hand) {
        int value = 0;

        for (Card myCard : hand) {
            if (myCard.getValue() instanceof String) {
                value += myMap.get(myCard.getValue());
            }
            else {
                value += (int)myCard.getValue();
            }
        }

        return value;
    }
}