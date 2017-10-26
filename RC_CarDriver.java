
/**
 * Runs test simulations for RC_Car
 * 
 * Ruhika Chatterjee
 * 3/7/17
 */
public class RC_CarDriver
{
    public static void main (String args [])
    {
        RC_Car myBeemer = new RC_Car(30); // 30 miles per gallon 
        myBeemer.addGas(20); // tank 20 gallons
        myBeemer.drive(100); // drive 100 miles 
        System.out.println(myBeemer.getGas()); // print fuel remaining
    }
}

// 16.666666666666668
