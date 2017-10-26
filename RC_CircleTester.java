
/**
 * Tests the RC_Circle class
 * 
 * Ruhika Chatterjee
 * 3/6/17
 */
public class RC_CircleTester
{
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a circle with radius 1
        RC_Circle circle1 = new RC_Circle(); 
        System.out.println("The area of the circle of radius " + circle1.getRadius() + " is " + circle1.getArea()); 
        
        // Create a circle with radius 25
        RC_Circle circle2 = new RC_Circle(25); 
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());
        
        // Create a circle with radius 125
        RC_Circle circle3 = new RC_Circle(125);     
        System.out.println("The area of the circle of radius " + circle3.getRadius() + " is " + circle3.getArea());
        
        // Modify circle radius
        circle2.setRadius(100.0);
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());
    }
}
/*
 * The area of the circle of radius 1.0 is 3.141592653589793
 * The area of the circle of radius 25.0 is 1963.4954084936207
 * The area of the circle of radius 125.0 is 49087.385212340516
 * The area of the circle of radius 100.0 is 31415.926535897932
*/
