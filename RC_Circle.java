
/**
 * Finds and returns the area and perimeter for a circle with an inputted radius
 * 
 * Ruhika Chatterjee
 * 3/6/17
 */
public class RC_Circle
{
    private double radius;
    
    /**
     * Default constructor for the RC_Circle class to set radius to 1.
     */
    public RC_Circle ()
    {
        radius = 1;
    }
    
    /**
     * Constructor for the RC_Circle class.
     * @param radius of the circle
     */
    public RC_Circle (double circleRadius)
    {
        radius = circleRadius;
    }
    
    
    /**
     * Sets a value of the radius instance field
     * @param radius of the circle
     */
    public void setRadius (double circleRadius)
    {
        radius = circleRadius;
    }
    
    /**
     * Calculate and return the area of the circle.
     * @return area of the circle
     */
    public double getArea ()
    {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    
    /**
     * Calculate and return the perimeter of the circle.
     * @return perimeter of the circle
     */
    public double getPerimeter ()
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    /**
     * Return the radius of the circle (instance field).
     * @return radius of the circle
     */
    public double getRadius ()
    {
        return radius;
    }
}
