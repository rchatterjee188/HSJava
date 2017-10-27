
/**
 * Extend program Stats. java to create a filter that prints all the values 
 * that are further than 1.5 standard deviations from the mean.
 * 
 * Stats.java takes an integer N from the command line, reads N double values from standard 
 * input, and prints their mean (average value) and sample standard deviation (square root 
 * of the sum of the squares of their differences from the average, divided by N - 1).
 * 
 * Ruhika Chatterjee
 * 12/9/16
 */
public class RC_FilterStats
{
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];

        // read data and compute statistics
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readDouble();
        }

        // compute mean
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double mean = sum / n;

        // compute standard deviation
        double sum2 = 0.0;
        for (int i = 0; i < n; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }
        double stddev = Math.sqrt(sum2 / (n - 1));

        // print results
        StdOut.println("Mean                          = " + mean);
        StdOut.println("Sample standard deviation     = " + stddev);
        
        // calculate and print values outside 1.5 times from stddev
        StdOut.println ("Vals past 1.5 stddev from mean: ");
        for (int i = 0; i < n; i++) {
            if (a[i] > (mean + (stddev * 1.5)) || a[i] < (mean - (stddev * 1.5))) StdOut.println (a[i]);
        }
    }
}

/*
 * Input: 10
 * -90
 * 10
 * 20
 * 30
 * 40
 * 50
 * 1000
 * 60
 * 70
 * 80
 * 
 * Output:
 * Mean                          = 127.0
 * Sample standard deviation     = 310.4137024466972
 * Vals past 1.5 stddev from mean:
 * 1000.0
 */
