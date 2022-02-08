import java.util.ArrayList;

/* TODO : Implement the class Adult Patient. An adult patient is a Person that is Diagnosable and that is Employable. */

public class AdultPatient extends Person implements Employable, Diagnosable {
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> PreviousJobs = new ArrayList<>();

    @Override
    public void addJob(String job) {
        PreviousJobs.add(job);
    }

    @Override
    public ArrayList<String> getPreviousJobs() {
        return (ArrayList<String>) PreviousJobs.clone();
    }

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