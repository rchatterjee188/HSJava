
/**
 * Input the number n whose output is the magic square of order n if n is odd. Include the code to 
 * check the new array is in fact a Magic Square. Display the sum of the columns, rows and diagonals.
 * 
 * Implement the following algorithm to construct magic n × n squares; it works only if n is odd.
 * 
 * Set row = n - 1, column = n / 2.
 * For k = 1 ... n * n
 * Place k at [row][column].
 * Increment row and column.
 * If the row or column is n, replace it with 0.
 * If the element at [row][column] has already been filled
 * {Set row and column to their previous values.
 * Decrement row.}
 * 
 * Ruhika Chatterjee
 * 11/30/16
 */

import java.util.Scanner;
public class RC_MagicNSquare
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        
        // Create the magic square with size nxn
        int n = 0;
        System.out.print ("Print an odd number of the size of the magic square: ");
        while (n%2 == 0) n = scan.nextInt ();
        int [][] square = new int [n][n];
        
        // Go through given algorithm to assign values to the square for magic square
        int row = n - 1;
        int column = n / 2;
        for (int k = 1; k <= Math.pow(n,2); k++){
            if (square[row][column] != 0){
                if (row == 0) row = n;
                row -= 2;
                if (column == 0) column = n;
                column --;
            }
                
            square[row][column] = k;
            row ++; column ++;
            if (row == n) row = 0;
            if (column == n) column = 0;
        }
        
        // Display the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)  System.out.printf ("%3d", square[i][j]);
            System.out.println();
        }
        System.out.println();
        
        
        // Check if square makes a magic square
        int [][] magicSquare = square;
        int N = n;
        
        boolean inRange = true;
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (magicSquare[i][j]<0 || magicSquare[i][j] > Math.pow(N,2)) inRange = false;
        
        boolean hasAllNumbers = true;
        boolean hasNum;
        for (int b = 1; b < Math.pow(N,2); b++){
            hasNum = false;
            for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (magicSquare[i][j] == b) hasNum = true;
            if (!hasNum) hasAllNumbers = false;
        }
        
        // Check if sum of rows equal and display
        boolean rowsEqual = true;
        int [] sumRow = new int [N];
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) sumRow[i]+= magicSquare[i][j];
        for (int i = 1; i < N; i++) if (sumRow[0]!=sumRow[i]) rowsEqual = false;
        
        System.out.print("The sum of the rows: ");
        for (int i = 0; i < sumRow.length; i++) System.out.printf ("%3d", sumRow[i]);
        System.out.println();
        
        // Check if sum of columns equal and display
        boolean columnsEqual = true;
        int [] sumColumn = new int [N];
        for (int j = 0; j < N; j++) for (int i = 0; i < N; i++) sumColumn[j]+= magicSquare[i][j];
        for (int i = 1; i < N; i++) if (sumColumn[0]!=sumColumn[i]) columnsEqual = false;
        
        System.out.print("The sum of the columns: ");
        for (int i = 0; i < sumColumn.length; i++) System.out.printf ("%3d", sumColumn[i]);
        System.out.println();
        
        // Check if sum of diagonals equal and display
        boolean diagonalsEqual = false;
        int rightDiaSum = 0; int leftDiaSum = 0;
        for (int i = 0; i < N; i++) {
            rightDiaSum += magicSquare [i][i];
            leftDiaSum += magicSquare [N-1-i][N-1-i];
        }
        if (rightDiaSum == leftDiaSum) diagonalsEqual = true;
        
        System.out.print("The sum of the diagonals: ");
        System.out.printf ("%3d", rightDiaSum);
        System.out.printf ("%3d", leftDiaSum);
        System.out.println();
        
        //See if square is a magic square and display
        if (inRange && hasAllNumbers && rowsEqual && columnsEqual && diagonalsEqual)System.out.println ("The numbers given make a magic square.");
        else System.out.println ("The numbers given do not make a magic square.");
    }
}

/*
 * Print an odd number of the size of the magic square: 5
 *  11 18 25  2  9
 *  10 12 19 21  3
 *   4  6 13 20 22
 *  23  5  7 14 16
 *  17 24  1  8 15
 * 
 * The sum of the rows:  65 65 65 65 65
 * The sum of the columns:  65 65 65 65 65
 * The sum of the diagonals:  65 65
 * The numbers given make a magic square.
 */
