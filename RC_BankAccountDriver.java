/**
 * BankAccount momsSavings = new BankAccount(1000);
 * momsSavings.addInterest(10); // 10% interest
 * the balance in momsSavings is $1,100.
 * 
 * Ruhika Chatterjee
 * 2/13/17
*/
public class RC_BankAccountDriver
{
   // Tests the methods of the BankAccount class.
   // @param args not used
   
   public static void main(String[] args)
   {
      // create new object of BankAccount called account. account is an instance of BankAccount
      RC_BankAccount momsSavings = new RC_BankAccount();
      
      momsSavings.deposit(1000); // deposit is changing the instance field balance
      momsSavings.addInterest(10); // addInterest is changing the instance field balance
      System.out.println(momsSavings.getBalance()); // getBalance is accessing the value of balance
   }
}

// Output: 1100.0
