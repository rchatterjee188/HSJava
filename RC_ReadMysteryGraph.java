
/**
 * Read mysterygraph.txt
 * 
 * Ruhika Chatterjee
 * 12/8/16
 */
public class RC_ReadMysteryGraph
{
    public static void main (String args [])
    {
        // read in bounding box and rescale
        double x0 = 105;
        double y0 = 100;
        double x1 = 300;
        double y1 = 300;
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        // for bigger points
        StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        // plot points, one at a time
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }

        // display all of the points now
        StdDraw.show();

    }
}
