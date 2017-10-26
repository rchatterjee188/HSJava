
/**
 * Write a test program that shows the growth of the rabbit population for ten months.
 * 
 * Ruhika Chatterjee
 * 3/9/17
 */
public class RC_RabbitPopulationTester
{
    public static void main (String args [])
    {
        RC_RabbitPopulation forestRabbits = new RC_RabbitPopulation ();
        forestRabbits.waitAMonth();
        System.out.println ("Month 1: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 2: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 3: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 4: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 5: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 6: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 7: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 8: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 9: " + forestRabbits.getPairs());
        
        forestRabbits.waitAMonth();
        System.out.println ("Month 10: " + forestRabbits.getPairs());
    }
}

/**
 * Month 1: 1
 * Month 2: 1
 * Month 3: 2
 * Month 4: 3
 * Month 5: 5
 * Month 6: 8
 * Month 7: 13
 * Month 8: 21
 * Month 9: 34
 * Month 10: 55
 */