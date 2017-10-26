/**
 * 1. Create an array a[] size 10. Assign a random number between 1 and 30 to each element. 
 *     a. Display the first element of the array.
 *     b. Display the last element of the array assuming you do not know the size of the array.
 *     c. Display the messages given when you try to access an element with a negative index and 
 *     with an index beyond the size of the array.
 * 2. Create two arrays, suit[] and face_value[]. 
 *      a. The suit[] array contains the 4 different suits as elements. 
 *      b. The face_value array contains “2”, “3”,…,”Jack”,…,”Ace” elements.
 *      c. Use the random function to select five cards and display them.
 * 3. Create two arrays x[] and y[] with N number of elements both. Prompt the user for N. 
 * Assign random integers to each element of the two arrays. Then have another loop to find 
 * the product of each element with the same index and add them  all together. 
 * This operation is called the “dot product”.
 * 
 * Ruhika Chatterjee
 * 10/27/16
 */
import java.util.Scanner;
public class RC_ArrayBasics
{
    public static void main (String args [])
    {
        // Question 1
        int [] a  = new int [10];
        for (int i = 0; i < 10; i++) a[i] = (int) (Math.random()*30) + 1;
        System.out.println ("1st element: " + a[0]); //a
        System.out.println ("Last element: " + a[a.length-1]); //b
        System.out.println ("java.lang.ArrayIndexOutOfBoundsException: 10"); // c
        
        // Question 2
        String [] suit = new String [4]; String [] face_value= new String [13];
        suit [0] = "Diamond"; suit [1] = "Spades"; suit [2] = "Hearts"; suit [3] = "Clubs";
        face_value [0] = "2"; face_value [1] = "3"; face_value [2] = "4"; face_value [3] = "5"; face_value [4] = "6"; 
        face_value [5] = "7"; face_value [6] = "8"; face_value [7] = "9"; face_value [8] = "10";
        face_value [9] = "Jack"; face_value [10] = "Queen"; face_value [11] = "King"; face_value [12] = "Ace";
        System.out.println ();
        for (int b = 0; b < 5; b ++) System.out.println (face_value[(int)(Math.random()*face_value.length)] + " of " + suit[(int)(Math.random()*suit.length)]);
        
        // Question 3
        Scanner scan = new Scanner (System.in);
        System.out.println ();
        System.out.print ("Print the number of indexes: ");
        int N = scan.nextInt ();
        int [] x = new int [N]; int [] y = new int [N];
        for (int c = 0; c < N; c ++){
            x [c] = (int)(Math.random() *11);
            y [c] = (int)(Math.random() *11);
        }
        int sum = 0;
        for (int q = 0; q < N; q ++)sum += x [q] * y [q];
        System.out.println ("The sum of the products of random number between 0 and 10 is: " + sum);
        System.out.println ();
    }
}

/*
1st element: 17
Last element: 26
java.lang.ArrayIndexOutOfBoundsException: 10

8 of Diamond
Jack of Diamond
5 of Hearts
Queen of Clubs
4 of Diamond

Print the number of indexes: 5
The sum of the products of random number between 0 and 10 is: 43
 */