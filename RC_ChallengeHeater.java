
/**
 * Model the operation of a heater, with a temperature.
 * 
 * Define three new double- precision floating point fields: min, max, and increment. 
 * The values of min and max should be set by parameters passed to the constructor. The 
 * value of increment should be set to 5.0 in the constructor. Modify the definitions of 
 * warmer and cooler so that they use the value of increment rather than an explicit value 
 * of 5.0. Before proceeding further with this exercise, check that everything works as before.
 * 
 * Now modify the warmer method so that it will not allow the temperature to be set to a value 
 * greater than max. Similarly modify cooler so that it will not allow temperature to be set to
 * a value less than min. Check that the class works properly. Now add a method, setIncrement,
 * that takes a single parameter of the appropriate type and uses it to set the value of increment.
 * Once again, test that the class works as you would expect it to by creating some Heater objects
 * within BlueJ. Do things still work as expected if a negative value is passed to the setIncrement
 * method? Add a check to this method to prevent a negative value from being assigned to increment.
 * 
 * Ruhika Chatterjee
 * 3/1/17
 */
public class RC_ChallengeHeater
{
    // The current temperature
    private double temperature;
    private double max;
    private double min;
    private double increment;
    
    /**
     * Create a Heater object- with initial temperature and increment, and min and max from param
     * @param minimum temperatue and maximum temperature
     */
    public RC_ChallengeHeater (double maxTemperature, double minTemperature)
    {
        temperature = 15.0;
        max = maxTemperature;
        min = minTemperature;
        increment = 5.0;
    }
    
    /**
     * Increases the temperature by 'increment' degrees.
     */
    public void warmer ()
    {
        if (temperature + increment <= max) {temperature += increment;}
    }
    
    /**
     * Decreases the temperature by 'increment' degrees.
     */
    public void cooler ()
    {
        if (temperature - increment >= min) {temperature -= increment;}
    }
    
    /**
     * Allow the user to set the increment.
     */
    public void setIncrement (double increm)
    {
        if (increm >= 0.0) {increment = increm;}
    }
    
    /**
     * Return the value from temperature.
     */
    public double getTemperature ()
    {
        return temperature;
    }
}
