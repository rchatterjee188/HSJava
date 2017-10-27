import java.util.ArrayList;
import java.util.HashMap;
/**
 * Represents a student
 * Extends person so that means it "inherits" data of Person
 */
public class Student extends Person {

    private double GPA; // GPA of student
    private int studentID; // student ID of student
    private HashMap<Course, Double> grades; // grade of student for a given course
    private ArrayList<Course> courses; // list of courses taken by student

    /**
     * Constructs a Student, first by constructing a Person then by constructing the additional parts of a student
     */
    public Student(String firstName, String lastName, int age, String gender,
        double height, String hairColor, int studentID) {

            // this is an extension of person so must first create the person (super(...) is constructor of parent class)
            super(firstName, lastName, age, gender, height, hairColor);
            this.studentID = studentID;
            grades = new HashMap<>();
            courses = new ArrayList<>();

    }

    public boolean addCourse(Course c) {
        if (courses.contains(c)) return false;
        courses.add(c);
        return true;
    }

    public boolean removeCourse(Course c) {
        return courses.remove(c);
    }

    public void addGrade(Course c, double grade) {
        grades.put(c, grade);
    }
    
    public int getID (){
        return studentID;
    }
    
    public HashMap <Course, Double> getGrades () {
        return grades;
    }
}
