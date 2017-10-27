/**
 * Modify Gambler to take an extra command line parameter that specifies the number of
 * bets the gambler is willing to make, so that there are three possible ways for the game to end:
 * the gambler wins, loses, or runs out of time.
 * Add to the output to give the expected amount of money the gambler will have when the game ends..
 * 
 * Ruhika Chatterjee
 * 10/7/16
 */
public class RC_GamblerModified
{
    public static void main(String[] args)
    {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        double trials = Integer.parseInt(args[2]);    // number of trials to perform
        int willBet = Integer.parseInt (args[3]);  // number of bets in one trial

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won
        double sum = 0;         // total money after trials

        // repeat trials times
        for (int t = 0; t < trials; t++) {
            // do one gambler's ruin simulation
            int cash = stake;
            int tries = 0;
            while (cash > 0 && cash < goal && tries < willBet) {
                bets++;
                tries++;
                if (Math.random() > 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
            sum = sum + cash;
        }
        
        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("% of wins " + 100.0 * wins / trials);
        System.out.println("Expected amt $ = " + (sum/trials));
    }
}

/*
 * Sample Input: {"10","20","1000","200"}
 * Sample Output:
452 wins of 1000.0
% of wins 45.2
Expected amt $ = 10.054
 */
