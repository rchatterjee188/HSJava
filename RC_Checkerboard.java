/**
 * Takes an argument N and prints out a two dimensional N-by-N checkerboard pattern with alternating
 * spaces and asterisks, like the following 4-by-4 pattern.
 * 
 * Ruhika Chatterjee
 * 10/4/16
 */
import java.util.Scanner;
public class RC_Checkerboard
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Please print a value for the dimension of the checker board:");
        int N = scan.nextInt ();
        
        for (int i = 0; i < N; i ++){
            for (int b = 0; b < N; b ++){
                if (i % 2 == 0)System.out.print ("* ");
                else System.out.print (" *");
            }
            System.out.println();
        }
    }
}

/*
 * Sample Output:
 Please print a value for the dimension of the checker board:
6
* * * * * * 
 * * * * * *
* * * * * * 
 * * * * * *
* * * * * * 
 * * * * * *
 */