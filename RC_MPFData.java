
/**
 * Data points for RC_MyPlotFilter
 * 
 * Ruhika Chatterjee
 * 12/8/16
 */
public class RC_MPFData
{
    public static void main (String args[])
    {
        StdOut.println (0 + " " + 0 + " " + 1 + " " + 1);
        for (float i = 0; i <= 1000; i++) StdOut.println ((i/1000) + " " + (i/1000));
        for (float i = 0; i <= 1000; i++) StdOut.println (1-(i/1000) + " " + (i/1000));
    }
}
