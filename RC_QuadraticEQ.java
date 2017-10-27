
/**
 * Solves for the solutions of a quadration equation using the quadratic equation.
 * NOTE: Assume the equation has two solutions.
 * 
 * Ruhika Chatterjee 
 * 9/19/16
 */
public class RC_QuadraticEQ
{
    public static void main (String args [])
    
    {
        float a = Float.parseFloat(args [0]);
        float b = Float.parseFloat(args [1]);
        float c = Float.parseFloat(args [2]);
        
        double solution1 = (-b + (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        double solution2 = (-b - (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        
        System.out.println("The solutions of " + a+"x^2 + "+b+"x + "+c + " are: " + solution1 + " and " + solution2);
    }
}

/*
 * Sample Input: { "1", "4","4"}
 * Output: The solutions of 1.0x^2 + 4.0x + 4.0 are: -2.0 and -2.0
 */