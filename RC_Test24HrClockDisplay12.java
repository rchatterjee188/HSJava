
/**
 * A class to test changes to the RC_ClockDisplay class.
 * 
 * Ruhika Chatterjee
 * 3/2/17
 */
public class RC_Test24HrClockDisplay12
{
    /**
     * Constructor for objects of class RC_TestClockDisplay
     */
    public RC_Test24HrClockDisplay12 ()
    {
    }
    
    public void test ()
    {
        RC_24HrClockDisplay12 clock = new RC_24HrClockDisplay12();
        
        clock.setTime (22, 30);
        System.out.println (clock.getTime());
        
        clock.setTime (10, 30);
        System.out.println (clock.getTime());
        
        clock.setTime (0, 0);
        System.out.println (clock.getTime());
        
        clock.setTime (12, 0);
        System.out.println (clock.getTime());
    }
}

/*
 * 10.30pm
 * 10.30am
 * 12.00am
 * 12.00pm
 */
