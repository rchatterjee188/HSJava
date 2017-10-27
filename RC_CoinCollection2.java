
/**
 * Keep a collection of coins of different values using HasMaps.
 * 
 * Ruhika Chatterjee
 * 5/9/17
 */

import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
public class RC_CoinCollection2
{
    public static void main (String args [])
    {
        // Create a HashMap that will store the coin with the key of the name of the string
        HashMap<String, Coin> purse = new HashMap<String, Coin> (5);
        
        // Add 5 coins to the purse HashMap
        purse.put ("Dolar", new Coin (1.00, "Dolar"));
        purse.put ("Dime", new Coin (0.10, "Dime"));
        purse.put ("Nickel", new Coin (0.05, "Nickel"));
        purse.put ("Zen", new Coin (2.00, "Zen"));
        purse.put ("Euro", new Coin (1.09, "Euro"));
        
        // Create an ArrayLIst of all the names of the coins (the keys)
        Set<String> coinKeys = purse.keySet();
        ArrayList<String> coinNames = new ArrayList<>();
        for (String coin : coinKeys){
            coinNames.add(coin);
        }
        
        // Print out the names and values of all the coins in the purse
        for (String coin : coinNames){
            System.out.println (coin + " " + purse.get(coin).getValue());
        }
        
        // Choose a random coin from the purse, and print the name and value
        String randomCoin = coinNames.get((int) Math.round(Math.random () * (coinNames.size()-1)));
        System.out.println ("My favorite coin is " + purse.get(randomCoin).getValue() + " " + purse.get(randomCoin).getName());
    }
}

/*
 * Dolar 1.0
 * Nickel 0.05
 * Zen 2.0
 * Euro 1.09
 * Dime 0.1
 * My favorite coin is 0.05 Nickel
 */