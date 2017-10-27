/**
 * Takes in input from the user about the hyperbola, and provides an output with data of the hyperbola
 * 
 * Ruhika Chatterjee
 * 06.07.17
 */
 
import java.util.ArrayList;
public class RC_Hyperbola implements RC_Shape
{
    private String orientation; // does the hyperbola open up/down vs. right/left
    private double a; // distance from center to vertex
    private double b; //other dimension of the box used to find the asymptotes of the hyperbola
    private double h; //x coordinate of the center of the hyperbola
    private double k; //y coordinate of the center of the hyperbola
    private ArrayList<Double> xPoints; //arrayList to store x values
    private ArrayList<Double> yPoints1; //arrayList to store y values
    private ArrayList<Double> yPoints2; //arraylist to store second set of y values
    
    /**
     * constructorfor the class RC_Hyperbola //creates an instance of the class
     * initializes all variables necessary for the class to run
     * @param- not used
     */
    public RC_Hyperbola(){
        //initialize arrayLists
        xPoints = new ArrayList<>();
        yPoints1 = new ArrayList<>();
        yPoints2 = new ArrayList<>();
        
        userInput(); //get the user input of the characteristics needed to draw the graph
        setPoints(); //calculate the points and put them in arrayLists to draw later
    }
    
    /**
     * a method to ask the user to input characteristics of the hyperbola they would like to draw
     * input needed: orientation, a and b values, center coordinates
     * use StdIn to get the user input
     * it is assumed that all user input is good
     * @param- not used
     */
    public void userInput(){
        StdOut.println ("What is the value of a?: ");
        a = StdIn.readDouble (); //distance from the center to the verticies
        StdOut.println ("What is the value of b?: ");
        b = StdIn.readDouble (); 
        StdOut.println ("What is the value of h?: ");
        h = StdIn.readDouble (); //x coordinate of the center of the hyperbola
        StdOut.println ("What is the value of k?: ");
        k = StdIn.readDouble (); //y coordinate of the center of the hyperbola
        StdOut.println ("Horizontal or vertical? (h/v): ");
        orientation = StdIn.readString(); //does the hyperbola open up/down or left/right
    }
    
    /**
     * a method to calculate points on the hyperbola and store them in arrayLists
     * use the user inputted values to calculate points
     * @param- not used
     * nothing returned
     * 
     */
    public void setPoints(){
        double y1;
        double y2;
        for (double x = -15; x <= 15; x += 0.03){
            if (orientation.equals("h")) { //if the hyperbola opens up/down
                double root = Math.pow(b,2) * (((Math.pow((x-h),2)/Math.pow(a,2)))-1);
                if (root >= 0){
                    y1 = Math.sqrt(root) + k;
                    y2 = (-1 * Math.sqrt(root)) + k;
                }
                else{
                    y1 = -100;
                    y2 = -100;
                }
            }
            else { //if the parabola opens left/right
                double root = Math.pow(a,2) * (1 + (Math.pow((x-h),2) / Math.pow(b,2)));
                if (root >= 0){
                    y1 = Math.sqrt(root) + k;
                    y2 = (-1 * Math.sqrt(root)) + k;
                }
                else{
                    y1 = -100;
                    y2 = -100;
                }
            }
            
            if ((y1 >= -15 && y1 <= 15) || (y2 >= -15 && y2 <= 15)){
                xPoints.add(x);
                yPoints1.add(y1);
                yPoints2.add(y2);
            }
        }
    }
    
    /**
     * return the arrayList of x values on the hyperbola
     * @param- not used
     * accessor method
     */
    public ArrayList<Double> getxVals(){
        return xPoints; //return ArrayList xValues
    }
    
    /**
     * return arrayList of y values associated with the x values on the hyperbola\
     * @param-not used
     * accessor method
     */
    public ArrayList<Double> getyVals(){
        return yPoints1; //return ArrayList yValues
    }
    
    /**
     * return second arraylist of y values associated with the x values on the hyperbola
     * @param- not used
     * accessor method
     */
    public ArrayList<Double> gety2Vals(){
        return yPoints2; //return ArrayList yValues2
    }
}
