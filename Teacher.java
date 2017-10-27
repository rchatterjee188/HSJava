import java.util.ArrayList;
/**
 * Represents a teacher
 * Extends person so that means it "inherits" data of Person
 */
public class Teacher extends Person {

    private int salary; // salary of teacher
    private String degree; // degree teacher contains
    private ArrayList<Course> courses; // courses a teacher teaches
    private int vacationDays; // vacation days teacher has remaining
    private String greeting; // teacher greeting

    /**
     * Constructs a Teacher, first by constructing a Person, then adding additional data of Teacher
     */
    public Teacher(String firstName, String lastName, int age, String gender,
        double height, String hairColor, int startingSalary, String greeting) {

            // this is an extension of person so must first create the person (super(...) is constructor of parent class)
            super(firstName, lastName, age, gender, height, hairColor);
            this.salary  = startingSalary;
            this.courses = new ArrayList<>();
            this.vacationDays = 20; // teacher starts w/ 20 vacation days
            this.greeting = greeting;
    }

    /**
     * Gets greeting of teacher
     */
    public String getGreeting() {
        return this.greeting;
    }
    
    public void addClass (Course course) {
        courses.add(course);
    }
    
    public ArrayList<Course> getClasses () {
        return courses;
    }
    
    public ArrayList<Student> getStudents (){
        ArrayList<Student> students = new ArrayList<>();
        for (Course course : courses) {
            for (Student student : course.getStudents()){
                if (!students.contains(student)) students.add(student);
            }
        }
        return students;
    }
}
