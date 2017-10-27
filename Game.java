/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes   Ruhika Chatterjee
 * @version 2011.07.31
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room dungeons, slytherinStairs, slytherin, hufflepuff, kitchens, stairs,
        entranceHall, hallway, courtyard, greatHall, grounds;
      
        // create the rooms
        dungeons = new Room("the dungeons in the basement used as the healing area");
        slytherinStairs = new Room("the bustling stairwell into the Slytherin Common Room");
        slytherin = new Room("the Slytherin Common Room");
        hufflepuff = new Room("the Hufflepuff Common Room");
        kitchens = new Room ("the kitchens where the house elves are");
        stairs = new Room ("the stair between the dungeons and the ground floor");
        entranceHall = new Room ("the entrance hall into the castle");
        hallway = new Room ("a hallway");
        courtyard = new Room ("the Viaduct Courtyard");
        greatHall = new Room ("the Great Hall used as the dining hall");
        grounds = new Room ("the grounds of the castle (outside)");
        
        // initialise room exits
        dungeons.setExits(slytherinStairs, kitchens, hufflepuff, stairs);
        slytherinStairs.setExits(null, slytherin, dungeons, null);
        slytherin.setExits(null, null, null, slytherinStairs);
        hufflepuff.setExits(dungeons, null, null, null);
        kitchens.setExits(null, null, null, dungeons);
        stairs.setExits(dungeons, entranceHall, null, null);
        entranceHall.setExits(hallway, greatHall, grounds, stairs);
        hallway.setExits(null, courtyard, null, entranceHall);
        courtyard.setExits(null, null, null, hallway);
        greatHall.setExits(null, null, null, entranceHall);
        grounds.setExits(entranceHall, null, null, null);

        currentRoom = dungeons;  // start game downstairs in the dungeons
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        printLocationInfo();
    }
    
    public void printLocationInfo( ) {
        System.out.println("You are in " + currentRoom.getDescription());
        System.out.print("Exits: " + currentRoom.getExitString());
        System.out.println();
    }
    
    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) printHelp();
        else if (commandWord.equals("go")) goRoom(command);
        else if (commandWord.equals("quit")) wantToQuit = quit(command);

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You need to find dead and injured bodies of your fellow");
        System.out.println("classmates who have fallen during the Battle of Hogwarts,");
        System.out.println("which is going on around the enchanted castle of Hogwarts.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("   go quit help");
    }

    /** 
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) System.out.println("There is no door!");
        else {
            currentRoom = nextRoom;
            printLocationInfo();
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else return true;  // signal that we want to quit
    }
}
