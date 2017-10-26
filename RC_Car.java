
/**
 * A car has a certain fuel efficiency (measured in miles/gallon or liters/km—pick one) and 
 * a certain amount of fuel in the gas tank.
 * The efficiency is specified in the constructor, and the initial fuel level is 0.
 * Supply a method drive that simulates driving the car for a certain distance, reducing 
 * the fuel level in the gas tank, and methods getGas, returning the current fuel level, 
 * and addGas, to tank up.
 * 
 * Ruhika Chatterjee
 * 3/7/17
 */
public class RC_Car
{
    // Fuel efficiency of car in miles/gallon
    private double efficiency;
    // Amount of gas in the car
    private double fuelLevel;
    
    /**
     * Constructor for RC_Car sets efficiency to given amount, and fuelLevel to 0.
     * @param the fuel efficiency of car in miles/gallon
     */
    public RC_Car (double fuelEfficiency)
    {
        efficiency = fuelEfficiency;
        fuelLevel = 0;
    }
    
    /**
     * Default onstructor for RC_Car sets efficiency and fuelLevel to 0.
     */
    public RC_Car ()
    {
        efficiency = 0;
        fuelLevel = 0;
    }
    
    /**
     * Simulates driving by reducing the fuel based on distance given.
     * @param distance traveled
     */
    public void drive (double distance)
    {
        fuelLevel -= distance / efficiency;
    }
    
    /**
     * Returns the current fuel level.
     * @return the fuelLevel
     */
    public double getGas ()
    {
        return fuelLevel;
    }
    
    /**
     * Adds the given number of gallons of gas to the fuelLevel.
     * @param number of gallons to add
     */
    public void addGas (int addGallons)
    {
        fuelLevel += addGallons;
    }
}
