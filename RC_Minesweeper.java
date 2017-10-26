/**
 * Takes 3 command-line arguments m, n, and p and produces an m-by-n boolean array where each entry is occupied 
 * with probability p. In the minesweeper game, occupied cells represent bombs and empty cells represent safe cells. 
 * Print the array using an asterisk for bombs and a period for safe cells. Then, replace each safe square with the 
 * number of neighboring bombs (above, below, left, right, or diagonal) and print the solution.
 * 
 * Ruhika Chatterjee
 * 11/29/16
 */

import java.util.Scanner;
public class RC_Minesweeper
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        // Gets input from from user for size of board and probability of bombs
        System.out.print ("Print the number of rows: ");
        int m = scan.nextInt ();
        System.out.print ("Print the number of columns: ");
        int n = scan.nextInt ();
        System.out.print ("Print the probability (Decimal): ");
        double p = scan.nextDouble ();
        
        // Create mxn board and place bombs with p probability
        String [][] board = new String [m][n];
        for (int i = 0; i < board.length; i ++) for (int j = 0; j < board[i].length; j++) board[i][j] = ".";
        int numBombs = 0;
        while (numBombs < Math.round(p*m*n)){
            int row = (int) Math.ceil(Math.random()*m) - 1;
            int column = (int)Math.ceil(Math.random()*n) - 1;
            if (board[row][column] == "."){
                board[row][column] = "*";
                numBombs ++;
            }
        }
        
        // Print board with bombs and safe spaces
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j++) System.out.printf ("%3s", board[i][j]);
            System.out.println ();
        }
        System.out.println ();
        
        // Goes through safe spaces and calculates the number of bombs around each and changes it in the list
        int bombsSurround;
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == "."){
                    bombsSurround = 0;
                    if (i-1 >= 0 && j-1 >= 0) if (board[i-1][j-1] == "*") bombsSurround ++;
                    if (i-1 >= 0) if (board[i-1][j] == "*") bombsSurround ++;
                    if (i-1 >= 0 && j+1 <= board.length-1) if (board[i-1][j+1] == "*") bombsSurround ++;
                    if (j - 1 >= 0) if (board[i][j-1] == "*") bombsSurround ++;
                    if (j + 1 <= board.length-1) if (board[i][j+1] == "*") bombsSurround ++;
                    if (i+1 <= board.length-1 && j-1 >= 0) if (board[i+1][j-1] == "*") bombsSurround ++;
                    if (i+1 <= board.length-1) if (board[i+1][j] == "*") bombsSurround ++;
                    if (i+1 <= board.length-1 && j+1 <= board.length-1) if (board[i+1][j+1] == "*") bombsSurround ++;
                    board[i][j] = Integer.toString(bombsSurround);
                }
            }
        }
        
        // Print board with bombs and empty spaces and the number of surrounding bombs
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j++) System.out.printf ("%3s", board[i][j]);
            System.out.println ();
        }
    }
}

/*
Print the number of rows: 5
Print the number of columns: 5
Print the probability (Decimal): .25
  .  *  .  *  .
  .  .  *  .  *
  .  *  .  .  .
  .  .  .  .  .
  .  *  .  .  .

  1  *  3  *  2
  2  3  *  3  *
  1  *  2  2  1
  2  2  2  0  0
  1  *  1  0  0
 */
