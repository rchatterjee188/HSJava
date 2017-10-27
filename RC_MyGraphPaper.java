
/**
 * Similar to CheckerBoard.java from below but to draw 2 different kinds of graph paper. 
 * Think of what graph paper you would use in a math class.
 * 
 * Study program CheckerBoard.java that takes a command-line argument N and plots an N-by-N 
 * checkerboard with red and black squares. It colors the lower left square red.
 * 
 * Ruhika Chatterjee
 * 12/9/16
 */
public class RC_MyGraphPaper
{
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        StdDraw.setPenColor(StdDraw.BLACK);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                StdDraw.square(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
