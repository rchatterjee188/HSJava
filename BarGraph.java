
/**
 * Bar graph printing program.
 * 
 * Mrs.Elia
 * 11/17/16
 */

public class BarGraph 
{
   public static void main( String[] args )
   {
      int[] arrayA = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

      System.out.println( "Grade distribution:" ); 

      // for each array element, output a bar of the chart
      for ( int i = 0; i < arrayA.length; i++ ) 
      {
         // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
         if ( i == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               i * 10, i * 10 + 9  ); 
 
         // print bar of asterisks
         for ( int stars = 0; stars < arrayA[ i ]; stars++ )
            System.out.print( "*" );

         System.out.println(); // start a new line of output
      } // end outer for
   } // end main
} // end class BarGraph

/*
 * Grade distribution:
00-09:
10-19:
20-29:
30-39:
40-49:
50-59:
60-69: *
70-79: **
80-89: ****
90-99: **
100: *
}
 */
