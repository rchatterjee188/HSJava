/**
 * Create an array of 100 random integers between the values of 1 and 1000 and find the two consecutive 
 * integers with the smallest difference between the two of them.
 * 
 * Ruhika Chatterjee
 * 10/27/16
 */
public class RC_ClosestPair
{
    public static void main (String main [])
    {
        int [] randomInt = new int [100];
        for (int i = 0; i < randomInt.length; i++) randomInt[i] =  (int) Math.ceil( Math.random()*1000.0 );
        int smallestDiff = Math.abs (randomInt [0] - randomInt [1]);
        int diff;
        for (int i = 1; i < randomInt.length - 1; i++){
            diff = Math.abs (randomInt [i] - randomInt [i+1]);
            if (diff < smallestDiff) smallestDiff = diff;
        }
        System.out.println ("The smallest difference is: " + smallestDiff);
    }
}

/*
 * Sample outputs:
The smallest difference is: 0
The smallest difference is: 3
The smallest difference is: 3
The smallest difference is: 5
The smallest difference is: 9
The smallest difference is: 0
 */