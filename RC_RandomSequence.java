
/**
 * Creates random sequence
 * 
 * Ruhika Chatterjee
 * 12/7/16
 */
public class RC_RandomSequence
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) System.out.println(Math.random());
    }
}
