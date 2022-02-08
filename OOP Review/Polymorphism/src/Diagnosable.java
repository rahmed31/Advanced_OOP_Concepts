public interface Diagnosable {
    double getTemperature();
/* TODO : Declare a hasFever method that returns true if the temperature is greater than 100.4*/
    int getSystolic();
    int getDiastolic();
    void setSystolic(int s);
    void setDiastolic(int d);
    void setTemperature(double t);
    boolean hasFever();

    /* TODO : Declare two setters. One for systolic and one for diastolic. Check the getters to infer the parameter types. */
}
