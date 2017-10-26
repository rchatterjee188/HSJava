
/**
 * Enhance the BankAccount class by adding preconditions
 * For the constructor: require the amount parameter to be at least zero
 * For the deposit method: require the amount parameter to be at least zero
 * For the withdraw method: the amount to be a value between 0 and the current balance
 * 
 * Ruhika Chatterjee
 * 3/6/17
 */
public class RC_NewBankAccount
{
    private double balance;
   
   /**
    * Constructs a default bank account with a zero balance.
    */
   public RC_NewBankAccount()
   {   
      balance = 0;
   }
   
   /**
    * Constructs a BankAccount object with a given balance.
    * @param initialBalance the initial balance
    */
   public RC_NewBankAccount(double initialBalance)
   {   
      if (initialBalance >= 0) {balance = initialBalance;}
      else {balance = 0;}
   }
   
   
   /**
    * Deposits money into the bank account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount)
   {  
      if (amount >= 0) {balance = balance + amount;}
   }
    
   /**
    * Withdraws money from the bank account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount)
   {   
      if (amount >= 0 && amount <= balance) {balance = balance - amount;}
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
