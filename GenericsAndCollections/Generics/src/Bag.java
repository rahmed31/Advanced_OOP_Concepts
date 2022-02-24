import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    private ArrayList<T> objects;
    private Random randomGenerator;

    public Bag() {
        objects = new ArrayList<T>();
        randomGenerator = new Random();
        /* TODO 
Initialize the objects variable*/
    }

    public void add(T newObject) throws BagException {
        if (newObject != null) {
            objects.add(newObject);
        }
        else {throw new BagException("Cannot add null to a Bag");}
    }
    /* TODO
code the add method described. It should be public and not
return anything. Just take in a parameter and  throw an
exception. Read the documentation for this.*/

    public T drawOne() {
//        int index = randomGenerator.nextInt(objects.size());
        return objects.get(randomGenerator.nextInt(objects.size()));
    }
 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/

    public ArrayList<T> drawMany(int howMany){
        ArrayList<T> myObjects = new ArrayList<T>();

        for (int i = 0; i < howMany; i++) {
            myObjects.add(drawOne());
        }

        return myObjects;

/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */
    }

    public void add(T element, double prob) throws BagException{
        /* TODO 
Check that the probability is between 0 and 1. Otherwise
throw an exception. */        // This is a way to add elements in a given proportion.

//        if (prob < 0 ^ prob > 1) {
//        }

        int tot = (int) Math.round(objects.size()*prob);

        for(int i = 0; i < tot; i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}
