
/**
 * Find the all the prime numbers less than or equal to 120 using the Sieve of Eratosthenes algorithm.
 * 
 * Ruhika Chatterjee
 * 11/8/16
 */
public class RC_ErathosPrimes
{
    public static void main (String args[])
    {
        int n = 120;
        boolean [] arrayJ = new boolean [n-1];
        for (int i = 0; i < arrayJ.length; i++) arrayJ[i] = true;
        for (int i = 0; i < Math.sqrt(n); i++){
            if (arrayJ[i]){
                for (int j = (int) Math.pow(i+2,2); j < n-2; j += i+2) {
                    arrayJ[j] = false;
                }
            }
        }
        System.out.print ("The prime numbers are: ");
        for (int i = 0; i < n-4; i++)   if (arrayJ[i+2]) System.out.print (i + 2 + " ");
        System.out.println ();
    }
}
// The prime numbers are: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 
