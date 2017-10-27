import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/**
 * Class to represent a school
 */
public class RC_School {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    /**
     * Constructs an empty school
     */
    public RC_School() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();

    }

    /*
        The following is to be implemented as a command line program.
        Please be modular: separate code that will have to be repeated into helper methods.
        Anything and everything can be edited, and there may need to be getters and setters
        added in some of the classes to put everything together. In the main method, write a program
        that asks for what function you would like to run, then runs the function and asks whether or not
        another function should be run. Everything should be command line input and output.
        All of this code compiles as is, though there could be a mistake in the code... good luck!
    */
    
    /*
     * Adds a teacher to the school
     */
    public boolean addTeacher(Teacher newTeacher) {
        if (teachers.contains(newTeacher)) return false;
        teachers.add(newTeacher);
        return true;
    }
    
    /*
     * Adds a student to the school and adds a course
     */
    public boolean addStudent(Student newStudent) {
        if (students.contains(newStudent)) return false;
        students.add(newStudent);
        return true;
    }
    
    public ArrayList<Student> getStudents () {
        return students;
    }
    
    /*
     * Creates a new class in the school and adds a student
     */
    public boolean createClass(Course newClass) {
        if (courses.contains(newClass)) return false;
        courses.add(newClass);
        (newClass.getTeacher()).addClass(newClass);
        return true;
    }
    
    /*
     * Adds a student to the specified course
     */
    public void addStudentToClass(Course classAdd, Student student) {
        classAdd.addStudent(student);
        student.addCourse(classAdd);
    }
    
    /*
     * Uses the given student ID to get and print the grades of the student
     */
    public void getGradesOfStudentByID(int studentID) {
        HashMap <Course, Double> grades = new HashMap();
        for (Student student : students){
            if (student.getID() == studentID){
                grades = student.getGrades();
            }
        }
        
        Set<Course> studentCourses = grades.keySet();
        for (Course course : studentCourses) {
            System.out.println (course.getCourseName() + " " + grades.get(course));
        }
    }
    
    public static void main(String[] args) {
        RC_School PHS = new RC_School();
        Teacher drMiller = new Teacher ("Rick", "Miller", 50, "Male", 172.72, "Grey", 108000, "Hey guys, is everybody here?");
        Course apush = new Course ("APUSH", drMiller, "Room 143");
        Student satya= new Student ("Satya", "Baliga", 15, "Female", 168.2, "Brown", 35762613);
        Student janki = new Student ("Janki", "Raythattha", 16, "Female", 157.48, "Black", 20194023);
        
        PHS.addTeacher (drMiller);
        PHS.createClass (apush);
        PHS.addStudent (satya);
        PHS.addStudent (janki);
        PHS.addStudentToClass (apush, satya);
        PHS.addStudentToClass (apush, janki);
        satya.addGrade (apush, 87.9);
        PHS.getGradesOfStudentByID (35762613);
    }
    // output:
    // APUSH 87.9
}
