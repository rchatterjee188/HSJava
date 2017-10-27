/**
 * Print a table giving the total amount paid and the remaining principal after each monthly payment.
 * 
 * Ruhika Chatterjee
 * 10/4/16
 */
import java.util.Scanner;
public class RC_CarLoan
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Type the principal: ");
        double principal = scan.nextDouble ();
        System.out.print ("Type the number of years: ");
        int years = scan.nextInt ();
        
        double rate = 0;
        while (rate == 0.0){
            System.out.print ("Type the rate: ");
            rate = scan.nextDouble ();
        }
        if (rate >= 1) rate = rate / 100;
        
        System.out.println ();
        double monthly = Math.round(((principal * (rate/12)) / (1-Math.pow((1+(rate/12)), -12*years))) *100.0) /100.0;
        System.out.println ("Monthly payments: " + monthly);
        System.out.println ();
        
        System.out.println ("Month" + "\t" + "Amt Paid" + "\t" + "Remaining");
        for (int month = 1; month < (years*12); month ++){
            System.out.println (month + "\t" + (Math.round((monthly*month)*100.0)/100.0) + "\t" + "\t" + (Math.round((principal-(monthly*month))*100.0)/100.0));
        }
    }
}

/*
 * Sample Potput:
Type the principal: 1000
Type the number of years: 2
Type the rate: 3

Monthly payments: 42.98

Month	Amt Paid	Remaining
1	42.98		957.02
2	85.96		914.04
3	128.94		871.06
4	171.92		828.08
5	214.9		785.1
6	257.88		742.12
7	300.86		699.14
8	343.84		656.16
9	386.82		613.18
10	429.8		570.2
11	472.78		527.22
12	515.76		484.24
13	558.74		441.26
14	601.72		398.28
15	644.7		355.3
16	687.68		312.32
17	730.66		269.34
18	773.64		226.36
19	816.62		183.38
20	859.6		140.4
21	902.58		97.42
22	945.56		54.44
23	988.54		11.46
 */
