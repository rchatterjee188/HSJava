
/**
 * A test/driver class with the following activities:
 * 
 * NOTE: Be creative 
 * WARNING: You can make changes to the implementations if you need to.
 * 
 * 1. Create at least 5 students.
 * 2. Create at least 4 teachers.
 * 3. Create at least 3 courses.
 * 4. Create a school, PHS. 
 * 5. Add all the components accordingly.
 * 6. Add courses to at least 2 students.
 * 7. Add all students to PHS.
 * 8. Add all teachers to PHS.
 * 9. Add at least 2 students to a course.
 * 10. Print all students names from the teacher above.
 * 11. Print all PHS students names.
 * 
 * Ruhika Chatterjee
 * 5/22/17
 */

import java.util.ArrayList;
public class RC_MySchool
{
    public static void main (String[] args)
    {
        // Create 5 sudents
        Student ruhika = new Student ("Ruhika", "Chatterjee", 15, "Female", 160.1, "Black", 30000738);
        Student satya = new Student ("Satya", "Baliga", 15, "Female", 168.2, "Brown", 35762613);
        Student janki = new Student ("Janki", "Raythattha", 16, "Female", 157.48, "Black", 20194023);
        Student ashley = new Student ("Ashley", "Wang", 15, "Female", 160., "Black", 67984173);
        Student john = new Student ("John", "Liang", 15, "Male", 165.3, "Black", 04515045);
        
        // Create 4 teachers
        Teacher drMiller = new Teacher ("Rick", "Miller", 50, "Male", 172.72, "Grey", 108000, "Hey guys, is everybody here?");
        Teacher msElia = new Teacher ("Graciela", "Elia", 46, "Female", 159.4, "Blond", 113000, "Good morning, everybody!");
        Teacher mrThayer = new Teacher ("Aaron", "Thayer", 40, "Male", 167.4, "Brown", 82000, "Hello, you bafoons!");
        Teacher snraHayden = new Teacher ("Martha", "Hayden", 63, "Female", 154.2, "Brown", 85000, "Hola, clase!");
        
        // Create 3 courses
        Course apush = new Course ("APUSH", drMiller, "Room 143");
        Course java = new Course ("Java", msElia, "Room 242");
        Course english = new Course ("English II", mrThayer, "Room 142");
        
        // Create a school, PHS
        RC_School PHS = new RC_School();
        
        // Add all the components accordingly
        PHS.createClass (apush);
        PHS.createClass (java);
        PHS.createClass (english);
        
        // Add all students to PHS
        PHS.addStudent (ruhika);
        PHS.addStudent (satya);
        PHS.addStudent (janki);
        PHS.addStudent (ashley);
        PHS.addStudent (john);
        
        // Add all teachers to PHS
        PHS.addTeacher (drMiller);
        PHS.addTeacher (msElia);
        PHS.addTeacher (mrThayer);
        PHS.addTeacher (snraHayden);
        
        // Add courses to at least 2 students and at least 2 students to a course
        PHS.addStudentToClass (apush, ruhika);
        PHS.addStudentToClass (apush, janki);
        PHS.addStudentToClass (java, satya);
        PHS.addStudentToClass (java, ruhika);
        PHS.addStudentToClass (java, john);
        PHS.addStudentToClass (english, ashley);
        
        // Print all students names from the teacher above (msElia)
        System.out.println ("Ms. Elia's students are:");
        for (Student student :  msElia.getStudents()) System.out.println (student.toString());
        System.out.println ();
        
        
        // Print all PHS students names
        System.out.println ("All students:");
        for (Student student : PHS.getStudents()) System.out.println (student.toString());
    }
}

/*
 * Ms. Elia's students are:
 * Satya Baliga
 * Ruhika Chatterjee
 * John Liang
 * 
 * All students:
 * Ruhika Chatterjee
 * Satya Baliga
 * Janki Raythattha
 * Ashley Wang
 * John Liang
 */
