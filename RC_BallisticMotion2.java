
/**
 * Re-write previous assignment using "Object Oriented" design.
 * 
 * Use the program given in the class website to enhance it to show the image bellow:
 * 1. The values should change as the ball travels through the air.
 * 2. The values should move with the ball.
 * 3. The arrow should get smaller or larger according to the velocity.
 * 4. The blue text and dotted curve is not included in the GUI.
 * 
 * Compilation: javac BallisticMotion.java
 * Execution: java BallisticMotion v theta
 * Dependencies: StdDraw.java
 *
 * Simluate the motion of a ball fired with velocity v at theta degrees
 * with coefficient of drag C. Uses Euler-Cramer method to numerically
 * solve differential equation.
 * 
 * 
 * Plots the trajectory of a ball that is shot with velocity v at an angle theta. Account for gravitational 
 * and drag forces. Assume that the drag force is proportional to the square of the velocity. Using Newton's 
 * equations of motions and the Euler-Cromer method, update the position, velocity, and acceleration according 
 * to the following equations:
 * Use the given program to enhance it to show the image bellow:
 * 1. The values should change as the ball travels through the air.
 * 2. The values should move with the ball.
 * 3. The blue text and dotted curve is not included in the GUI.
 * 
 * Ruhika Chatterjee
 * 4/2/17
 */

public class RC_BallisticMotion2 {
    private double G; // gravitational constant m/s^2
    private double C; // drag force coefficient
    
    private double v; // velocity
    private double theta; // angle in radians
    
    private double t; // time
    private double dt; // time quantum
    
    private double maxR; // maximum distance without drag force
    
    /**
     * Constructor for RC_BallisticMotion2 that initializes the values for a ball's flight.
     */
    public RC_BallisticMotion2 (double velocity, double degrees){
        G = 9.8;
        C = 0.002;
        
        v = velocity;
        theta = Math.toRadians(degrees);
        
        t = 0.0;
        dt = 0.01;
        
        maxR = v*v / G;
        StdDraw.setXscale(0, maxR);
        StdDraw.setYscale(0, maxR); // set the same as for X-scale
    }
    
    
    public void runSimulation (){
        double x = 0.0; // position
        double y = 0.0; // position
        
        double ax = 0.0; // acceleration
        double ay = 0.0; // acceleration
        
        double vx = v * Math.cos(theta); // velocity in x direction
        double vy = v * Math.sin(theta); // velocity in y direction
        
        double [] xList = new double [(int) maxR * 5]; // list of x values in trajectory
        double [] yList = new double [(int) maxR * 5]; // list of corresponding y values
        
        int counter = 1;
        while (y >= 0.0) {
            StdDraw.clear();
            
            v = Math.sqrt(vx*vx + vy*vy);
            ax = -C * v * vx;
            ay = -G - C * v * vy;
            vx += ax * dt;
            vy += ay * dt;
            x += vx * dt;
            y += vy * dt;
            
            if (x > xList[counter-1] + 0.2){
                xList[counter] = x;
                yList[counter] = y;
                counter ++;
            }
            
            StdDraw.textLeft (1, maxR*.7, ("vy = " + vy));
            StdDraw.textLeft (1, maxR*.75, ("y = " + y));
            StdDraw.textLeft (1, maxR*.8, ("ay = " + ay));
            StdDraw.textLeft (1, maxR*.85, ("vx = " + vx));
            StdDraw.textLeft (1, maxR*.9, ("x = " + x));
            StdDraw.textLeft (1, maxR*.95, ("ax = " + ax));
            
            StdDraw.setPenColor (255,0,0);
            StdDraw.filledCircle(x, y, 3);
            StdDraw.setPenColor (0,0,0);
            StdDraw.line (x, y, x, y + vy);
            StdDraw.line (x, y, x + vx, y);
            
            for (int j = 0; j < counter; j ++){
                StdDraw.filledCircle(xList[j], yList[j], 0.25);
            }
            
            StdDraw.show(5);
        }
        StdDraw.show();
    }
}
