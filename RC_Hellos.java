
/**
 * Takes the number of lines to print as a command-line argument.
 * Assumption: argument is less than 1000.
 * 
 * Ruhika Chatterjee
 * 9/26/16
 */
public class RC_Hellos
{
    public static void main (String [] args)
    {
        int times = Integer.parseInt (args[0]);
        
        for (int i = 0; i < times; i ++)
        {
            if (((i+1)%10 == 1 || (i+1)%100 == 1) && i/10!=1) System.out.print(i+1 + "st ");
            else
            {
                if (((i+1)%10 == 2 || (i+1)%100 == 2) && i/10!=1) System.out.print(i+1 + "nd ");
                else
                {
                    if (((i+1)%10 == 3 || (i+1)%100 == 3) && i/10!=1) System.out.print(i+1 + "rd ");
                    else System.out.print(i+1 + "th ");
                }
            }
    
        System.out.println("Hello World");
    }
}    
}

/*
 * Sample Input: {"30"}
 * Sample Output:
// 1st Hello World
// 2nd Hello World
// 3rd Hello World
// 4th Hello World
// 5th Hello World
// 6th Hello World
// 7th Hello World
// 8th Hello World
// 9th Hello World
// 10th Hello World
// 11th Hello World
// 12th Hello World
// 13th Hello World
// 14th Hello World
// 15th Hello World
// 16th Hello World
// 17th Hello World
// 18th Hello World
// 19th Hello World
// 20th Hello World
// 21st Hello World
// 22nd Hello World
// 23rd Hello World
// 24th Hello World
// 25th Hello World
// 26th Hello World
// 27th Hello World
// 28th Hello World
// 29th Hello World
// 30th Hello World
 */