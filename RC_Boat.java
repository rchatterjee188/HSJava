/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class RC_Boat
{
    private Square water;
    private Square shipBase;
    private Square shipTop;
    private Triangle sail;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public RC_Boat()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        shipBase = new Square();
        shipBase.changeColor("green");
        shipBase.moveVertical(100);
        shipBase.changeSize(100);
        shipBase.makeVisible();
        
        shipTop = new Square();
        shipTop.changeColor("green");
        shipTop.changeSize(10);
        shipTop.moveVertical(90);
        shipTop.moveHorizontal(45);
        shipTop.makeVisible();
        
        sail = new Triangle();  
        sail.changeColor("green");
        sail.changeSize(50, 100);
        sail.moveHorizontal(60);
        sail.moveVertical(75);
        sail.makeVisible();
        
        water = new Square();
        water.changeColor("blue");
        water.changeSize(500);
        water.moveHorizontal (-200);
        water.moveVertical (150);
        water.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-20);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(shipBase != null)   // only if it's painted already...
        {
            shipBase.changeColor("black");
            shipTop.changeColor("black");
            sail.changeColor("black");
            sun.changeColor("black");
            water.changeColor ("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(shipBase != null)   // only if it's painted already...
        {
            shipBase.changeColor("green");
            shipTop.changeColor("green");
            sail.changeColor("green");
            sun.changeColor("yellow");
            water.changeColor ("blue");
        }
    }
}
