
/**
 * Write a class Person with the following specifications:
 * 1. Constructor: it takes a name as a string and a second string argument that describes 
 *    what member of the family it is.
 * 2. Mutator Method: setAge(int anAge). It prompts the user for age and updates the class 
 *    instance field.
 * 3. Mutator Method: setWhatIamDoing(String doing). It prompts the user and updates the class 
 *    instance field currentActivity. Keep the number of activities low so it doesn't become too 
 *    lengthly.
 * 4. Accessor Method: getWhatIamDoing(). It displays the currentActivity.
 * 
 * You can add more methods and instance fields to the Person ADT so you can make the simulation 
 * work nicely.
 * 
 * Some java language help:
 * String a = "abc";
 * String b = "abcdefg";
 * System.out.println(b.contains(a)); // true
 * 
 * Ruhika Chtterjee
 * 3/3/17
 */
public class RC_Person
{
    private String name;
    private String member;
    private int age;
    private String currentActivity;
    
    /**
     * Construstor for RC_Person class
     * @param name of family member, description of what member of the family it is.
     */
    public RC_Person (String memberName, String whatMember)
    {
        name = memberName;
        member = whatMember;
    }
    
    
    /**
     * Prompts the user for age and updates the class instance field.
     * @param age of the family member
     */
    public void setAge (int anAge)
    {
        age = anAge;
    }
    
    /**
     * Prompts the user and updates the class instance field currentActivity. Keep the number of 
     * activities low so it doesn't become too lengthly.
     * @param activity that the member is doing
     */
    public void setWhatIamDoing (String doing)
    {
        currentActivity = doing;
    }
    
    /**
     * It displays the currentActivity.
     * @return activity that the member is doing
     */
    public String getWhatIamDoing ()
    {
        return currentActivity;
    }
}
