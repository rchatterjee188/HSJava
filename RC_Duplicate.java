/**
 * Given an array of N elements with each element 1 to N, write an algorithm to determine whether there are any duplicates.
 * 
 * Ruhika Chatterjee
 * 11/14/16
 */

import java.util.Scanner;
public class RC_Duplicate
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Print N: ");
        int N = scan.nextInt ();
        
        int [] arr = new int [N];
        for (int i = 0; i < arr.length; i ++) arr[i] = (int) Math.ceil(Math.random()*N);
        for (int i = 0; i < arr.length; i ++) System.out.print (arr[i] + " ");
        System.out.println ();
        
        for (int i = 0; i < arr.length; i ++){
            for (int b = i+1; b < arr.length; b ++){
                if (arr[i] == arr[b]){
                    System.out.println ("Element: " + arr[i] + " at Indicies: " + i + " and " + b);
                }
            }
        }
    }
}

/*
 * Print N: 52
 * 49 34 25 45 15 21 2 5 30 12 3 38 34 37 39 9 10 48 12 43 31 37 14 13 26 29 32 15 51 31 11 26 37 48 18 38 40 39 28 52 45 13 51 51 38 7 14 14 46 26 49 41 
 * Element: 49 at Indicies: 0 and 50
 * Element: 34 at Indicies: 1 and 12
 * Element: 45 at Indicies: 3 and 40
 * Element: 15 at Indicies: 4 and 27
 * Element: 12 at Indicies: 9 and 18
 * Element: 38 at Indicies: 11 and 35
 * Element: 38 at Indicies: 11 and 44
 * Element: 37 at Indicies: 13 and 21
 * Element: 37 at Indicies: 13 and 32
 * Element: 39 at Indicies: 14 and 37
 * Element: 48 at Indicies: 17 and 33
 * Element: 31 at Indicies: 20 and 29
 * Element: 37 at Indicies: 21 and 32
 * Element: 14 at Indicies: 22 and 46
 * Element: 14 at Indicies: 22 and 47
 * Element: 13 at Indicies: 23 and 41
 * Element: 26 at Indicies: 24 and 31
 * Element: 26 at Indicies: 24 and 49
 * Element: 51 at Indicies: 28 and 42
 * Element: 51 at Indicies: 28 and 43
 * Element: 26 at Indicies: 31 and 49
 * Element: 38 at Indicies: 35 and 44
 * Element: 51 at Indicies: 42 and 43
 * Element: 14 at Indicies: 46 and 47
 */