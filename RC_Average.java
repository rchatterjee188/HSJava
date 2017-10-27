
/**
 * Average of numbers
 * 
 * Ruhika Chatterjee
 * 12/7/16
 */
public class RC_Average
{
    public static void main(String[] args)
    {
        double sum = 0.0; // cumulative total
        int N = 0; // number of values
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            sum = sum + x;
            N++;
        }
        StdOut.println(sum / N);
    }
}