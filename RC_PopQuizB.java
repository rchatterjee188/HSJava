
/**
 * Rewrite ThreeSort to put a, b, and c in numerical order
 * 
 * Ruhika Chatterjee
 * 10/7/16
 */
public class RC_PopQuizB
{
    public static void main (String args [])
    {
        int a = Integer.parseInt (args[0]);
        int b = Integer.parseInt (args[1]);
        int c = Integer.parseInt (args[2]);
        
        if (a > c){
            int k = c;
            c = a;
            a = k;
        }
        if (b > c){
            int q = b;
            b = c;
            c = q;
        }
        if (a > b){
            int t = a;
            a = b;
            b = t;
        }
        
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
    }
}

/*
 * Sample Input: {"26","69","42"}
 * Output:
 * 26
 * 42
 * 69
 */
