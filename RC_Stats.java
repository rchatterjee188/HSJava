
/**
 * Prints five uniform random values between 0 and 1, their average value, and their minimum and maximum value.
 * Add the feature of printing the sample standard deviation in addition to the average.
 * 
 * Ruhika Chatterjee
 * 9/22/16
 */
public class RC_Stats
{
    public static void main (String args[])
    {
        double value1 = Math.random ();
        double value2 = Math.random ();
        double value3 = Math.random ();
        double value4 = Math.random ();
        double value5 = Math.random ();
        System.out.println ("The random values are " + value1 + ", " + value2+ ", " + value3 + ", " + value4 + ", " + value5);
        
        double average = (value1 + value2 + value3 + value4 + value5) / 5;
        System.out.println ("The average is " + average);
        
        double maximum = Math.max (value1, value2);
        maximum = Math.max (maximum, value3);
        maximum = Math.max (maximum, value4);
        maximum = Math.max (maximum, value5);
        System.out.println ("The maximum value is " + maximum);
        
        double minimum = Math.max (value1, value2);
        minimum = Math.min (minimum, value3);
        minimum = Math.min (minimum, value4);
        minimum = Math.min (minimum, value5);
        System.out.println ("The minimum value is " + minimum);
        
        double standardDeviation = Math.sqrt ((Math.pow((value1-average),2) + Math.pow((value2-average),2) + Math.pow((value3-average),2) + Math.pow((value4-average),2) + Math.pow((value5-average),2)) / (5-1));
        System.out.println ("The standard deviation is " + standardDeviation);
    }
}

/*
 * Output:
 * The random values are 0.640019541608292, 0.6021874683958908, 0.26342578133229066, 0.43639590133584516, 0.09738138369574034
 * The average is 0.40788201527361184
 * The maximum value is 0.640019541608292
 * The minimum value is 0.09738138369574034
 * The standard deviation is 0.22898347521108117
 */
