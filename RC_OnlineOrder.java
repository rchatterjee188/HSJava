
/**
 * “Send a Meal” Online Company 
 * An online-order house sells five products whose retail prices are as follows: Product 1, $2.98; product 2, 
 * $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
 * Write a java program YI_OnlineOrder.java that reads a series of pairs of numbers as follows:
 * 
 * a) Product number;
 * b) Quantity sold.
 * 
 * 1. Start the program with a welcome message.
 * 2. Display the product, price and exit message as follows:
 * 
 * Product 1 - $2.98
 * Product 2 - $4.50
 * Product 3 - $9.98
 * Product 4 - $4.49 
 * Product 5 - $6.87
 * Enter -1 to exit the program. 
 * 
 * 3. Prompt the user to determine whether there is more input. 
 * 4. If the user wants to stop, Your program should calculate and display the total retail value of all products sold.
 * 
 * Sample output:
 * Product number?: 1
 * Quantity?: 2
 * Do you want to continue?(yes/no): yes
 * Product number?: 2
 * Quantity?: 5
 * Do you want to continue?(yes/no): yes
 * Product number?: 3
 * Quantity?: 3
 * Do you want to continue?(yes/no): yes
 * Product number?: 4
 * Quantity?: 1
 * Do you want to continue?(yes/no): no
 * Total Price: $62.89
 * 
 * An display the content of your array.
 * 
 * 5. Display product/price message followed by the prompts to allow the user to start again.
 * 
 * If the user enter -1, then the final display should look like this:
 * 
 * Product Quantity Subtotal
 * 1 2 5.96
 * 2 5 22.50
 * 3 3 29.94
 * 4 1 4.49 
 * 
 * Total Price: $62.89
 * 
 * Followed by the started up messages.
 * 
 * NOTE:
 * 1. Use arrays to store all information 
 * 2. Display as a report the content of the array(s)
 * 
 * Ruhika Chatterjee
 * 12/15/16
 */

import java.util.Scanner;
public class RC_OnlineOrder
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        double [] prices = {2.98, 4.50, 9.98, 4.49, 6.87};
        int [] prodQuantity = new int [5];
        
        boolean runProgram = true; String runAgain;
        while (runProgram){
            for (int i = 0; i < prodQuantity.length; i++) prodQuantity [i] = 0;
            
            boolean runMore = true;
            
            StdOut.println ("Welcome to Send a Meal Online Company! Here are the products that we offer:");
            for (int i = 0; i < prices.length; i ++) StdOut.println ("Product " + (i+1) + " - $" + prices[i]);
            StdOut.println ("Enter -1 to exit the program and anything else to continue");
            if (scan.next().equals("-1")) runMore = false;
            
            String moreInput; int prodNum; int quantity; double totalPrice = 0;
            while (runMore){
                StdOut.print ("Product number: ");
                prodNum = scan.nextInt ();
                
                StdOut.print ("Quantity: ");
                quantity = scan.nextInt ();
                
                prodQuantity[prodNum-1] += quantity;
                totalPrice += prices[prodNum-1] * quantity;
                
                StdOut.print ("Do you want to continue?(yes/no)");
                moreInput = scan.next ();
                if (moreInput.equals("no")) runMore = false;
            }
            
            StdOut.println ("Product " + "Quantity " + "Subtotal");
            for (int i = 0; i < prodQuantity.length; i ++) {
                StdOut.printf ("%7d", (i+1));
                StdOut.printf ("%9d", prodQuantity[i]);
                StdOut.println (" " + (Math.round(prices[i] * prodQuantity[i] * 100))/100.0);
            }
            
            StdOut.println ("Total Price: $" + ((Math.round(totalPrice*100))/100.0));
            
            StdOut.print ("Do you want to start again?(yes/no)");
            runAgain = scan.next ();
            if (runAgain.equals("no")) runProgram = false;
        }
        
    }
}

/*
 * Welcom to Send a Meal Online Company! Here are the products that we offer:
 * Product 1 - $2.98
 * Product 2 - $4.5
 * Product 3 - $9.98
 * Product 4 - $4.49 
 * Product 5 - $6.87
 * Enter -1 to exit the program and anything else to continue
 * 1
 * Product number: 1
 * Quantity: 2
 * Do you want to continue?(yes/no)y
 * Product number: 2
 * Quantity: 5
 * Do you want to continue?(yes/no)y
 * Product number: 3
 * Quantity: 3
 * Do you want to continue?(yes/no)y
 * Product number: 4
 * Quantity: 1
 * Do you want to continue?(yes/no)no
 * Product Quantity Subtotal
 *       1        2 5.96
 *       2        5 22.5
 *       3        3 29.94
 *       4        1 4.49
 *       5        0 0.0
 * Total Price: $62.89
 * Do you want to start again?(yes/no)no
 */
