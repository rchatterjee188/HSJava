
/**
 * Good resource: http://docs.oracle.com/javase/tutorial/essential
 * Prompt the user for two numbers. One should be the base and the other one the exponent. T
 * he prompts should be clear about which number is the base and which one is the exponent. 
 * Also, prompt the user for his or her name. Print a message with all the information given and the calculated value.
 * 
 * To exit: Ctrl+Z
 * Ruhika Chatterjee
 * 9/27/16
 */
import java.util.Scanner;
public class RC_ScannerTest
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        String name; // only a declaration
        Double base, exponent;
        
        System.out.println ("Enter the base: ");
        base = scan.nextDouble ();
        System.out.println ("Enter the exponent: ");
        exponent = scan.nextDouble ();
        System.out.println ("Enter your name: ");
        name = scan.next ();
        
        System.out.println ("The value is: " + Math.pow (base, exponent));
        System.out.println ("The integer value is: " + (int) Math.pow (base, exponent));
    }
}

/*
 * Sample Output:
 * Enter the base: 
2
Enter the exponent: 
7
Enter your name: 
Ruhika
The value is: 128.0
The integer value is: 128
 */