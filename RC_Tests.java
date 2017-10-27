
/**
 * Tests different situations for built in types.
 * 
 * Ruhika Chatterjee
 * 9/17/16
 */
public class RC_Tests
{
    public static void main (String args [])
    {
        System.out.println(10/3);
        
        System.out.println(2 + "bc"); 
        System.out.println(2 + 3 + "bc"); 
        System.out.println((2+3) + "bc"); 
        System.out.println("bc" + (2+3)); 
        System.out.println("bc" + 2 + 3);
    }
}

/*
 * 3
2bc
5bc
5bc
bc5
bc23
 */