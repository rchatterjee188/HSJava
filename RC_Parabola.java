
/**
 * Takes in input from the user about the parabola, and provides an output with data of the parabola
 * 
 * Ruhika Chatterjee
 * 06.07.17
 */

import java.util.ArrayList;
public class RC_Parabola implements RC_Shape
{
    private String orientation; //does the parabola face up/down or left/right
    private double p; // distance from the vertex to the focus
    private double h; //x ccordinate of the vertex
    private double k; //y coordinate of the vertex
    private ArrayList xPoints; //arrayList of the x values on the parabola
    private ArrayList yPoints1; //arrayList of the y values
    private ArrayList yPoints2; //arrayList of y values
    
    /**
     * constructor for RC_Parabola class
     * initialize variables/get input/calculate points
     * @param- not used
     */
    public RC_Parabola(){
        //initialize arrayLists
        xPoints = new ArrayList<>();
        yPoints1 = new ArrayList<>();
        yPoints2 = new ArrayList<>();
        
        userInput(); //get user to input characteristics of the parabola they would like to draw
        setPoints(); //calculate points on the parabola using the characteristics given by the user
    }
    
    /**
     * a method to get the user input about characteristics of the conic section
     * it is assumed that all user input is good // no checks
     * @param- not used
     * input needed: p value, center, orientation
     */
    public void userInput(){
        StdOut.println ("What is the value of p?: "); 
        p = StdIn.readDouble (); //distance from the center to the focus
        StdOut.println ("What is the value of h?: ");
        h = StdIn.readDouble (); //x coordinate of the center
        StdOut.println ("What is the value of k?: ");
        k = StdIn.readDouble (); //y coordinate of the center
        StdOut.println ("Horizontal or vertical? (h/v): ");
        orientation = StdIn.readString(); //orientation of the parabola
    }
    
    /**
     * a method to calculate points on the parabola and put them into the arraylists to hold the points
     * the points in the arrayLists will be graphed at a later point
     * @param-not used
     */
    public void setPoints(){
        double y1;
        double y2;
        for (double x = -15; x <= 15; x += 0.03){
            if (orientation.equals("h")){ //if the parabola faces up/down
                double root = 4*p*(x-h);
                if (root >= 0){
                    y1 = Math.sqrt (root) + k;
                    y2 = (-1 * Math.sqrt (root)) + k;
                }
                else{
                    y1 = -100;
                    y2 = -100;
                }
            }
            else { //if parabola faces right/left
                y1 = ((Math.pow((x-h), 2))/(4*p)) + k;
                y2 = -100;
            }
            
            if ((y1 >= -15 && y1 <= 15) || (y2 >= -15 && y2 <= 15)){
                xPoints.add(x);
                yPoints1.add(y1);
                yPoints2.add(y2);
            }
        }
    }
    
    /**
     * return the array list of x values on the parabola
     * @param- not used
     * accessor method
     */ 
    public ArrayList<Double> getxVals(){
        return xPoints; //arrayList of x values
    }
    
    /**
     * return the array list of y values on the parabola
     * @param- not used
     * accessor method
     */
    public ArrayList<Double> getyVals(){
        return yPoints1; //arrayList of y values
    }
    
    /**
     * return the second array list of y values on the parabola
     * @param- not used
     * accessor method
     */
    public ArrayList<Double> gety2Vals(){
        return yPoints2; //arrayList of y values
    }
}
