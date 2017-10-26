
/**
 * Tests RC_Greeter class
 * 
 * Ruhika Chatterjee
 * 2/13/17
 */
public class RC_GreeterTest
{
    public static void maing (String args [])
    {
        RC_Greeter worldGreeter = new RC_Greeter ("Ruhika");
        System.out.println (worldGreeter.sayHello());
        System.out.println (worldGreeter.sayGoodbye());
        System.out.println (worldGreeter.refuseHelp());
    }
}

/*
 * Output:
 * Hello, Ruhika!
 * Goodbye, Ruhika!
 * I am sorry, Ruhika. I am afraid I can't do that.
 * 
 */