
/**
 * This is a collection of coins using Coin class
 * 
 * Ruhika Chatterjee
 * 5/3/17
 */

import java.util.ArrayList;
public class RC_CoinCollectionTest
{
    public static void main (String args [])
    {
        Coin myCoin1 = new Coin (1.00, "Dolar");
        Coin myCoin2 = new Coin (0.10, "Dime");
        Coin myCoin3 = new Coin (0.05, "Nickel");
        Coin myCoin4 = new Coin (2.00, "Zen");
        Coin myCoin5= new Coin (1.09, "Euro");
        
        ArrayList<Coin> purse = new ArrayList<Coin>();
        purse.add(myCoin1);
        purse.add(myCoin2);
        purse.add(myCoin3);
        purse.add(myCoin4);
        purse.add(myCoin5);
        
        for (Coin aCoin : purse)
        {
            System.out.println (aCoin.getValue() + " " + aCoin.getName());
        }
        
        int randomCoin = (int) Math.round(Math.random () * (purse.size()-1));
        System.out.println ("My favorite coin is " + purse.get(randomCoin).getValue() + " " + purse.get(randomCoin).getName());
    }
}

/*
 * 1.0 Dolar
 * 0.1 Dime
 * 0.05 Nickel
 * 2.0 Zen
 * 1.09 Euro
 * My favorite coin is 0.05 Nickel
 */