/* TODO */
import java.util.*;

public class Resume {
/* TODO
Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.*/
/* TODO
Create a member variable of type Person (exactly as in task 2)*/
/* TODO
Create a List to hold values of type Education (exactly as in task 2)*/
/* TODO
Create a Priority Queue that holds values of type Experience.*/
/* TODO
Assign a value to the Person variable.*/
/* TODO
Initialize the List with Education objects.*/
/* TODO
Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.*/

/* TODO
Add a standard getter for the experiences. getExperience. it should return a priority queue.*/

/* TODO
Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste) */

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
        experienceList = new PriorityQueue<>(new Comparator<Experience>() {
            @Override
            public int compare(Experience o1, Experience o2) {
                if (o2.toYear == o1.toYear) {
                    return 0;
                }
                else if(o2.toYear - o1.toYear < 0) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
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
