
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * 
 * Change the clock from a 24-hour clock to a 12- hour clock. Be careful: This is not as easy 
 * as it might at first seem. In a 12-hour clock, the hours after midnight and after noon are 
 * not shown as 00:30, but as 12:30. Thus, the minute display shows values from 0 to 59, while 
 * the hour display shows values from 1 to 12!
 * 
 * Ruhika Chatterjee
 * 3/2/17
 */
public class RC_24HrClockDisplay12
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public RC_24HrClockDisplay12()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public RC_24HrClockDisplay12(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        int hour = hours.getValue();
        String suffix;
        
        if (hour >= 12) {
            suffix = "pm";
            hour -= 12;
        }
        else {suffix = "am";}
        
        if (hour == 0) {hour = 12;}
        
        displayString = hour + "." + 
                        minutes.getDisplayValue() + suffix;
    }
}
