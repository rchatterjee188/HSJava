
/**
 * Write a program that uses RandomBlock as a base and follows the rules of Game of Life.
 * 
 * Ruhika Chatterjee
 * 1/11/16
 */
public class RC_GameOfLife
{
    public static void main (String args [])
    {
        // assign sixe of board
        int N = 50;
        
        // set the scale of the coordinate system
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.enableDoubleBuffering();
        
        // initial values
        double radius = 0.5; // radius
        int surroundCounter = 0;
        int liveCells = 0;
        //initialize list of positions of squares dead(0) or live(1) with random seed of 5-10 live cells
        int [][] squareStates = new int [N][N];
        for (int i = 0; i < N*3; i ++) squareStates [(int)(Math.random ()*N)] [(int)(Math.random ()*N)] = 1;
        //initialize a copy list for implementing tick
        int [][] copyStates = new int [N][N];
        
        // main animation loop
        while (true)  {
            // clear the background
            StdDraw.clear(StdDraw.WHITE);
            
            // redraw grid
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    StdDraw.square(i + 0.5, j + 0.5, 0.5);
                }
            }
            
            //add more live cells to board if too few
            for (int i = 0; i < N; i ++){
                for (int j = 0; j < N; j ++) if (squareStates [i][j] == 1) liveCells ++;
            }
            if (liveCells < N*1.5){
                for (int i = 0; i < N; i ++){
                    squareStates [(int)(Math.random ()*N)] [(int)(Math.random ()*N)] = 1;
                }
            }
            liveCells = 0;
            
            
            //copy squareStates to copyStates
            for (int i = 0; i < N; i ++) for (int j = 0; j < N; j ++) copyStates[i][j] = squareStates[i][j];
            
            // update states of cells for the screen
            for (int x = 0; x < N; x ++){
                for (int y = 0; y < N; y ++){
                    // One tick at a time, keep change from occurring till later
                    if (squareStates[x][y] == 1){
                        if (x>0 && y<N-1) if (squareStates[x-1][y+1] == 1) surroundCounter ++;
                        if (y<N-1) if (squareStates[x][y+1] == 1) surroundCounter ++;
                        if (x<N-1 && y<N-1) if (squareStates[x+1][y+1] == 1) surroundCounter ++;
                        if (x>0) if (squareStates[x-1][y] == 1) surroundCounter ++;
                        if (x<N-1) if (squareStates[x+1][y] == 1) surroundCounter ++;
                        if (x>0 && y>0) if (squareStates[x-1][y-1] == 1) surroundCounter ++;
                        if (y>0) if (squareStates[x][y-1] == 1) surroundCounter ++;
                        if (x<N-1 && y>0) if (squareStates[x+1][y-1] == 1) surroundCounter ++;
                        
                        if (!(surroundCounter==2 || surroundCounter==3)) copyStates[x][y] = 0;
                        surroundCounter = 0;
                    }
                    if (squareStates[x][y] == 0){
                        if (x>0 && y<N-1) if (squareStates[x-1][y+1] == 1) surroundCounter ++;
                        if (y<N-1) if (squareStates[x][y+1] == 1) surroundCounter ++;
                        if (x<N-1 && y<N-1) if (squareStates[x+1][y+1] == 1) surroundCounter ++;
                        if (x>0) if (squareStates[x-1][y] == 1) surroundCounter ++;
                        if (x<N-1) if (squareStates[x+1][y] == 1) surroundCounter ++;
                        if (x>0 && y>0) if (squareStates[x-1][y-1] == 1) surroundCounter ++;
                        if (y>0) if (squareStates[x][y-1] == 1) surroundCounter ++;
                        if (x<N-1 && y>0) if (squareStates[x+1][y-1] == 1) surroundCounter ++;
                        
                        if (surroundCounter == 3) copyStates[x][y] = 1;
                        surroundCounter = 0;
                    }
                }
            }
            
            //copy  copyStates to squareStates
            for (int i = 0; i < N; i ++) for (int j = 0; j < N; j ++)  squareStates[i][j] = copyStates[i][j];
            
            //draw the live squares on the board
            for (int x = 0; x < N; x ++){
                for (int y = 0; y < N; y ++){
                    if (squareStates [x][y] == 1) StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
                }
            }
            
            // copy offscreen buffer to onscreen
            StdDraw.show();
            
            // pause for 0.1 s (10 tick/second)
            StdDraw.pause(100);
        }
    }
}
