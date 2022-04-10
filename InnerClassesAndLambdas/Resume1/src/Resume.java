import java.util.ArrayList;
import java.util.List;

public class Resume {
/* TODO
Create a public member inner class Education according to the specifications.*/

    public class Education {
        public String school;
        public String major;

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getSchool() {
            return this.school;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getMajor() {
            return this.major;
        }

        @Override
        public String toString() {
            return this.major + " at " + this.school;
        }
    }


/* TODO
Create a public static inner class called Experience, according to the specifications. */

    public static class Experience {
        public String title;
        public int start;
        public int toYear;

        public Experience(String title, int start, int end) {
            this.title = title;
            this.start = start;
            this.toYear = end;
        }

        @Override
        public String toString() {
            return start + "-" + toYear + ": " + title;
        }
    }

/* TODO
Create the Person and List of Education and List of experience objects. They should be private.*/

    private Person person;
    private List<Education> educationList = new ArrayList<>();
    private List<Experience> experienceList = new ArrayList<>();

    /* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work.*/
    public Resume(Person p){
        this.person = p;
    }

/* TODO
Create the addEducation, addExperience and override the toString methods as specified.*/
    public void addExperience(Experience e) {
        experienceList.add(e);
    }

    public void addEducation(Education e) {
        educationList.add(e);
    }

    @Override
    public String toString() {
        return person.toString()
                + "\nExperience"
                + "\n" + experienceList.toString()
                + "\nEducation"
                + "\n" + educationList.toString();
    }

}
