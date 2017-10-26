
/**
 * Create an array of 100 random integers between the values of 1 and 1000 and print them separated by 3 spaces.
 * Note: Use printf to keep all your numbers tab properly.
 * 
 * Ruhika Chatterjee
 * 10/28/16
 */
public class RC_PrintArray
{
    public static void main (String srgs [])
    {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i ++) arr [i] = (int) (Math.random() * 1000) + 1;
        for (int i = 0; i < arr.length; i ++) {
            System.out.printf ("%6d", arr[i]);
        }
    }
}

/*
 *    471   612   157   510   547   918    87   162   925   387   354   401   417   987   329   548   332   848   162   363   552   572   228   804   482   147   203   351   621   877   862   588    46   445    45   806   439   873   820   958   433   939   788   424   938   284   627   700   820   316   438   294   755   783   191   828   338   757   581   600   567   661   907   600   628   883   155   337   495   452   350   600   250   260   348   716   185   288   703   705   654   354   912   212   421   979   343    15   696    46   428   445   355    75   225    40   923   111   301   329
 */