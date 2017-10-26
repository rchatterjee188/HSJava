
/**
 * Draw a pink heart: Draw a diamond, then draw two circles to the upper left and upper right sides.
 * 
 * Ruhika Chatterjee
 * 2/14/17
 */
public class RC_Heart
{
    private Triangle base;
    private Triangle top;
    private Circle right;
    private Circle left;
    
    /**
     * Sets all values for the heart as a medium heart
     */
    public RC_Heart()
    {
        base = new Triangle (-150, 260, 250, 400, "red");
        top = new Triangle (100, 250, 250, 150, "red");
        right = new Circle (175, 215, 120, "red");
        left = new Circle (175, 110, 120, "red");
    }
    
    /**
     * Changes the heart to be medium sized
     */
    public void setMedium ()
    {
        makeInvisible();
        
        base.changeSize(-150, 260);
        top.changeSize(100, 250);
        base.moveVertical (-70);
        top.moveVertical (70);
        right.changeSize (175);
        left.changeSize (175);
        right.moveHorizontal (26);
        left.moveHorizontal (79);
        right.moveVertical (91);
        left.moveVertical (91);
        
        makeVisible();
    }
    
    public void setLarge ()
    {
        makeInvisible();
        
        base.changeSize (-240, 416);
        top.changeSize (160, 400);
        base.moveVertical (70);
        top.moveVertical (-70);
        right.changeSize (280);
        left.changeSize (280);
        right.moveHorizontal (-26);
        left.moveHorizontal (-79);
        right.moveVertical (-91);
        left.moveVertical (-91);
        
        makeVisible();
    }
    
    public void makeVisible ()
    {
        base.makeVisible();
        top.makeVisible();
        right.makeVisible();
        left.makeVisible();
    }
    
    public void makeInvisible ()
    {
        base.makeInvisible();
        top.makeInvisible();
        right.makeInvisible();
        left.makeInvisible();
    }
    
    public void drawFlashing ()
    {
        makeVisible ();
        double counter = 0.0;
        for (int i = 0; i < 10; i ++) {
            while (counter < 1000000.0) counter += 0.01;
            setLarge ();
            counter = 0;
            
            while (counter < 1000000.0) counter += 0.01;
            setMedium ();
            counter = 0;
        }
    }
}
