/**
 * Constructs a bank account, deposits $1000, withdraws $500, withdraws another $400, and then prints the remaining balance.
 * 
 * Ruhika Chatterjee
 * 2/13/17
*/
public class RC_BankAccountTester
{
   // Tests the methods of the BankAccount class.
   // @param args not used
   
   public static void main(String[] args)
   {
      // create new object of BankAccount called account. account is an instance of BankAccount
      RC_BankAccount account = new RC_BankAccount();
      
      account.deposit(1000); // deposit is changing the instance field balance
      account.withdraw(500); // withdraw is changing the instance field balance
      account.withdraw(400);
      System.out.println(account.getBalance()); // getBalance is accessing the value of balance
   }
}

// Output: 100.0