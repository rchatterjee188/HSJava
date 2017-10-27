
/**
 * Class to simulate the lfsr for a given seed.
 * 
 * Ruhika Chatterjee
 * 4/6/17
 */
public class RC_LFSR
{
    private String lfsr;
    private int tap;
    
    public RC_LFSR (String seed, int t){
        lfsr = seed;
        tap = t;
    }
    
    public int step (){
        int xorVal = (lfsr.charAt(0))^(lfsr.charAt(lfsr.length()-1-tap));
        lfsr = lfsr.substring(1) + xorVal;
        return xorVal;
    }
    
    public int generate (int k){
        int value = 0;
        for (int i = 0; i < k; i++){
            value = (value * 2) + step();
        }
        return value;
    }
    
    public String toString(){
        return lfsr;
    }
}
