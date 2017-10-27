
/**
 * Takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise
 * 
 * Ruhika Chatterjee
 * 9/26/16
 */
public class RC_AllEqual
{
    public static void main (String args [])
    {
        int arg1 = Integer.parseInt (args[0]);
        int arg2 = Integer.parseInt (args[1]);
        int arg3 = Integer.parseInt (args[2]);
        
        if (arg1 == arg2 && arg2 == arg3) System.out.println("Those numbers are equal.");
        else System.out.println ("Those numbers are not equal.");
    }
}

/*
 * Sample Input: {"1","1","1"}
 * Sample Output: Those numbers are equal.
 * 
 * Sample Input: {"2","1","1"}
 * Sample Output: Those numbers are not equal.
 */