
/**
 * Prints roots of polynomial ax^2 + bx + c, prints an appropriate error message if the discriminant is negative, and behaves appropriately avoiding division by zero if a is zero.
 * 
 * Ruhika Chatterjee
 * 9/26/16
 */
public class RC_Quadratic
{
    public static void main (String args [])
    
    {
        float a = Float.parseFloat(args [0]);
        float b = Float.parseFloat(args [1]);
        float c = Float.parseFloat(args [2]);
        
        if (a == 0)
        {
            System.out.println ("The result is not rational. The a cannot be 0.");
        }
        else
        {
            if (Math.pow(b,2)-(4*a*c) < 0)
            {
                System.out.println ("The result is not rational. b^2 - 4ac cannot be negative.");
            }
            else
            {
                double solution1 = (-b + (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
                double solution2 = (-b - (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
                
                System.out.println("The solutions of " + a+"x^2 + "+b+"x + "+c + " are: " + solution1 + " and " + solution2);
            }
        }
    }
}

/*
 * Sample Input: { "1", "4","4"}
 * Output: The solutions of 1.0x^2 + 4.0x + 4.0 are: -2.0 and -2.0
 * 
 * Sample Input: {"0","1","5"}
 * Output: The result is not rational. The a cannot be 0.
 * 
 * Sample Input: {"2","1","1"}
 * Output: The result is not rational. b^2 - 4ac cannot be negative.
 */