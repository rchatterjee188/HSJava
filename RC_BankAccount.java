
/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * 
 * Add a method
 *   void addInterest(double rate)
 * to the BankAccount class that adds interest at the given rate. For example, after the statemetns
 * 
 * 
 * Is an ADT- abstract data type
 * Instance field is balance with type "double"- attribute for RC_BankAccount
 * 
 * Ruhika Chatterjee
 * 2/13/17
*/
public class RC_BankAccount
{  
   private double balance;
   
   // Constructs a bank account with a zero balance. Called default constructor because doesn't require parameters.
   // Operator "new" calls constructor when object created- also called "instanciation (comes from instance)
   
   public RC_BankAccount()
   {   
      balance = 0;
   }
   
   // Constructs a BankAccount object with a given balance.
   // @param initialBalance the initial balance
   
   public RC_BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }
   
   
   // Here down are behaviors (aka methods- getter or setter) for BankAccount ADT
   // deposit - mutator/setter method
   // withdraw - mutator/setter method
   // addInterest - mutator/setter method
   // getBalance - accessor/getter method
   
   
   // Deposits money into the bank account.
   // @param amount the amount to deposit
   
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }
   
   // Withdraws money from the bank account.
   // @param amount the amount to withdraw
   
   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }
   
   // Adds the interest to the bank account.
   // @param rate of interest
   
   public void addInterest(double rate)
   {
       balance = balance + (balance * (rate / 100));
   }
   
   // Gets the current balance of the bank account.
   // @return the current balance
   
   public double getBalance()
   {   
      return balance;
   }
}