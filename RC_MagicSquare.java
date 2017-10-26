/**
 * Write a program that reads in 16 values from the keyboard and tests whether they form a magic square when put into a 4 × 4 array.
 * 
 * Magic squares. An n × n matrix that is filled with the numbers 1,2,3,...,n^2 is a magic square if the sum of the elements in 
 * each row, in each column, and in the two diagonals is the same value.
 * 
 * You need to test two features:
 * 1. Does each of the numbers 1, 2, ..., 16 occur in the user input?
 * 2. When the numbers are put into a square, are the sums of the rows, columns, and diagonals equal to each other?
 * 
 * Ruhika Chatterjee
 * 11/22/16
 */

import java.util.Scanner;
public class RC_MagicSquare
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        int N = 4;
        
        System.out.println ("Print " + Math.pow(N,2) + " numbers to put in the Magic Square reading by row");
        
        int [][] magicSquare = new int[N][N];
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) magicSquare[i][j] = scan.nextInt();
        
        boolean inRange = true;
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (magicSquare[i][j]<0 || magicSquare[i][j] > Math.pow(N,2)) inRange = false;
        
        boolean hasAllNumbers = true;
        boolean hasNum;
        for (int b = 1; b < Math.pow(N,2); b++){
            hasNum = false;
            for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (magicSquare[i][j] == b) hasNum = true;
            if (!hasNum) hasAllNumbers = false;
        }
        
        boolean rowsEqual = true;
        int [] sumRow = new int [N];
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) sumRow[i]+= magicSquare[i][j];
        for (int i = 1; i < N; i++) if (sumRow[0]!=sumRow[i]) rowsEqual = false;
        
        boolean columnsEqual = true;
        int [] sumColumn = new int [N];
        for (int j = 0; j < N; j++) for (int i = 0; i < N; i++) sumColumn[j]+= magicSquare[i][j];
        for (int i = 1; i < N; i++) if (sumColumn[0]!=sumColumn[i]) columnsEqual = false;
        
        boolean diagonalsEqual = false;
        int rightDiaSum = 0; int leftDiaSum = 0;
        for (int i = 0; i < N; i++) {
            rightDiaSum += magicSquare [i][i];
            leftDiaSum += magicSquare [N-1-i][N-1-i];
        }
        if (rightDiaSum == leftDiaSum) diagonalsEqual = true;
        
        if (inRange && hasAllNumbers && rowsEqual && columnsEqual && diagonalsEqual){
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)  System.out.printf ("%3d", magicSquare[i][j]);
                System.out.println();
            }
            System.out.println ("The numbers given make a magic square.");
        }
        else System.out.println ("The numbers given do not make a magic square.");
    }
}

/*
 * Print 16.0 numbers to put in the Magic Square reading by row
 * 16
 * 3
 * 2
 * 13
 * 5
 * 10
 * 11
 * 8
 * 9
 * 6
 * 7
 * 12
 * 4
 * 15
 * 14
 * 1
 *    16  3  2 13
 *    5 10 11  8
 *    9  6  7 12
 *    4 15 14  1
 *    The numbers given make a magic square.

 */
