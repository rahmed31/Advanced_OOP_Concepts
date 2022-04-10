/* TODO
Copy the Person class from Task 2 here. Copy->Paste*/

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    private class Position {
        protected String name;
        protected double salary;

        public Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + ":" + salary;
        }
    }

    public Person(String name, String birthdate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthdate);
    }

    private Position position;

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public void setPosition(String title, double salary) {
        this.position = new Position(title, salary);
    }

    public String getPosition() {
        return position.toString();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.getAge() + "\n" + this.getPosition();
    }
}