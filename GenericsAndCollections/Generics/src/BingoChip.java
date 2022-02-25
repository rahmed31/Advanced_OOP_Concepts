public class BingoChip<S, T> {
/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/
    S object1;
    T object2;

    public BingoChip(S object1, T object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Chip: " + this.object1 + "-" + this.object2;
    }
}