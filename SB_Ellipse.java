import java.util.ArrayList;
/**
 * A class to provide data of a ellipse given the user-inputted center, a, and b of the ellipse
 * 
 * Satya Baliga
 * 06.07.17
 */
public class SB_Ellipse implements RC_Shape
{
    private ArrayList<Double> xValues;
    private ArrayList<Double> yValues1;
    private ArrayList<Double> yValues2;
    private double a; //distance from center to vertex
    private double b; //distance from center to covertex
    private double h; //x coordinate of the center
    private double k; //y coordinate of the center
    private String horizOrVert; //orientation
    private double xVals;
    
    /**
     * a constructor for the SB_Ellipse class
     * initializes variables/get user input/calculate points
     * @param- not used
     */
    public SB_Ellipse()
    {
        xValues = new ArrayList<>();
        yValues1 = new ArrayList<>();
        yValues2 = new ArrayList<>();
        
        userInput();
        setPoints();
    }
    
    /**
     * get input necessary from the user to draw the ellipse
     * input needed: a and b values, center coordinates, orientation
     * it is assumed that all user input is good
     * @param- not used
     */
    public void userInput()
    {
        //get the values of a, b, h, and k from the user
        StdOut.println("Enter the value of a: ");
        a = StdIn.readDouble();
        StdOut.println("Enter the value of b: ");
        b = StdIn.readDouble();
        
        StdOut.println("Enter the x-coordinate of the center: ");
        h = StdIn.readDouble();
        StdOut.println("Enter the y-coordinate of the center: ");
        k = StdIn.readDouble();
        
        StdOut.println("Do you want to graph a horizontal or vertical ellipse? (h/v): ");
        horizOrVert = StdIn.readString();
        xVals = 0;
        if (horizOrVert.equals("h"))
        {
            xVals = a;
        }
        else
        {
            xVals = b;
        }
    }
    
    /**
     * calculate points on the ellipse using characteristics given by the user
     * add calculated values to arrayLists to store them to graph later
     * setter method
     */
    public void setPoints()
    {
        int pointListCounter = 0;
        
        if (horizOrVert.equals("h")) //if a horizontal ellipse
        {
            for (double i = h - xVals; i <= h + xVals; i += 0.01)
            {
                pointListCounter++;
                
                double x = i;
                double y = k + Math.sqrt(Math.pow(b, 2) * (1 - (Math.pow((x-h), 2)/Math.pow(a, 2))));
                double y2 = k - Math.sqrt(Math.pow(b, 2) * (1 - (Math.pow((x-h), 2)/Math.pow(a, 2))));
                
                //pointList[pointListCounter][0] = x;
                //pointList[pointListCounter][1] = y;
                //pointList[pointListCounter][2] = y2;
                xValues.add( x);
                yValues1.add(y);
                yValues2.add(y2);
            }
        }
        else //if a vertical ellipse
        {
            for (double i = h - xVals; i <= h + xVals; i += 0.01)
            {
                pointListCounter++;
                double x = i;
                double y = k + Math.sqrt(Math.pow(a, 2) * (1 - (Math.pow((x-h), 2)/Math.pow(b, 2))));
                double y2 = k - Math.sqrt(Math.pow(a, 2) * (1 - (Math.pow((x-h), 2)/Math.pow(b, 2))));
                
                //pointList[pointListCounter][0] = x;
                //pointList[pointListCounter][1] = y;
                //pointList[pointListCounter][2] = y2;
                
                xValues.add( x);
                yValues1.add(y);
                yValues2.add(y2);
            }
        }
    }
    
    /**
     * return the arrayList of x values on the ellipse
     * @param- not used
     * accessor method
     */
    public ArrayList getxVals()
    {
        return xValues; //return ArrayList of x values
    }
    
    /**
     * a method to return an arrayList of the y values below the center corresponding to the x values 
     * @param- not used
     * accessor method
     */
    public ArrayList getyVals()
    {
        return yValues1; //return ArrayList of y values
    }
    
    /**
     * a method to return an arrayList of the y values above the center corresponding to the x values 
     * @param- not used
     * accessor method
     */
    public ArrayList gety2Vals()
    {
        return yValues2; //return arrayList of y values
    }
}
