
/**
 * create an array of 100 random integers between the values of 1 and 1000 and find the average of all the elements of the array.
 * 
 * Ruhika Chatterjee
 * 10/28/16
 */
public class RC_AverageArray
{
    public static void main (String args [])
    {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i ++) arr [i] = (int) (Math.random() * 1000) + 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i ++) sum += arr[i];
        double average = sum / arr.length;
        System.out.println ("The average is: " + average);
    }
}

// The average is: 501.0
