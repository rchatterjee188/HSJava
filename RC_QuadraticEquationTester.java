/**
 * Write a test program that prompts the user to enter values for a, b, and c and displays the result 
 * based on the discriminant. If the discriminant is positive, display the two roots. If the discriminant 
 * is 0, display the one root. Otherwise, display “The equation has no roots.” 
 * 
 * Ruhika Chatterjee
 * 3/20/17
 */

import java.util.Scanner;
public class RC_QuadraticEquationTester
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Please input variable a: ");
        int a = scan.nextInt ();
        System.out.print ("Please input variable b: ");
        int b = scan.nextInt ();
        System.out.print ("Please input variable c: ");
        int c = scan.nextInt ();
        
        RC_QuadraticEquation equation1 = new RC_QuadraticEquation (a, b, c);
        System.out.println ("The coefficients are: " + equation1.getA () + ", " + equation1.getB () + ", and " + equation1.getC ());
        System.out.println ("The discriminant is: " + equation1.getDiscriminant ());
        if (equation1.getDiscriminant () < 0) System.out.println ("There are no real roots");
        else
        {
            if (equation1.getDiscriminant () == 0) System.out.println ("The root is: " + equation1.getRoot1 ());
            else System.out.println ("The roots are: " + equation1.getRoot1 () + " and " + equation1.getRoot2 ());
        }
    }
}

/*
 * Please input variable a: 1
 * Please input variable b: 6
 * Please input variable c: 9
 * The coefficients are: 1.0, 6.0, and 9.0
 * The discriminant is: 0.0
 * The root is: -3.0
 * 
 * Please input variable a: 4
 * Please input variable b: 1
 * Please input variable c: 4
 * The coefficients are: 4.0, 1.0, and 4.0
 * The discriminant is: -63.0
 * There are no real roots
 * 
 * Please input variable a: 1
 * Please input variable b: -6
 * Please input variable c: 8
 * The coefficients are: 1.0, -6.0, and 8.0
 * The discriminant is: 4.0
 * The roots are: 4.0 and 2.0
 */
