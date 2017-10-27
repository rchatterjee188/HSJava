
/**
 * Uses a while loop to calculate how many years it would take to have at least $1,100 at an interest rate of 1.2% when $1,000 is deposited in a savings bank account.
 * 
 * Ruhika Chatterjee
 * 9/27/16
 */

import java.util.Scanner;
public class RC_SimpleInterest
{
    public static void main (String args [])
    {
        double deposit = 1000;
        int years = 0;
        double interestRate = 0.012;
        int totalSavings = 1100;
        double currentSavings = 1000;
        while (currentSavings < totalSavings){
            years += 1;
            currentSavings = currentSavings + deposit*interestRate;
        }
        
        System.out.println ("It will take "+years+" years to have $"+currentSavings);
    }
}

/*
 * Output: It will take 9 years to have $1108.0
 */