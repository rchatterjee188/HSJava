
/**
 * Show an example of the features displayed on the book site.
 * 
 * Ruhika Chatterjee
 * 12/7/16
 */
public class RC_PrintTest
{
    public static void main (String args [])
    {
        StdOut.printf ("%14d", 512);
        StdOut.println ();
        StdOut.printf ("%-14d", 512);
        StdOut.println ();
        
        StdOut.printf ("%14.2f", 1595.1680010754388);
        StdOut.println ();
        StdOut.printf ("%.7f", 1595.1680010754388);
        StdOut.println ();
        StdOut.printf ("%14.4e", 1595.1680010754388);
        StdOut.println ();
        
        StdOut.printf ("%14s", "Hello, World");
        StdOut.println ();
        StdOut.printf ("%-14s", "Hello, World");
        StdOut.println ();
        StdOut.printf ("%-14.5s", "Hello, World");
        StdOut.println ();
        
        StdOut.printf ("%b", true);
    }
}

/*
 *            512
 * 512           
 *        1595.17
 * 1595.1680011
 *     1.5952e+03
 *   Hello, World
 * Hello, World  
 * Hello         
 * true
 */

