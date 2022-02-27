import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
import java.util.Map.Entry;

public class Counter<E> {
    /* TODO
The HashMap should accommodate a generic class for the keys and Integer for the value*/

    private HashMap<E, Integer> counts;

    /* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */

    public Counter(E[] things) {
        counts = new HashMap<E, Integer>();

        for (E thing : things) {
            Integer count = counts.get(thing);
            if (count == null) {
                count = 0;
            }
            counts.put(thing, count + 1);
        }

    }

      /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */

    public Integer getCount(E element) {
        return counts.get(element);
    }

    public int getSize() {
        return this.counts.size();
    }

 /* TODO
Returns the most frequent key in the HashMap*/

     public E mostFrequent() {
         E key = null;

         int maxValueInMap = (Collections.max(counts.values()));  // This will return max value in the Hashmap

         for (Entry<E, Integer> entry : counts.entrySet()) {  // Iterate through hashmap
             if (entry.getValue() == maxValueInMap) {
                 key = (E) entry.getKey();     // get the key that has the max value
             }
         }

         return key;
     }
 }
