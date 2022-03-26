 /* TODO
This class is exactly as the Racer from Task 1*/
public class Racer implements Runnable {
    Car c;
    int distance = 1000;

    public Racer(Car c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (c.odometer < distance) {
            c.move(1);
            if (c.miles == 0) {
                System.out.println("Charging");

                try {
                    Thread.sleep((long) c.maxMiles);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                c.charge();
            }
        }
    }
}