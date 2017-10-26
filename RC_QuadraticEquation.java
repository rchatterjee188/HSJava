
/**
 * Design a class named QuadraticEquation for a quadratic equation ax2 + bx + c = 0. The class contains:
 * 
 * Private data fields a, b, and c that represent three coefficients.
 * A constructor for the arguments for a, b, and c.
 * Three getter methods for a, b, and c.
 * A method named getDiscriminant() that returns the discriminant, which is b^2 - 4ac.
 * The methods named getRoot1() and getRoot2() for returning two roots of the equation.
 * These methods are useful only if the discriminant is nonnegative. Let these methods 
 * return 0 if the discriminant is negative.
 * What does the compiler do when the discriminant is negative?
 * 
 * Ruhika Chatterjee
 * 3/15/17
 */
public class RC_QuadraticEquation
{
    private double a;
    private double b;
    private double c;
    
    /**
     * Constructor to define the instance fields a, b, and c.
     * @param the coefficients of the equation ax^2 + bx + c = 0
     */
    public RC_QuadraticEquation (double coefficientA, double coefficientB, double coefficientC)
    {
        a = coefficientA;
        b = coefficientB;
        c = coefficientC;
    }
    
    
    /**
     * Returns the coefficint a in the equation ax^2 + bx + c = 0
     * @return instance field a
     */
    public double getA ()
    {
        return a;
    }
    
    /**
     * Returns the coefficint b in the equation ax^2 + bx + c = 0
     * @return instance field b
     */
    public double getB ()
    {
        return b;
    }
    
    /**
     * Returns the coefficint c in the equation ax^2 + bx + c = 0
     * @return instance field c
     */
    public double getC ()
    {
        return c;
    }
    
    /**
     * Calculate and return the discriminant (b^2 - 4ac)
     * @return discriminnt
     */
    public double getDiscriminant ()
    {
        return Math.pow(b,2) - (4 * a * c);
    }
    
    /**
     * Calculate and return the one of the roots of the equation ax^2 + bx + c = 0
     * @return the root obtained with adding
     */
    public double getRoot1 ()
    {
        if (getDiscriminant () >= 0) return (-b + Math.pow (getDiscriminant (), 0.5)) / (2 * a);
        else return -1;
    }
    
    /**
     * Calculate and return the one of the roots of the equation ax^2 + bx + c = 0
     * @return the root obtained with subtracting
     */
    public double getRoot2 ()
    {
        if (getDiscriminant () >= 0) return (-b - Math.pow (getDiscriminant (), 0.5)) / (2 * a);
        else return -1;
    }
}
