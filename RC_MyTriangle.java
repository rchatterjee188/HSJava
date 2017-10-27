
/**
 * From Standard drawing use Triangle.java to create a drawing of 
 * 3 different triangles: acute, obtuse and right.
 * 
 * Ruhika Chatterjee
 * 12/8/16
 */
public class RC_MyTriangle
{
    public static void main(String[] args) {
        double t = Math.sqrt(3.0) / 2.0;
        StdDraw.line(0.0, 0.0, 0.5, 0.0);
        StdDraw.line(0.5, 0.0, 0.5, t);
        StdDraw.line(0.5, t, 0.0, 0.0);
        StdDraw.point(0.5, t/3.0);
        
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, t);
        StdDraw.line(0.5, t, 0.0, 0.0);
        
        StdDraw.line(0.0, 1.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.0, t);
        StdDraw.line(0.0, t, 0.0, 1.0);
    }
}
