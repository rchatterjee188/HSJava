
/**
 * Prompt the user for an integer, n. The program displays an n-by-n table such a that there is an * in row i and 
 * column j if the gcd of i and j is 1 ( i and j are relatively prime) and a space in that position otherwise.
 * 
 * Ruhika Chatterjee
 * 10/19/16
 */
import java.util.Scanner;
public class RC_RelativelyPrime
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Please enter an integer: ");
        int N = scan.nextInt ();
        int gcd, rem, i, j;
        
        for (int m = 1; m <= N; m ++)System.out.print ("\t" + m);
        System.out.println ();
        for (int row = 1; row <= N; row ++){
            System.out.print (row + "\t");
            for (int column = 1; column <= N; column++){
                if (column >= row){
                    j = column;
                    i = row;
                }
                else{
                    j = row;
                    i = column;
                }
                
                while (i > 0){
                    rem = j % i;
                    j = i;
                    i = rem;
                }
                gcd = j;
                 
                if (gcd == 1) System.out.print ("*");
                else System.out.print (" ");
                System.out.print ("\t");
            }
            System.out.println ();
        }
    }
}

/*
 * Sample Output:
 * Please enter an integer: 10
 *      1	2	3	4	5	6	7	8	9	10
 * 1	*	*	*	*	*	*	*	*	*	*	
 * 2	*	 	*	 	*	 	*	 	*	 	
 * 3	*	*	 	*	*	 	*	*	 	*	
 * 4	*	 	*	 	*	 	*	 	*	 	
 * 5	*	*	*	*	 	*	*	*	*	 	
 * 6	*	 	 	 	*	 	*	 	 	 	
 * 7	*	*	*	*	*	*	 	*	*	*	
 * 8	*	 	*	 	*	 	*	 	*	 	
 * 9	*	*	 	*	*	 	*	*	 	*	
 * 10	*	 	*	 	 	 	*	 	*	 	
 */
