/**
 * This class shows how to initialize an array
 * How to use the printf output formatting method
 * 
 * Ms. Elia
 * 11/16/16
 */

public class InitPrintfArray 
{
   public static void main( String[] args )
   {
      // initializing the array when it is created
      int[] arrayA = { 87,56,78,99,102 };

      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
   
      // output each array element's value 
      for ( int i = 0; i < arrayA.length; i++ )
         System.out.printf( "%5d%5d\n", i, arrayA[ i ] );
   } // end main
} // end class InitPrintfArray