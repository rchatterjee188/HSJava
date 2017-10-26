
/**
 * A class to test changes to the RC_ClockDisplay class.
 * 
 * Ruhika Chatterjee
 * 3/2/17
 */
public class RC_Test12HrClockDisplay
{
    /**
     * Constructor for objects of class RC_TestClockDisplay
     */
    public RC_Test12HrClockDisplay ()
    {
    }
    
    public void test ()
    {
        RC_12HrClockDisplay clock = new RC_12HrClockDisplay();
        
        clock.setTime (4, 0);
        System.out.println (clock.getTime());
        
        clock.setTime (10, 30);
        System.out.println (clock.getTime());
        
        clock.setTime (0, 0);
        System.out.println (clock.getTime());
        
        clock.setTime (11, 59);
        System.out.println (clock.getTime());
        
        clock.timeTick();
        System.out.println (clock.getTime());
    }
}

/*
 * 4:00
 * 10:30
 * 12:00
 * 11:59
 * 12:00
 */
