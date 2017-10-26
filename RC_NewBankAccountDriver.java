
/**
 * Tests the RC_NewBankAccount class.
 * Write enough code to invoke (call) all the methods.
 * 
 * Ruhika Chatterjee
 * 3/6/17
 */
public class RC_NewBankAccountDriver
{
    public static void main (String args [])
    {
        RC_NewBankAccount acc = new RC_NewBankAccount (-100.0);
        System.out.println (acc.getBalance());
        
        RC_NewBankAccount account = new RC_NewBankAccount (100);
        System.out.println (account.getBalance());
        
        account.deposit (-20);
        System.out.println (account.getBalance());
        
        account.deposit (30);
        System.out.println (account.getBalance());
        
        account.withdraw (-10);
        System.out.println (account.getBalance());
        
        account.withdraw (500);
        System.out.println (account.getBalance());
        
        account.withdraw (10);
        System.out.println (account.getBalance());
    }
}

/*
 * 0.0
 * 100.0
 * 100.0
 * 130.0
 * 130.0
 * 130.0
 * 120.0
 */