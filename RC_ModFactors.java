
/**
 * Modify Factors.java to print just one copy of each of the prime divisors.
 * 
 * Ruhika Chatterjee
 * 10/4/16
 */
public class RC_ModFactors
{
    public static void main(String[] args)
    { 
        // command-line argument
        long n = Long.parseLong(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");

        // for each potential factor
        for (long factor = 2; factor*factor <= n; factor++) {

            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n = n / factor;
                while (n % factor == 0) n = n/factor;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}

/*
 * Sampe Input: {"72"}
 * Output: The prime factorization of 72 is: 2 3
 */
