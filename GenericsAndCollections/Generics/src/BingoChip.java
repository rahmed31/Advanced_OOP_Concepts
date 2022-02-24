public class BingoChip<String, T> {
/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/
    String object1;
    T object2;

    public BingoChip(String object1, T object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public java.lang.String toString() {
        return "Chip: " + this.object1 + "-" + this.object2;
    }
}