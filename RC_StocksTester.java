
/**
 * Write a test program that creates a Stock object with the stock symbol ORCL, the name 
 * Oracle Corporation, and the previous closing price of 34.5. Set a new current price 
 * to 34.35 and display the price-change percentage.
 * 
 * Ruhika Chatterjee
 * 3/10/17
 */
public class RC_StocksTester
{
    public static void main (String agrs [])
    {
        RC_Stocks disney = new RC_Stocks ("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println ("Price change percent: " + disney.getChangePercent ());
    }
}

/**
 * Price change percent: 0.434782608695648
 */