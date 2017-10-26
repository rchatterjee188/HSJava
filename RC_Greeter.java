
/**
 * Greets the user.
 * 
 * Add a method sayGoodbye to the Greeter class.
 * Add a method refuseHelp to the Greeter class. It should return a string such as "I am sorry, Dave. I am afraid I can't do that."
 * 
 * Is an ADT- abstract data type
 * Instance field is empty with type "void"- attribute for RC_Greeter
 * 
 * Ruhika Chatterjee
 * 2/13/17
 */
public class RC_Greeter
{
    private String name;
    
    public RC_Greeter (String input)
    {
        name = input;
    }
    
    public String sayHello ()
    {
        String message = "Hello, " + name + "!";
        return message;
    }
    
    public String sayGoodbye ()
    {
        String message = "Goodbye, " + name + "!";
        return message;
    }
    
    public String refuseHelp ()
    {
        String message = "I am sorry, " + name + ". I am afraid I can't do that.";
        return message;
    }
}