
/**
 * Create an array of integers, arrayA. Do not initialize the array. Traverse it and print each element. In a comment paste the error message and fix the problem.
 * 
 * Using a for-loop, create an array of integers, arrayB. Initialize each element to a multiple of the index. Display indices and the value of each element next to it.
 * 
 * Use a one dimensional array, arrayGrades to store grades of type double. Prompt the user for a maximum of 20 grades using a for-loop .
 * Find the average and display it. Traverse the array and find the max and the min grade. Display them both next to the average. Include titles.
 * 
 * Using a for-loop, create an array of integers with 10 elements. Access elements with index 10, and index -1. In comments paste the error message.
 * 
 * Ruhika Chatterjee
 * 11/2/16
 */

import java.util.Scanner;
public class RC_ArraysAssignments1
{
    public static void main (String args [])
    {
        // Question 1
        int [] arrayA = new int [5];
        for (int i = 0; i < arrayA.length; i++) System.out.println (arrayA [i]);
        // if: int [] arrayA; error: variable arrayA might not have been initialized
        /*
         * 0
         * 0
         * 0
         * 0
         * 0
         */
        
        
        //Question 2
        int [] arrayB = new int [10];
        for (int i = 0; i < arrayB.length; i++) arrayB[i] = i * 37;
        for (int i = 0; i < arrayB.length; i++) System.out.println ("Index: " + i + "  Value: " + arrayB[i]);
        /*
         * Index: 0  Value: 0
         * Index: 1  Value: 37
         * Index: 2  Value: 74
         * Index: 3  Value: 111
         * Index: 4  Value: 148
         * Index: 5  Value: 185
         * Index: 6  Value: 222
         * Index: 7  Value: 259
         * Index: 8  Value: 296
         * Index: 9  Value: 333
         */
        
        
        //Question 3 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!FIX OUTPUT!! YESNO BOOLEAN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Scanner scan = new Scanner (System.in);
        double [] arrayGrades = new double [20];
        int gradeCounter = 0;
        boolean yesNo = true;
        while (yesNo && gradeCounter < arrayGrades.length) {
            System.out.print ("Type a grade: ");
            gradeCounter ++;
            arrayGrades[gradeCounter-1] = scan.nextDouble ();
            System.out.print ("Continue (true/false)? ");
            yesNo = Boolean.parseBoolean(scan.next ());
        }
        double sum = 0;
        for (int i = 0; i < arrayGrades.length; i++) sum += arrayGrades[i];
        double average = sum / (double) gradeCounter;
        System.out.println ("The average is " + average);
        double max = arrayGrades[0];
        double min = arrayGrades[0];
        for (int i = 1; i < gradeCounter; i++) {
            if (arrayGrades [i] > max) max = arrayGrades[i];
            if (arrayGrades [i] < min) min = arrayGrades[i];
        }
        System.out.println ("The minimum is " + min);
        System.out.println ("The maximum is " + max);
        /*
         * Type a grade: 100
         * Continue (true/false)? true
         * Type a grade: 98
         * Continue (true/false)? true
         * Type a grade: 87
         * Continue (true/false)? true
         * Type a grade: 83
         * Continue (true/false)? false
         * The average is 92.0
         * The minimum is 83.0
         * The maximum is 100.0
         */
        
        
        //Question 4
        int [] array1 = new int [10];
        for (int i = 0; i < array1.length; i++) array1[i] = (int) (Math.random()*10);
        System.out.println (array1[10]); //java.lang.ArrayIndexOutOfBoundsException: 10 at RC_ArraysAssignments1.main(RC_ArraysAssignments1.java:73)
        System.out.println (array1[-1]); //java.lang.ArrayIndexOutOfBoundsException: -1 at RC_ArraysAssignments1.main(RC_ArraysAssignments1.java:86)
    }
}
