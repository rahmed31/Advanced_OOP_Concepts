/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.

intelliJ will be helpful if you do).*/

public class Square extends Shape {
    protected double length;

    public Square(double length, String name) {
        super(name);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return length*4.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Square other = (Square) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.length != other.length) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.length;
    }

}