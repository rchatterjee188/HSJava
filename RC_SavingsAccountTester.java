
/**
 * Write a tester/driver program that constructs a savings account with an initial balance of 
 * $1,000 and interest rate 10%. Then apply the addInterest method five times and print 
 * the resulting balance.
 * 
 * Ruhika Chatterjee
 * 3/3/17
 */
public class RC_SavingsAccountTester
{
    /**
     * Default constructor for RC_SavingsAccountTester
     */
    public RC_SavingsAccountTester ()
    {
    }
    
    /**
     * Runs the tests for the RC_SavingsAccount class
     */
    public void tester ()
    {
        RC_SavingsAccount account = new RC_SavingsAccount (1000.0, 10.0);
        for (int i = 0; i < 5; i++) {account.addInterest();}
        System.out.println (account.getBalance());
    }
}

// 1610.51