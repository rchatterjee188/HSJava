
/**
 * RabbitPopulation simulates the growth of a rabbit population. The rules are as follows: 
 * Start with one pair of rabbits. 
 * Rabbits are able to mate at the age of one month. A month later, each female produces 
 * another pair of rabbits. 
 * Assume that rabbits never die and that the female always produces one new pair (one male, 
 * one female) every month from the second month on. 
 * Implement a method waitAMonth that waits for one month, and a method getPairs that prints 
 * the current number of rabbit pairs.
 * Hint: Keep one instance field for the newborn rabbit pairs and another one for the rabbit 
 * pairs that are at least one month old.
 * 
 * Ruhika Chatterjee
 * 3/8/17
 */
public class RC_RabbitPopulation
{
    // Number of mating pairs of rabbits
    private int numPairs;
    // Number of newborn pairs of rabbits
    private int newBornPairs;
    
    /**
     * Constructor for RC_RabbitPopulation that has a pair of new borns in month 0.
     */
    public RC_RabbitPopulation ()
    {
        numPairs = 0;
        newBornPairs = 1;
    }
    
    
    /**
     * Add the approrpiate number of baby rabbits, and increase the age to the previous new borns.
     */
    public void waitAMonth ()
    {
        int willMate = newBornPairs; // Store the number of rabbits that will grow up
        newBornPairs = numPairs; // Create a new group of newborns
        numPairs += willMate; // Add the previously new born rabbits to the mating population
    }
    
    /**
     * Returns the number of rabbits to the user
     * @return number of mating rabbits
     */
    public int getPairs ()
    {
        return numPairs;
    }
}
