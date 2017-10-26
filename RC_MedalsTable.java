
/**
 * Write a program, YI_MedalsTable.java to produce the output specified using 2D array.
 *       Country    Gold  Silver  Bronze   Total
 *        Canada       1       0       1       2
 *         China       1       1       0       2
 *       Germany       0       0       1       1
 *         Korea       1       0       0       1
 *         Japan       0       1       1       2
 *        Russia       0       1       1       2
 * United States       1       1       0       2
 * 
 * Ruhika Chatterjee
 * 11/21/16
 */
public class RC_MedalsTable
{
    public static void main (String args [])
    {
        String [] countries = {"Canada", "China", "Germany", "Korea", "Japan", "Russia", "United States"};
        String [] medals = {"Gold", "Silver", "Bronze", "Total"};
        int[][] counts = { {1,0,1}, {1,1,0}, {0,0,1}, {1,0,0}, {0,1,1}, {0,1,1}, {1,1,0} };
        
        int total;
        
        System.out.printf ("%13s", "Country");
        for (int i = 0; i < medals.length; i++) System.out.printf ("%8s", medals[i]);
        System.out.println();
        
        for (int i = 0; i < counts.length; i++){
            // Process the ith row
            System.out.printf ("%13s", countries[i]);
            total = 0;
            for (int j = 0; j < counts[i].length; j++){
                // Process the jth column in the ith row
                System.out.printf("%8d", counts[i][j]);
                total += counts[i][j];
            }
            System.out.printf("%8d", total);
            System.out.println(); // Start a new line at the end of the row
        }
    }
}

/*
 *       Country    Gold  Silver  Bronze   Total
 *        Canada       1       0       1       2
 *         China       1       1       0       2
 *       Germany       0       0       1       1
 *         Korea       1       0       0       1
 *         Japan       0       1       1       2
 *        Russia       0       1       1       2
 * United States       1       1       0       2
 */