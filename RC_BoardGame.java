/**
 * Using two nested loops, initialize the board so that zeroes and ones alternate, as on a checkerboard:
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * ...
 * 1 0 1 0 1 0 1 0
 * Prompt the user for the size of the "square" 2D array and display the board on the screen.
 * 
 * Ruhika Chatterjee
 * 11/21/16
 */

import java.util.Scanner;
public class RC_BoardGame
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Size of the board: ");
        int N = scan.nextInt ();
        int[][] board = new int[N][N];
        
        for (int i = 0; i < board.length; i++){
            if (i%2==0) for (int j = 1; j < board[i].length; j+=2) board[i][j] = 1;
            if (i%2==1) for (int j = 0; j < board[i].length; j+=2) board[i][j] = 1;
        }
        
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) System.out.printf ("%2d", board[i][j]);
            System.out.println ();
        }
    }
}

/*
 * Size of the board: 8
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 */