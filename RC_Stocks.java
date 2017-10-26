
/**
 * A string data field named symbol for the stock’s symbol.
 * A string data field named name for the stock’s name.
 * A double data field named previousClosingPrice that stores the stock
 *  price for the previous day.
 * A double data field named currentPrice that stores the stock price for the current time.
 * A constructor that creates a stock with the specified symbol and name.
 * A method named getChangePercent() that returns the percentage changed
 *  from previousClosingPrice to currentPrice.
 * If your constructor only takes the two parameters, symbol and name, then you need setters 
 *  method to change the other fields.
 * If your constructor takes 4 parameters, then you do not need setter methods.
 * 
 * Ruhika Chatterjee
 * 3/8/17
 */
public class RC_Stocks
{
    // The symbol of the stock
    private String symbol;
    // The name of the stock
    private String name;
    // The stock price for the previous day
    private double previousClosingPrice;
    // The current time price of the stock
    private double currentPrice;
    
    /**
     * Constructor for RC_Stocks that instanciates the variables
     * @param stock symbol, stock name, previous stock price, current stock price
     */
    public RC_Stocks (String stockSymbol, String stockName, double previousPrice, double currentPrice)
    {
        symbol = stockSymbol;
        name = stockName;
        previousClosingPrice = previousPrice;
        this.currentPrice = currentPrice;
    }
    
    
    /**
     * Returns the percentage changed from previousClosingPrice to currentPrice
     * @return percent change from previous to current prices
     */
    public double getChangePercent ()
    {
        return (previousClosingPrice-currentPrice)/previousClosingPrice * 100;
    }
}
