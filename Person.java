/**
 * Represents a person
 * Abstract simply means you can't create an object of this class (can only create object of subclass)
 */
abstract public class Person {

    private String firstName; // first name of person
    private String lastName; // last name of person
    private int age; // age of person
    private String gender; // gender of person
    private double height; // centimetres
    private String hairColor; // hair color of person


    /**
     *  Converts centimetres height to feet because apparently Americans don't understand the metric system. Sad!
     */
    public double heightInFeet() {
        return height/ (2.54 * 12); // idk what the conversion is?
    }

    /**
     * Construct person object
     */
    public Person(String firstName, String lastName, int age, String gender,
    double height, String hairColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.hairColor = hairColor;
    }
    /**
     * Override Object's toString() method so when called returns string consisting of name of person
     */
    public String toString() {
        return firstName + " " + lastName;
    }

}
