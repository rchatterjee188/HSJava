
/**
 * Suppose that the standard input stream is a sequence of double values. Write a program that takes an integer N and two double values left and right 
 * from the command line, StdIn, or Scanner and uses StdDraw to plot a histogram of the frequency of the numbers in the standard input stream that fall 
 * in each of the N intervals defined by dividing (left , right) into N equal-sized intervals.
 * The intervals' marks and labels are optional.
 * 
 * Suggestion:
 * - Start by drawing a rectangle given the width and height as input.
 * - Next, draw n number of rectangles given the width, both n and width as input. For learning purposes, use a sample array of integers representing the 
 * frequency (the height of each rectangle) at each position.
 * - Last, replace the array of integers with the frequency of integers from the input stream based on the above specification. At this point you can add 
 * to your implementation the other constraints, left, right and N.
 * 
 * Ruhika Chatterjee
 * 12/12/16
 */
public class RC_Histogram
{
    public static void main (String args [])
    {
        // Get user inputs from command line for # of frequencies, and the largest and smallest values
        int N = Integer.parseInt (args[0]);
        double left = Integer.parseInt (args[1]);
        double right = Integer.parseInt (args[2]);
        
        // Create frequency data set
        int [] frequencies = new int [N];
        double inputVal; double bottomRange; double topRange;
        while (!StdIn.isEmpty()) {
            inputVal = StdIn.readDouble();
            if (inputVal == right) frequencies[frequencies.length - 1] ++;
            else {
                for (int i = 0; i < N; i++){
                    bottomRange = left + (((right-left)/N)*i);
                    topRange = bottomRange + ((right-left)/N);
                    if (inputVal >= bottomRange && inputVal < topRange) frequencies[i] ++;
                }
            }
        }
        
        // Set screen size
        int highestVal = 0;
        for (int i = 0; i < N; i++) if (frequencies[i] > highestVal) highestVal = frequencies[i];
        StdDraw.setYscale (0, highestVal+2);
        StdDraw.setXscale (left-1, right+1);
        
        // Draw data on the graph
        for (int i = 0; i < frequencies.length; i++){
            StdDraw.setPenColor (StdDraw.BLUE);
            bottomRange = left + (((right-left)/N)*i);
            topRange = bottomRange + ((right-left)/N);
            double [] x = {bottomRange+0.25, bottomRange+0.25, topRange-0.25, topRange-0.25};
            double [] y = {0, frequencies[i], frequencies[i], 0};
            StdDraw.filledPolygon (x, y);
            
            // The intervals' marks and labels are optional.
            StdDraw.setPenColor ();
            StdDraw.text ((bottomRange+topRange)/2, frequencies[i]+0.5, Double.toString(bottomRange)+" - "+Double.toString(topRange));
        }
    }
}
