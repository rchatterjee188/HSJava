
/******************************************************************************
 *  Ruhika Chatterjee
 *  9/14/16
 *  
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/

public class RC_UseThree {

    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[2] + ", " + args[1] + ", " +args[0]);
        System.out.println(". How are you?");
    }

}
// Input: {"Alice", "Bob", "Paul" }
// Hi, Paul, Bob, Alice. How are you?