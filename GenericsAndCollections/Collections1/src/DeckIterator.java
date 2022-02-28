import java.util.Iterator;

/* TODO
Implement the Iterator interface */

public class DeckIterator<E> implements Iterator<E> {
    Deck d;

    /* TODO
initialize the variable d */

    public DeckIterator(Deck d){
        this.d = d;
    }

       /* TODO
Return true if there are elements left in the Deck */
   @Override
   public boolean hasNext() {
       return this.d.size() > 0;
   }

        /* TODO
Deal a card and return it. */
    @Override
    public E next() {
        return (E)d.dealCard();
    }
}
