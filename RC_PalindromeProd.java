
/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Ruhika Chatterjee
 * 10/24/16
 */
public class RC_PalindromeProd
{
    public static void main (String args [])
    {
        int product; boolean isPal; int largestPalindrome = 0; String strProd; int length;
        for (int i = 100; i < 1000; i ++){
            for (int b = 100; b < 1000; b ++){
                isPal = false;
                product = i * b;
                strProd = Integer.toString(product);
                length = (strProd).length();
                if (length == 5){
                    if (strProd.charAt(0)==strProd.charAt(4) && strProd.charAt(1)==strProd.charAt(3)){
                        isPal = true;}}
                if (length == 6){
                    if (strProd.charAt(0)==strProd.charAt(5) && strProd.charAt(1)==strProd.charAt(4)
                    && strProd.charAt(2)==strProd.charAt(3)){isPal = true;}}
                
                if (isPal)if (product > largestPalindrome){
                        largestPalindrome = product;
                }
            }
        }
        System.out.println ("The largest palindrome made from the product of two 3-digit numbers is " + largestPalindrome);
    }
}

//The largest palindrome made from the product of two 3-digit numbers is 906609
