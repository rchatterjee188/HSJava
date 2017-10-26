
/**
 * Model the operation of a heater, with a temperature.
 * 
 * Create a new project, heater-exercise, within BlueJ. Edit the details in the project description—the 
 * text note you see in the diagram. Create a class, Heater, that contains a single field, temperature 
 * whose type is double-precision floating point—see Appendix B, section B.1, for the Java type name 
 * that corresponds to this description. Define a constructor that takes no parameters. The temperature 
 * field should be set to the value 15.0 in the constructor. Define the mutators warmer and cooler, 
 * whose effect is to increase or decrease the value of temperature by 5.0° respectively. Define an 
 * accessor method to return the value of temperature.
 * 
 * Ruhika Chatterjee
 * 3/1/17
 */
public class RC_Heater
{
    // The current temperature
    private double temperature;
    
    /**
     * Create a Heater object, with initial temperature
     */
    public RC_Heater ()
    {
        temperature = 15.0;
    }
    
    /**
     * Increases the temperature by 5 degrees.
     */
    public void warmer ()
    {
        temperature += 5.0;
    }
    
    /**
     * Decreases the temperature by 5 degrees.
     */
    public void cooler ()
    {
        temperature -= 5.0;
    }
    
    /**
     * Return the value from temperature.
     */
    public double getTemperature ()
    {
        return temperature;
    }
}
