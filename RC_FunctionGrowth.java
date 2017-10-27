
/**
 * Prints a table of the values of ln n, n, n ln n, n^2, n^3, and 2^n for n = 16, 32, 64, ..., 2048.
 * Use tabs ('\t' characters) to line up columns.
 * 
 * Ruhika Chatterjee
 * 9/28/16
 */
public class RC_FunctionGrowth
{
    public static void main (String args [])
    {
        for (int n = 16; n < 2048; n = n*2){
            System.out.print ("\n" + n + "\t" + n + "\t" + n + "\n" + n + "\t" + Math.pow(n,2) + "\t" + 
            Math.pow(n,3) + "\t" + Math.pow(2,n));
        
        }
    }
}

/*
 * Output:
 *  16	16	16
16	256.0	4096.0	65536.0
32	32	32
32	1024.0	32768.0	4.294967296E9
64	64	64
64	4096.0	262144.0	1.8446744073709552E19
128	128	128
128	16384.0	2097152.0	3.4028236692093846E38
256	256	256
256	65536.0	1.6777216E7	1.157920892373162E77
512	512	512
512	262144.0	1.34217728E8	1.3407807929942597E154
1024	1024	1024
1024	1048576.0	1.073741824E9	Infinity
 */