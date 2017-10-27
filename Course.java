import java.util.ArrayList;
import java.util.HashMap;
/**
 * Represents Course in school
 */
public class Course {

    private String courseName;
    private Teacher teacher; // teacher of the course
    private ArrayList<Student> students; // students in the course
    private HashMap<Student, Double> grades; // grades for a given student in the course
    private String room; // room course is conducted in

    /**
     * Constructs a course
     */
    public Course(String name, Teacher teacher, String room) {
        this.teacher = teacher; // assigns parameter teacher to
        this.room = room;
        this.students = new ArrayList<>();
        this.grades  = new HashMap<>();
        this.courseName = name;
    }

    /**
     * Add a student to a course
     */
    public boolean addStudent(Student newStudent) {
        if (students.contains(newStudent)) return false;
        students.add(newStudent);
        newStudent.addCourse(this);
        return true;
    }

    /**
     * drop a student from the course
     */
    public boolean dropStudent(Student student) {
        if (students.remove(student)) return false;
        return student.removeCourse(this);
    }

    /**
     * Give a grade to a student
     */
    public boolean assignGrade(Student student, double grade) {
        if (!students.contains(student)) return false;
        grades.put(student, grade);
        student.addGrade(this, grade);
        return true;
    }

    public String getCourseName() {
        return this.courseName;
    }

    /**
     * Print out teacher greeting for class
     */
    public void greetClass() {
        System.out.println(this.teacher.getGreeting());
    }

    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (!(o1 instanceof Course)) return false;
        Course c1 = (Course) o1;
        return c1.getCourseName().equals(this.courseName);
    }

    public int hashCode() {
        return this.courseName.hashCode();
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public Teacher getTeacher () {
        return teacher;
    }
}
