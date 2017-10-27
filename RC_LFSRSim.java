
/**
 * Generate an output like the one below for a given seed.
 * 
 * Output:
 * 01101000010
 * 00001011001 25
 * 01100100100 4
 * 10010011110 30
 * 01111011011 27
 * 01101110010 18
 * 11001011010 26
 * 01101011100 28
 * 01110011000 24
 * 01100010111 23
 * 01011111101 29
 * 
 * NOTE: It doesn't have to be OOP.
 * 
 * Ruhika Chatterjee
 * 3/30/17
 */
public class RC_LFSRSim
{
    public static void main (String args [])
    {
        RC_LFSR lfsr = new RC_LFSR("01101000010", 8);
        for (int i = 0; i < 10; i++) {
            int r = lfsr.generate(5);
            System.out.println(lfsr + " " + r);
        }
    }
}

/*
 * 00001011001 25
 * 01100100100 4
 * 10010011110 30
 * 01111011011 27
 * 01101110010 18
 * 11001011010 26
 * 01101011100 28
 * 01110011000 24
 * 01100010111 23
 * 01011111101 29
 */