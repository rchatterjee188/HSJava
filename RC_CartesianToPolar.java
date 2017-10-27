
/**
 * Converts from Cartesian to polar coordinates.
 * 
 * Ruhika Chatterjee
 * 9/20/16
 */
public class RC_CartesianToPolar
{
    public static void main (String args [])
    {
        float x = Float.parseFloat (args[0]);
        float y = Float.parseFloat (args[1]);
        
        float r = Math.round (Math.sqrt (Math.pow(x,2) + Math.pow(y,2)));
        double theta = Math.round(Math.toDegrees(Math.atan2(y,x))*10.0)/10.0;
        
        System.out.println ("The polar coordinates for the Cartesian ("+x+", "+y+") are: ("+ r +", "+theta+").");
    }
}

/*
 * Sample Input: {"5","12"}
 * Sample Output: The polar coordinates for the Cartesian (5.0, 12.0) are: (13.0, 67.4).
 */