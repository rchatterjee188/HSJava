
/**
 * PROBLEM:  Agram is a card game for 2 players, using the cards from a standard 52-card pack. 
 * The dealer deals five cards to each player. The opponent player leads any card, playing it face up in the middle of the playing area.
 * 
 * For this program the following strategy will be used to determine which card the dealer will play:
 * The dealer must play a card of the same suit if he can.  
 * He plays the lowest card in that suit that is of a higher rank than the card the opponent played. 
 * If he does not have such a card, he plays his lowest card in that suit.  
 * If he does not have a card in that suit, he plays the lowest ranking card regardless of suit. We guarantee there will be no ties.
 * 
 * INPUT:  There will be 5 lines of input.  Each line will contain the opponent’s lead card and the 5 cards held by the dealer.  
 * All cards will be represented by 2-character strings in value-suit order. AH represents the ace of hearts.  K, Q and J and T will be used for king, queen, jack and 10 respectively.  
 * Note that the ace in this game has the lowest rank.
 * OUTPUT:  For each input line print the card the dealer must play according to the strategy listed above.  
 * 
 * SAMPLE INPUT                     SAMPLE OUTPUT
 * 1.  5D, 2D, 6H, 9D, TD, 6H                   1.  9D ******************
 * 2.  TC, AC, KC, QH, JS, TD                   2.  KC ******************
 * 3.  3D, 4H, 5C, 6S, 2D, 7H                   3.  2D
 * 4.  KS, TH, QC, 7H, 9H, 3H                   4.  3H
 * 5.  AC, AD, KH, JS, KS, QS                   5.  AD 
 * 
 * Ruhika Chatterjee
 * 1/6/17
 */

import java.util.Scanner;
public class RC_Agram
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        String leadCard; String nextCard;
        String [] cards;
        char leadSuit; char nextSuit; char cardSuit;
        int leadVal; int nextVal; int cardVal;
        String values = "A123456789TJQK";
        
        for (int i = 1; i <= 5; i++) //Repeat 5 times
        {
            leadCard = ""; nextCard = "00";
            cards = new String [5];
            
            System.out.println (i + ". Print the lead card followed by your 5 cards (value-suit):");
            leadCard = scan.next();
            for (int b = 0; b < 5; b++)cards [b] = scan.next();
            
            leadSuit = leadCard.charAt(1); leadVal = values.indexOf(leadCard.charAt(0));
            for (int b = 0; b < 5; b++) //Go through each card in list
            {
                nextSuit = nextCard.charAt(1); nextVal = values.indexOf(nextCard.charAt(0));
                cardSuit = cards[b].charAt(1); cardVal = values.indexOf(cards[b].charAt(0));
                if (nextCard.equals("00")) nextCard = cards[b];
                else{
                    if (leadSuit == nextSuit && leadSuit == cardSuit)
                    {
                        if (cardVal > leadVal){
                            if (nextVal > leadVal) { if (cardVal < nextVal) nextCard = cards[b];}
                            else nextCard = cards[b];
                        }
                        else if (nextVal < leadVal) if (cardVal < nextVal) nextCard = cards[b];
                    }
                    else
                    {
                        if (leadSuit == cardSuit) nextCard = cards[b];
                        else if (nextSuit != leadSuit) if (cardVal < nextVal) nextCard = cards [b];
                    }
                }
            } 
            
            System.out.println (i + ". " + nextCard);
        }
    }
}

/*
 * 1. Print the lead card followed by your 5 cards (value-suit):
 * 5D
 * 2D
 * 6H
 * 9D
 * TD
 * 6H
 * 1. 9D
 * 2. Print the lead card followed by your 5 cards (value-suit):
 * TC
 * AC
 * KC
 * QH
 * JS
 * TD
 * 2. KC
 * 3. Print the lead card followed by your 5 cards (value-suit):
 * 3D
 * 4H
 * 5C
 * 6S
 * 2D
 * 7H
 * 3. 2D
 * 4. Print the lead card followed by your 5 cards (value-suit):
 * KS
 * TH
 * QC
 * 7H
 * 9H
 * 3H
 * 4. 3H
 * 5. Print the lead card followed by your 5 cards (value-suit):
 * AC
 * AD
 * KH
 * JS
 * KS
 * QS
 * 5. AD
 */
