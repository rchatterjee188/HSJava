
/**
 * Finds the greatest common divisor of two integers using the Euclidean Algorithm
 * 
 * The Euclidean Algorithm for finding GCD(A,B) is as follows:
 * If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
 * If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
 * Write A in quotient remainder form (A = B⋅Q + R)
 * Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
 * 
 * Ruhika Chatterjee
 * 10/18/16
 */
public class RC_GCD
{
    public static void main (String args [])
    {
        int x = Integer.parseInt (args[0]);
        int y = Integer.parseInt (args[1]);
        int gcd = 0;
        int r;
        
        if (x < y){
            int h = x;
            x = y;
            y = h;
        }
        if (x == 0) gcd = y;
        else{
            if (y == 0) gcd = x;
        }
        while (y > 0){
            r = x % y;
            x = y;
            y = r;
        }
        
        gcd = x;
        System.out.println ("The greatest common divisor is " + gcd);
    }
}

/*
 * Sample Input: {"270","192"}
 * Sample Output: The greatest common divisor is 6
 */
