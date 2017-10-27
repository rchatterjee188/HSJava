/**
 * Uses the 5 shape classes to take in an input from the user for the shape and print the graph.
 * Allows user to add new shapes to the drawing on the graph
 * 
 * Ruhika Chatterjee and Satya Baliga
 * 06.07.17
 */
 
import java.util.ArrayList;
import java.util.HashMap;
public class ConicSectionGraph
{
    private int graphSize;
    private HashMap<String,RC_Shape> shape;
    
    /**
     * constructor/driver for the ConicSectionGraph project
     * initialize variables and holds code to call functions to draw the graph
     * has code to check for a mouse clicking on either "button" on the graph
     * @param- not used
     */
    public ConicSectionGraph (){
        graphSize = 30; //dimensions of the graph/canvas
        
        shape = new HashMap<>(); // initialize hashMap shape
        
        drawGrid(); //draw the grid, include x and y axis
        
        graphShape(); // graph the shape
        
        StdDraw.enableDoubleBuffering();
        while (true){
            if (StdDraw.mousePressed()){
                double x = StdDraw.mouseX();
                double y = StdDraw.mouseY();
                if (x > 0.5 && x < 4.5 && y < 28.75 && y > 27.25){
                    graphShape(); //checks for mouseclick on the "add" button
                }
                if (x > 0.5 && x < 4.5 && y < 26.75 && y > 25.25){
                    return; //checks for mouseclick on the "end" button
                }
            }
        }
    }
    
    /**
     * a method to create new shape objects to graph on the graph
     * adds new shapes to a hashMap of shapes
     * @param-not used
     * input: the user is asked to input the name he/she would like to call shape (the key used to access the shape in the hashmap)
     */
    public void graphShape (){
        String conic = getConicShape(); //user-inputted string indicating which conic the user wants to draw
        StdOut.print ("What would you like to call it?: "); 
        String name = StdIn.readString(); //key used to put the shape into the hashMap
        
        RC_Shape newShape;
        if (conic.equals("line")) {newShape = new SB_Line();}
        else if (conic.equals("circle")) {newShape = new SB_Circle();} //create instance of SB_Circle
        else if (conic.equals("ellipse")) {newShape = new SB_Ellipse();}
        else if (conic.equals("parabola")) {newShape = new RC_Parabola();}
        else {newShape = new RC_Hyperbola();}
        shape.put(name, newShape); //add the new shape to the hashMap shape
        
        drawGraph(name); //draw the graph of the new shape
        
        StdDraw.show();
    }
    
    /**
     * decide which conic section the user would like to draw based upon what they input
     * present the user with options of which conic sections they may draw and ask them to input which one
     * they would like to draw
     * @param- not used
     */
    public String getConicShape (){
        String input = ""; //get the user input
        ArrayList<String> shapes = new ArrayList<>(5); //create array list of possible conic sections
        shapes.add("line");
        shapes.add("circle");
        shapes.add("ellipse");
        shapes.add("parabola");
        shapes.add("hyperbola");
        
        //print the user's options of conic sections to draw
        StdOut.println ("Please enter the shape you want to draw of the following:");
        for (String word : shapes){
            StdOut.println (word);
        }
        
        //until the user chooses a conic section to draw, keep asking them to input one
        while (! (shapes.contains((input)))){
            StdOut.print (">");
            input = StdIn.readLine();
        }
        return input;
    }
        
    /**
     * draw the coordinate grid in black on which the conic section will be drawn
     * the x and y axis are thicker than the rest of the lines
     * @param- not used
     */
    private void drawGrid () {
        StdDraw.setXscale(0, graphSize);
        StdDraw.setYscale(0, graphSize);
        StdDraw.setPenRadius(0.0005);
        StdDraw.setPenColor(StdDraw.BLACK);
        
        //draw the coordinate grid
         for (int i = 0; i < graphSize; i++){
            StdDraw.line(i, 0, i, graphSize); //draw vertical lines
            StdDraw.line(0, i, graphSize, i); //draw horizontal lines
        }
        
        //draw the x and y axises
        StdDraw.setPenRadius(0.001); //the x and y axis are thicker than the other graph lines so they can be seen
        StdDraw.line(graphSize/2, 0, graphSize/2, graphSize);
        StdDraw.line(0, graphSize/2, graphSize, graphSize/2);
    }
    
    /**
     * draw the graph of the conic section in magenta using the arrayLists of x and y coordinate values 
     * that correspond to each other with each array index
     * @param- name >> they key to access the shape in the hashMap shape
     */
    private void drawGraph (String name) {
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(StdDraw.MAGENTA); //set the pen color to purple to draw the conic graph
        
        ArrayList<Double> xValues = shape.get(name).getxVals();
        ArrayList<Double> yValues1 = shape.get(name).getyVals();
        ArrayList<Double> yValues2 = shape.get(name).gety2Vals();
        
        double x, y1, y2;
        for (int i = 0; i < xValues.size(); i++){
            x = xValues.get(i); y1 = yValues1.get(i); y2 = yValues2.get(i);
            if (y1 >= (-1 *graphSize/2) && y1 <= (graphSize/2)) StdDraw.point(graphSize/2 + x, graphSize/2 + y1);
            if (y2 >= (-1 *graphSize/2) && y2 <= (graphSize/2)) StdDraw.point(graphSize/2 + x, graphSize/2 + y2);
        }
        
        //draw the "add" button so the user can draw another shape
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(2.5, 28, 2, 0.75);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(2.5, 28, "Add");
        
        //draw the "end" button so the user can end the program (end the while true loop)
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(2.5, 26, 2, 0.75);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(2.5, 26, "End");
    }
}
 
 /*
  * Example of the end of an input:

 10
Horizontal or vertical? (h/v): 
v
Please enter the shape you want to draw of the following:
line
circle
ellipse
parabola
hyperbola
>>parabola
What would you like to call it?: hair3
What is the value of p?: 
-4.083333
What is the value of h?: 
0
What is the value of k?: 
10
Horizontal or vertical? (h/v): 
v
Please enter the shape you want to draw of the following:
line
circle
ellipse
parabola
hyperbola
>>circle
What would you like to call it?: pupil1
Enter the radius of the circle: 
1.25
Enter the x-coordinate of the center: 
4
Enter the y-coordinate of the center: 
4
Please enter the shape you want to draw of the following:
line
circle
ellipse
parabola
hyperbola
>>circle
What would you like to call it?: pupil2
Enter the radius of the circle: 
1.25
Enter the x-coordinate of the center: 
-4
Enter the y-coordinate of the center: 
4

  */