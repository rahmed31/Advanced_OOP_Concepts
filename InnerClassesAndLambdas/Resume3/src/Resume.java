import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO
Same two inner classes and member variables as in task 3.*/

/* TODO
Same initialization of Person and the List of Education objects*/
 /* TODO
Initialize the priority queue in one line, without importing the Comparator interface.*/

/* TODO
The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()*/

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

    private Person person;
    private List<Education> educationList;
    private PriorityQueue<Experience> experienceList;

    public Resume(Person p){
        this.person = p;
        educationList = new ArrayList<>();
        experienceList = new PriorityQueue<>((Experience o1, Experience o2) -> o2.toYear == o1.toYear ? 0 : o2.toYear - o1.toYear < 0 ? -1 : 1);
    }

    public void addExperience(Experience e) {
        experienceList.add(e);
    }

    public void addEducation(Education e) {
        educationList.add(e);
    }

    public PriorityQueue getExperience() {
        return experienceList;
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
