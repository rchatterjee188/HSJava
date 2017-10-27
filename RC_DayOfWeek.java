
/**
 * Takes a date as input and prints the day of the week that date falls on. 
 *
 * Ruhika Chatterjee
 * 9/20/16
 */
public class RC_DayOfWeek
{
    public static void main (String args [])
    {
        int month = Integer.parseInt (args[0]);
        int date = Integer.parseInt (args[1]);
        int year = Integer.parseInt (args[2]);
        
        int y0 = year-(14-month)/12;
        int x = year + year/4 - year/100 + year/400;
        int m0 = month + 12*((14-month)/12) - 2;
        int day = (date + x + 31*m0/12) % 7;
        
        System.out.println ("The day of the week for " + month+"/"+date+"/"+year + " is: " + day);
    }
}

/*
 * Sample Input: {"9","20","2016"}
 * Sample Output: The day of the week for 9/20/2016 is: 2
 */