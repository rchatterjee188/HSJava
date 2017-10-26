
/**
 * Use the program given in the class website to enhance it to show the image:
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
 * 3/28/17
 */

public class RC_BallisticMotion1
{
    public static void main(String[] args) {
        double G = 9.8; // gravitational constant m/s^2
        double C = 0.002; // drag force coefficient
        
        double v = Double.parseDouble(args[0]); // velocity
        double theta = Math.toRadians(Double.parseDouble(args[1])); // angle in radians
        
        double x = 0.0, y = 0.0; // position
        double vx = v * Math.cos(theta); // velocity in x direction
        double vy = v * Math.sin(theta); // velocity in y direction
        
        double ax = 0.0, ay = 0.0; // acceleration
        double t = 0.0; // time
        double dt = 0.01; // time quantum
        
        double maxR = v*v / G; // maximum distance without drag force
        StdDraw.setXscale(0, maxR);
        StdDraw.setYscale(0, maxR); // set the same as for X-scale
        
        double [] xList = new double [(int) maxR * 5];
        double [] yList = new double [(int) maxR * 5];
        
        int counter = 1;
        
        // loop until ball hits ground
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
            
            StdDraw.setPenColor (255,0,0);
            StdDraw.filledCircle(x, y, 3);
            StdDraw.setPenColor (0,0,0);
            StdDraw.line (x, y, x, y + vy);
            StdDraw.line (x, y, x + vx, y);
            
            for (int i = 0; i < counter; i ++){
                StdDraw.filledCircle(xList[i], yList[i], 0.25);
            }
            
            StdDraw.textLeft (1, maxR*.7, ("vy = " + vy));
            StdDraw.textLeft (1, maxR*.75, ("y = " + y));
            StdDraw.textLeft (1, maxR*.8, ("ay = " + ay));
            StdDraw.textLeft (1, maxR*.85, ("vx = " + vx));
            StdDraw.textLeft (1, maxR*.9, ("x = " + x));
            StdDraw.textLeft (1, maxR*.95, ("ax = " + ax));
            
            StdDraw.show(5);
        }
        StdDraw.show();
    }
}
// {"30", "50"}
