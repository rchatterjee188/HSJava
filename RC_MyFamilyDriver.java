
/**
 * Create or “instantiate” 4 persons, a mother, a father, a son or a daughter, and a friend.
 * Simulate the following set of events:
 * The mother keeps milk in the refrigerator.
 * The father keeps juice in the refrigerator.
 * The son keeps a can of soda in the refrigerator.
 * The friend is thirsty and wants to drink something.
 * 
 * Ruhika Chatterjee
 * 3/3/17
 */
public class RC_MyFamilyDriver
{
    private RC_Person mother;
    private RC_Person father;
    private RC_Person daughter;
    private RC_Person friend;
    
    public RC_MyFamilyDriver ()
    {
        mother = new RC_Person ("Lisa", "mother");
        father = new RC_Person ("Bob", "father");
        daughter = new RC_Person ("Julie", "daughter");
        friend = new RC_Person ("Joey", "friend");
    }
    
    /**
     * Runs a test for RC_Person with RC_MyFamily
     */
    public void test ()
    {
        mother.setWhatIamDoing ("Keeps milk in the refrigerator");
        father.setWhatIamDoing ("Keeps juice in the refrigerator");
        daughter.setWhatIamDoing ("Keeps a can of soda in the refrigerator");
        friend.setWhatIamDoing ("Is thirsty and wants to drink something");
        
        System.out.println (mother.getWhatIamDoing ());
        System.out.println (father.getWhatIamDoing ());
        System.out.println (daughter.getWhatIamDoing ());
        System.out.println (friend.getWhatIamDoing ());
    }
}


/*
 * Keeps milk in the refrigerator
 * Keeps juice in the refrigerator
 * Keeps a can of soda in the refrigerator
 * Is thirsty and wants to drink something
 */