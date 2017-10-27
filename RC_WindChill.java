
/**
 * Prints the wind chill based on temperature and wind speed/.
 * 
 * Ruhika Chatterjee
 * 9/20/16
 */
public class RC_WindChill
{
    public static void main (String args [])
    {
        double t = Double.parseDouble (args[0]);
        double v = Double.parseDouble (args[1]);
        
        if (Math.abs(t) < 50 && v < 120 && v > 3)
        {
            double w = 35.74 + (0.6215 * t) + (Math.pow(v, 0.16) * ((0.4275 * t)-35.75));
            System.out.println ("The wind chill is " + w);
        }
        else
        {
            System.out.println ("Those are not valid statements.");
        }
    }
}

/*
 * Sample Input: {"40", "30" }
 * Sample Output: The wind chill is 28.462045104487707
 */