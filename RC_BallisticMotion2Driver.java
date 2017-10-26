
/**
 * Tests the RC_BallisticMotion2 class
 * 
 * Ruhika Chatterjee
 * 4/3/17
 */
public class RC_BallisticMotion2Driver
{
    public static void main (String args [])
    {
        RC_BallisticMotion2 ballTrajectory = new RC_BallisticMotion2 (30, 50);
        ballTrajectory.runSimulation();
        
        RC_BallisticMotion2 ballTrajectory2 = new RC_BallisticMotion2 (100, 60);
        ballTrajectory2.runSimulation();
    }
}
