
/**
 * Find the difference between sum of the squares of first one hundred natural numbers and the square of the sum
 * 
 * The sum of the squares of the first ten natural numbers is:
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is:
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural 
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Ruhika Chatterjee
 * 10/24/16
 */
public class RC_SSD
{
    public static void main (String args [])
    {
        int squaredSum = 0; int sumSquared = 0;
        for (int i = 1; i <= 100; i++){
            squaredSum += Math.pow(i,2);
            sumSquared += i;
        }
        sumSquared = (int) Math.pow(sumSquared, 2);
        
        int difference = sumSquared - squaredSum;
        System.out.println ("The difference between the sum of the squares of 1-100 and the square of the sum is " + difference);
    }
}

//The difference between the sum of the squares of 1-100 and the square of the sum is 25164150

