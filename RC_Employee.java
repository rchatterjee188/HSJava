
/**
 * An employee has a name (a string) and a salary (a double). Write a default constructor, 
 * a constructor with two parameters (name and salary), and methods to return the name and salary. 
 * 
 * Ruhika Chatterjee
 * 3/3/17
 */
public class RC_Employee
{
    private String name;
    private double salary;
    
    /**
     * Default constructor for RC_Employee class
     */
    public RC_Employee ()
    {
    }
    
    /**
     * Constructor for RC_Employee class
     * @param name of employee, salary of employee as a double
     */
    public RC_Employee (String employeeName, double employeeSalary)
    {
        name = employeeName;
        salary = employeeSalary;
    }
    
    /**
     * @return the name of the employee
     */
    public String getName ()
    {
        return name;
    }
    
    /**
     * @return the salary of the employee
     */
    public double getSalary ()
    {
        return salary;
    }
}
