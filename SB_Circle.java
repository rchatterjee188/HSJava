import java.util.ArrayList;
/**
 * A class to provide data of a circle given the user-inputted center and radius of the circle
 * 
 * Satya Baliga
 * 06.07.17
 */
public class SB_Circle implements RC_Shape
{
    private ArrayList<Double> xValues; //arrayList to store x values of points on circle
    private ArrayList<Double> yValues1; //arrayList to store y values of points on circle
    private ArrayList<Double> yValues2; //arrayList to store y values of points on circle
    private double radius; //radius of the circle
    private double h; //x coordinate of the center of the circle
    private double k; //y coordinate of the center of the circle
    
    /**
     * constructor for SB_DrawCircle()
     * initializes variables
     * @param- not used
     */
    public SB_Circle()
    {
        xValues = new ArrayList<>(); //initialize arrayList
        yValues1 = new ArrayList<>(); //initialize arrayList
        yValues2 = new ArrayList<>(); //initialize arrayList
        
        userInput();
        setPoints();
    }
    
    /**
     * get the input necessary from the user to draw the circle
     * input needed: radius and x and y coordinates of the center of the circle
     * it is assumed that all user input is good
     * @param- not used
     */
    public void userInput()
    {
        //get the radius and center coordinates from the user
        //use StdIn to get the user input
        StdOut.println("Enter the radius of the circle: ");
        radius = StdIn.readDouble();
        StdOut.println("Enter the x-coordinate of the center: ");
        h = StdIn.readDouble();
        StdOut.println("Enter the y-coordinate of the center: ");
        k = StdIn.readDouble();
    }
    
    /**
     * calculate points on the circle using characteristics given by the user
     * add calculated values to arrayLists to store them to graph later
     * setter method
     */
    public void setPoints()
    {
 
        for (double a = h - radius; a <= h + radius; a += 0.01)
        {
 
            double x = a;
            double y = k + Math.sqrt((Math.pow(radius, 2) - Math.pow((x-h), 2)));
            double y2 = k - Math.sqrt((Math.pow(radius, 2) - Math.pow((x-h), 2)));
            //pointList[pointlistCounter][0] = x;
            //pointList[pointlistCounter][1] = y;
            //pointList[pointlistCounter][2] = y2;
            
            xValues.add(x);
            yValues1.add(y);
            yValues2.add(y2);
        }
    }
    
    /**
     * return the array list of x values on the circle
     * @param- not used
     * accessor method
     */ 
    public ArrayList getxVals()
    {
        return xValues; // return ArrayList of x values
    }
    
    /**
     * return the array list of y values on the circle above the center
     * @param- not used
     * accessor method
     */
    public ArrayList getyVals()
    {
        return yValues1; // return ArrayList of corresponding y values
    }
    
    /**
     * return the array list of y values on the circle below the center
     * @param- not used
     * accessor method 
     */
    public ArrayList gety2Vals()
    {
        return yValues2; // return second ArrayList of y values
    }
}
