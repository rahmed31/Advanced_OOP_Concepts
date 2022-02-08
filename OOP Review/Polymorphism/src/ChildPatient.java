public class ChildPatient extends Person implements Diagnosable{
    double temperature;
    int systolic;
    int diastolic;

    @Override
    public void setTemperature(double t) {
        temperature = t;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setSystolic(int s) {
        systolic = s;
    }

    @Override
    public int getSystolic() {
        return systolic;
    }

    @Override
    public void setDiastolic(int d) {
        diastolic = d;
    }

    @Override
    public int getDiastolic() {
        return diastolic;
    }

    @Override
    public boolean hasFever() {return this.temperature > 100.4;}
}
