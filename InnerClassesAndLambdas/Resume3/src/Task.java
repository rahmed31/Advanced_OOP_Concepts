public class Task {
    public static void main(String[] args){
/* TODO
This code is exactly the same as in Task 3 and should yield the same output. */
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        Resume.Education edu = r.new Education("NEIU", "Computer Science");

        r.addEducation(edu);

        r.addExperience(new Resume.Experience("Software Engineer", 2018, 2019));

        r.addExperience(new Resume.Experience("Data Engineer", 2019, 2022));

        System.out.println(r); //watch the resume print.
    }
}