
/**
 * This program prints the sin squared plus the cos squared of an angle given by the user in radians
 * 
 * Ruhika Chatterjee
 * 9/15/16
 */
public class RC_CosSin
{
    public static void main (String args[])
    {
        double theta = Double.parseDouble(args[0]);
        
        double x = Math.sin(theta);
        double y = Math.cos(theta);
        
        double sum = Math.pow(x,2)+Math.pow(y,2);
        System.out.println (sum);
    }
}

/*
 * Input: 3.14
 * Output: 0.9999999999999999
 */