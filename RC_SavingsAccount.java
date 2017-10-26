
/**
 * Similar to the BankAccount class, except that it has an added instance variable interest. 
 * Supply a constructor that sets both the initial balance and the interest rate. Supply a method 
 * addInterest (with no explicit parameter) that adds interest to the account.
 * 
 * Ruhika Chatterjee
 * 3/3/17
 */
public class RC_SavingsAccount
{
    private double balance;
    private double interest;
   
   /**
    * Constructs a constructor for RC_SavingsAccount with a given balance and interest rate.
    * @param the initial balance, the rate of interest (as a percent)
    */
   public RC_SavingsAccount (double initialBalance, double interestRate)
   {   
      balance = initialBalance;
      interest = interestRate;
   }
   
   
   /**
    * Deposits money into the bank account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount)
   {  
      balance += amount;
   }
   
   /**
    * Withdraws money from the bank account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount)
   {   
      balance -= amount;
   }
    
   /**
    * Adds the interest to the bank account.
    */
   public void addInterest()
   {
       balance += balance * (interest / 100);
   }
   
   /**
    * Gets the current balance of the bank account.
    * @return the current balance
    */
   public double getBalance()
   {   
      return balance;
   }
}
