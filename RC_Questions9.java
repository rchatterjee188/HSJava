/**
 * Prompt user to type inputs on standard input stream
 * Mix input stream with output stream
 * 
 * Ruhika Chatterjee
 * 12/6/16
 */
public class RC_Questions9
{
    public static void main (String args[])
    {
        StdOut.print ("Input a number: ");
        int b = StdIn.readInt ();
        
        StdOut.print ("Input another number: ");
        int q = StdIn.readInt ();
        
        StdOut.print ("Their sum is " + (b+q));
    }
}

/*
 * Input a number: 5
 * Input another number: 12
 * Their sum is 17
 */