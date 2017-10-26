
/**
 * Tests the RC_Heater class.
 * 
 * Ruhika Chatterjee
 * 3/1/17
 */
public class RC_HeaterTester
{
    public static void main (String args [])
    {
        RC_Heater myThermostat = new RC_Heater ();
        System.out.println ("The temperatures change from 15.0 degrees to:");
        
        myThermostat.cooler();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.cooler();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.warmer();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.warmer();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.warmer();
        System.out.println (myThermostat.getTemperature ());
    }
}

/*
 * The temperatures change from 15.0 degrees to:
 * 10.0
 * 5.0
 * 10.0
 * 15.0
 * 20.0
 */
