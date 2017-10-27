/**
 * Use the tools from the BouncingBall program to implement YI_RandomBlock.java. 
 * This program re-uses the program from the graph paper assignment and randomly 
 * select squares on the grid that will become a solid color or "alive" and then 
 * randomly it will become back to white or "dead" again.
 * 
 * Ruhika Chatterjee
 * 1/10/17
 */

public class RC_RandomBlock { 
    public static void main(String[] args) {
        // set the scale of the coordinate system
        StdDraw.setXscale(0, 10);
        StdDraw.setYscale(0, 10);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0, ry = 0;     // position
        double radius = 0.5;              // radius

        // main animation loop
        while (true)  { 
            // clear the background
            StdDraw.clear(StdDraw.GRAY);
            
            // redraw grid
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    StdDraw.square(i + 0.5, j + 0.5, 0.5);
                }
            }
            
            // update position and draw ball on the screen
            for (int i = 0; i < 10; i ++){
                rx = (double) ((int) (Math.random () * 10)) + 0.5;
                ry = (double) ((int) (Math.random () * 10)) + 0.5;
                StdDraw.filledSquare(rx, ry, radius); 
            }
            
            // copy offscreen buffer to onscreen
            StdDraw.show();
            
            // pause for 1 s
            StdDraw.pause(1000);
        } 
    } 
} 

