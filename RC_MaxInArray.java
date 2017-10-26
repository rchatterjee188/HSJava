
/**
 * Create an array of 100 random integers between the values of 1 and 1000 and find the largest value.
 * 
 * Ruhika Chatterjee
 * 10/28/16
 */
public class RC_MaxInArray
{
    public static void main (String args [])
    {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i ++) arr [i] = (int) (Math.random() * 1000) + 1;
        int max = 0;
        for (int i = 0; i < arr.length; i ++) if (arr[i] > max) max = arr[i];
        System.out.println ("The largest value is: " + max);
    }
}

// The largest value is: 984