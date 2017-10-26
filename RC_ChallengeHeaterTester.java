
/**
 * Tests the RC_ChallengeHeater class.
 * 
 * Ruhika Chatterjee
 * 3/1/17
 */
public class RC_ChallengeHeaterTester
{
    public static void main (String args [])
    {
        RC_ChallengeHeater myThermostat = new RC_ChallengeHeater (30.0, 10.0);
        System.out.println ("The temperatures change from 15.0 degrees to:");
        
        myThermostat.cooler();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.cooler();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.warmer();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.setIncrement (10.0);
        
        myThermostat.warmer();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.warmer();
        System.out.println (myThermostat.getTemperature ());
        
        myThermostat.cooler();
        System.out.println (myThermostat.getTemperature ());
    }
}

/*
 * The temperatures change from 15.0 degrees to:
 * 10.0
 * 10.0
 * 15.0
 * 25.0
 * 25.0
 * 15.0
 */
