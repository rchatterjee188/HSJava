
/**
 * Write tester/driver program that tests the RC_Employee class.
 * 
 * Ruhika Chatterjee
 * 3/3/17
 */
public class RC_EmployeeTester
{
    /**
     * Default constructor for RC_EmployeeTester class
     */
    public RC_EmployeeTester ()
    {
    }
    
    /**
     * Tests the methods of RC_Employee
     */
    public void test ()
    {
        RC_Employee employee = new RC_Employee ("Julie", 90000.53);
        System.out.println (employee.getName ());
        System.out.println (employee.getSalary ());
    }
}

/*
 * Julie
 * 90000.53
 */