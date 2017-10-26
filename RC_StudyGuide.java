
/**
 * A. Create arrays and initialize them with a loop.
 * B. Initialize an array when created.
 * C1. Find the number of elements in an array.
 * C2. Check an array’s bounds.
 * D. Swapping elements of an array – permutations (sampling without replacement)
 * E. Given an array of N elements, write the code to shuffle them using the random feature.
 * F. Find the max - min of the elements.
 * G. Reverse the elements.
 * H. Find the average of the elements.
 * I. Print each element.
 * J. Sieve of Erasthostenes http://en.wikipedia.org/wiki/Sieve_of_Eratost...
 * K. Arrays as frequency or counters.
 * L. What types must be used as indices for arrays?
 * 
 * Ruhika Chatterjee
 * 11/3/16
 */

import java.util.Scanner;
public class RC_StudyGuide
{
    public static void main (String args [])
    {
        int [] arrayA = new int [10];
        for (int i = 0; i < arrayA.length; i++) arrayA[i] = i * 2;
        for (int i = 0; i < arrayA.length; i++)  System.out.print (arrayA[i] + " ");
        System.out.println ();
        // 0 2 4 6 8 10 12 14 16 18 
        
        int [] arrayB = {0,2,4,6,8,10,12,14,16,18};
        for (int i = 0; i < arrayB.length; i++)  System.out.print (arrayB[i] + " ");
        System.out.println ();
        // 0 2 4 6 8 10 12 14 16 18 
        
        int [] arrayC = new int [10];
        
        int numOfElements = arrayC.length;
        System.out.println (numOfElements);
        // 10
        
        int arrayUpperBound = arrayC.length - 1;
        System.out.println (arrayUpperBound);
        //9
        
        int [] arrayD = new int [10];
        for (int i = 0; i < arrayD.length; i++) arrayD[i] = i + 1;
        int h = arrayD[3];
        arrayD[3] = arrayD[4];
        arrayD[4] = h;
        for (int i = 0; i < arrayD.length; i++)  System.out.print (arrayD[i] + " ");
        System.out.println ();
        // 1 2 3 5 4 6 7 8 9 10 
        
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt ();
        int [] arrayE = new int [N];
        for (int i = 0; i < arrayE.length; i++) arrayE[i] = i + 10;
        for (int i = 0; i < arrayE.length; i++){
            int i1 = (int)(Math.random() * arrayE.length);
            int i2 = (int)(Math.random() * arrayE.length);
            int s = arrayE[i1];
            arrayE [i1] = arrayE [i2];
            arrayE [i2] = s;
        }
        for (int i = 0; i < arrayE.length; i++)  System.out.print (arrayE[i] + " ");
        System.out.println ();
        // Input: 42
        // 34 39 43 30 18 24 16 17 14 22 11 21 19 15 10 25 31 41 42 44 23 36 32 29 20 35 45 37 38 28 40 12 49 46 13 33 27 47 26 48 50 51 
        
        int [] arrayF = new int [10];
        for (int i = 0; i < arrayF.length; i++) arrayF[i] = (int)(Math.random() * 21);
        int max = arrayF[0];
        int min = arrayF[0];
        for (int i = 1; i < arrayF.length; i++) {
            if (arrayF [i] > max) max = arrayF[i];
            if (arrayF [i] < min) min = arrayF[i];
        }
        System.out.println ("Max: " + max + " Min: " + min);
        // Max: 20 Min: 2
        
        int [] arrayG = {0,3,6,9,12,15,18,21,24};
        for (int i = 0; i < arrayG.length / 2; i++) {
            int t = arrayG[i];
            arrayG[i] = arrayG[arrayG.length-1-i];
            arrayG[arrayG.length-1-i] = t;
        }
        for (int i = 0; i < arrayG.length; i++)  System.out.print (arrayG[i] + " ");
        System.out.println ();
        //24 21 18 15 12 9 6 3 0 
        
        int [] arrayH = {100, 73, 89, 97, 54, 78, 82, 79, 91, 90};
        int sum = 0;
        for (int i = 0; i < arrayH.length; i ++) sum += arrayH[i];
        double average = sum / ((double) arrayH.length);
        System.out.println ("Average: " + average);
        // Average: 83.3
        
        int [] arrayI = new int [10];
        for (int i = 0; i < arrayI.length; i++) arrayI[i] = (int)(Math.random() * 10 + 1);
        for (int i = 0; i < arrayI.length; i++)  System.out.print (arrayI[i] + " ");
        System.out.println ();
        // 8 6 5 3 2 1 2 3 5 10 
        
        int n = 100;
        boolean [] arrayJ = new boolean [n-1];
        for (int i = 0; i < arrayJ.length; i++) arrayJ[i] = true;
        for (int i = 0; i < Math.sqrt(n); i++){
            if (arrayJ[i]){
                for (int j = (int) Math.pow(i+2,2); j < n-2; j += i+2) {
                    arrayJ[j] = false;
                }
            }
        }
        for (int i = 0; i < n-4; i++)   if (arrayJ[i+2]) System.out.print (i + 2 + " ");
        System.out.println ();
        //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
        
        int [] arrayK = new int [20];
        for (int i = 0; i < arrayK.length; i ++) arrayK[i] = i + 1;
        sum = 0;
        for (int i = 0; i < arrayK.length; i ++) sum += arrayK[i];
        System.out.println (sum);
        // 210
        
        // Integers must be used to reference indicies.
    }
}
