/**
 * Read a stream of numbers.
 * Compute their average.
 * 
 * Ruhika Chatterjee
 * 12/6/16
 */
public class RC_Questions10
{
    public static void main (String args[])
    {
        double sum = 0; // cumulative total
        double vals = 0; // number of values
        
        StdOut.println ("Print the values to average (Ctrl-Z to end)");
        while (!StdIn.isEmpty()){
            double c = StdIn.readDouble();
            sum = sum + c;
            vals++;
        }
        StdOut.println ("The total average is " + (sum/vals));
    }
}

/*
 * Print the values to average (Ctrl-Z to end)
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 
 * The total average is 5.5
 */
