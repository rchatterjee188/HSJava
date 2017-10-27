/**
 * Simulate the probability of the sum of two dices landing on the numbers 1-12 and analyze and display the results
 * 
 * Ruhika Chatterjee
 * 1/24/17
 */

import java.util.Scanner;
public class RC_Midterm
{
    public static void main (String args[])
    {
        // compute exact probability distribution for the sum of two dice
        double actualDist [] = new double [13];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) actualDist[i+j] += 1.0;
        }
        for (int k = 1; k <= 12; k++) actualDist[k] /= 36.0;
        
        Scanner scan = new Scanner (System.in);
        for (int z = 0; z < 4; z ++){ // repeat 4 times
            // simulate the sum of two dice when they are randomly rolled
            double dist [] = new double [13];
            System.out.println ("Enter N dice rolls");
            long N = scan.nextLong(); // number of dice throws
            int dice1; int dice2;
            
            boolean largestN = true;
            int largestNVal = 0;
            for (int i = 1; i <= N; i++) { 
                dice1 = (int) Math.ceil(Math.random() * 6);
                dice2 = (int) Math.ceil(Math.random() * 6);
                dist [dice1 + dice2] += 1.0;
            
                for (int b = 1; b <= 12; b++) if (Math.abs(actualDist[b] - (dist[b]/i)) >= 0.0009) largestN = false;
                if (largestN && (largestNVal == 0)) largestNVal = i;
                largestN = true;
            }
            for (int k = 1; k <= 12; k++) dist[k] /= N;
            
            
            // print the results of the test run
            System.out.printf ("%3s%15s%15s%15s", "Sum", "Empirocal", "Theoretical", "Difference");
            System.out.println ();
            for (int i = 1; i <= 12; i++) {
                System.out.printf ("%3d%15.4f%15.4f%15.4f", i, dist[i], actualDist[i], Math.abs(actualDist[i] - dist[i]));
                System.out.println ();
            }
            if (largestNVal != 0) System.out.println ("N must be at least " + largestNVal + " for the empirocal results to match the exact results (to the thousanths)");
            else System.out.println ("Need a larger N to match empirocal results to the exact results (to the thousanths)");
            System.out.println ();
        }
    }
}

/*
 * Enter N dice rolls
10
Sum      Empirocal    Theoretical     Difference
  1         0.0000         0.0000         0.0000
  2         0.0000         0.0278         0.0278
  3         0.1000         0.0556         0.0444
  4         0.0000         0.0833         0.0833
  5         0.1000         0.1111         0.0111
  6         0.2000         0.1389         0.0611
  7         0.2000         0.1667         0.0333
  8         0.1000         0.1389         0.0389
  9         0.2000         0.1111         0.0889
 10         0.1000         0.0833         0.0167
 11         0.0000         0.0556         0.0556
 12         0.0000         0.0278         0.0278
Need a larger N to match empirocal results to the exact results (to the thousanths)

Enter N dice rolls
1000
Sum      Empirocal    Theoretical     Difference
  1         0.0000         0.0000         0.0000
  2         0.0220         0.0278         0.0058
  3         0.0660         0.0556         0.0104
  4         0.0840         0.0833         0.0007
  5         0.1110         0.1111         0.0001
  6         0.1350         0.1389         0.0039
  7         0.1660         0.1667         0.0007
  8         0.1610         0.1389         0.0221
  9         0.1130         0.1111         0.0019
 10         0.0750         0.0833         0.0083
 11         0.0420         0.0556         0.0136
 12         0.0250         0.0278         0.0028
Need a larger N to match empirocal results to the exact results (to the thousanths)

Enter N dice rolls
10000
Sum      Empirocal    Theoretical     Difference
  1         0.0000         0.0000         0.0000
  2         0.0320         0.0278         0.0042
  3         0.0552         0.0556         0.0004
  4         0.0850         0.0833         0.0017
  5         0.1044         0.1111         0.0067
  6         0.1356         0.1389         0.0033
  7         0.1615         0.1667         0.0052
  8         0.1408         0.1389         0.0019
  9         0.1126         0.1111         0.0015
 10         0.0835         0.0833         0.0002
 11         0.0619         0.0556         0.0063
 12         0.0275         0.0278         0.0003
Need a larger N to match empirocal results to the exact results (to the thousanths)

Enter N dice rolls
1000000
Sum      Empirocal    Theoretical     Difference
  1         0.0000         0.0000         0.0000
  2         0.0276         0.0278         0.0002
  3         0.0555         0.0556         0.0001
  4         0.0839         0.0833         0.0006
  5         0.1107         0.1111         0.0004
  6         0.1392         0.1389         0.0003
  7         0.1670         0.1667         0.0003
  8         0.1387         0.1389         0.0002
  9         0.1108         0.1111         0.0003
 10         0.0833         0.0833         0.0000
 11         0.0554         0.0556         0.0001
 12         0.0279         0.0278         0.0001
N must be at least 56008 for the empirocal results to match the exact results (to the thousanths)
 */