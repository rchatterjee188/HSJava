
/**
 * Prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
 * 
 * Ruhika Chatterjee
 * 9/19/16
 */
public class RC_SumOfTwoRand
{
    public static void main (String args [])
    {
         double r1 = Math.random();
         int diceRoll1 = (int) Math.ceil(r1 * 6);
         
         double r2 = Math.random();
         int diceRoll2 = (int) Math.ceil(r2 * 6);
         
         System.out.println ("The sum of the dice rolls is " + (diceRoll1 + diceRoll2));
    
    
    }
}
/*
 * Sample Output: The sum of the dice rolls is 8
 */