import java.util.ArrayList;
/**
 * A class to provide data of a line given the user-inputted a, b, and c of the line
 * 
 * Satya Baliga
 * 06.07.17
 */
public class SB_Line implements RC_Shape
{
    private ArrayList<Double> xValues; //arraylist to store x values
    private ArrayList<Double> yValues; //arraylist to store y values
    private ArrayList<Double> yValues2; //arraylist to store y values
    private double a, b, c; //values in the standard form of a line
    
    /**
     * constructor for SB_DrawLine-- create arraylists necessary to store x and y coordinate values
     * @param- not used
     */
    public SB_Line()
    {
        //initialize arrayLists
        xValues = new ArrayList();
        yValues = new ArrayList();
        yValues2 = new ArrayList();
        
        userInput(); //get the user input of the characteristics needed to draw the graph
        setPoints(); //calculate the points and put them in arrayLists to draw later
    }
    
    /**
     * get the input from the user using StdIn
     * input needed: a, b, and c values to draw a line in standard form
     * it is assumed that all user Input is good
     * @param- not used
     * setter method
     */
    public void userInput()
    {
        //get the a, b, and c values from the user
        //use StdIn
        StdOut.println("Enter the values for A, B, and C in the standard form of a line.");
        StdOut.println("Enter the 'A' value: ");
        a = StdIn.readDouble(); 
        StdOut.println("Enter the 'B' value: ");
        b = StdIn.readDouble();
        StdOut.println("Enter the 'C' value: ");
        c = StdIn.readDouble();
    }
    
    /**
     * use the user input a, b and c values to calculate points on the line
     * store calculated points in ArrayLists
     * setter method
     * @param- not used
     * nothing returned
     * 
     */    
    public void setPoints()
    {
        for (double x = -15; x <= 15; x += 0.01)
        {
            double y = ((-1*c) - (a*x))/b; //calculate y values for x values from -15 to 15
            double y2 = -1000;
            
            xValues.add(x); //add x values to ArrayList to store them to graph later
            yValues.add(y); //add y values to ArrayList to store them to graph later
            yValues2.add(y2);
        }
    } 
    
    /**
     * return the arrayList of x values
     * @param- not used
     * accessor method
     */
    public ArrayList getxVals()
    {
        return xValues; //return ArrayList xValues
    }
    
    /**
     * return the arrayList of y values
     * @param- not used
     * accessor method
     */
    public ArrayList getyVals()
    {
        return yValues; //return ArrayList yValues
    }
    
    /**
     * return the arrayList of y values
     * @param- not used
     * accessor method
     */
    public ArrayList gety2Vals()
    {
        return yValues; //return ArrayList yValues
    }
}
