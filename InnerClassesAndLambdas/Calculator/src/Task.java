import java.util.ArrayList;
import java.util.List;

public class Task {
/* TODO
Create a public static inner class called Triplet with generics for a first, second and third element. All variables should be public.*/

    public static String result = "";

    public static class Triplet<K, T, V> {
         K v1;
         T v2;
         V v3;

        public Triplet(K v1, T v2, V v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4, 5.2, "+"));
        t.add(new Triplet<>(2.3, 1.23, "-"));
/* TODO
Add the code to add a multiplication of 4.5 x 5.4, a division by zero, and divide 56.0/28.0*/

        t.add(new Triplet<>(4.5, 5.4, "*"));
        t.add(new Triplet<>(6.0, 0.0, "/"));
        t.add(new Triplet<>(56.0, 28.0, "/"));

       /* TODO
Utilizing a lambda expression, use the calculator to compute the operation specified in each Triplet with the corresponding numbers.*/

        t.forEach((n) -> result += c.compute(n.v1, n.v2, n.v3) + " ");

        System.out.println(result);
    }
}