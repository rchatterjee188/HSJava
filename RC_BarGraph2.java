/**
* Create a bar graph with asterisks. The array's values are the raw data.
* Uses a frequency counter to print the bar graph without if statements.
* 
* Ruhika Chatterjee
* 11/17/16
*/
public class RC_BarGraph2
{
    public static void main (String args[])
    {
        int [] dataSet = {67, 89, 55, 100, 95, 93, 57, 19, 88, 87, 86, 91, 90};
        System.out.println( "Data distribution:" );
        
        int [] ranges = new int [11];
        for (int i = 0; i < dataSet.length; i ++)ranges[dataSet[i]/10] ++;
        
        for ( int i = 0; i <= 10; i++ ) 
        {
            if ( i == 10 ) System.out.printf( "%5d: ", 100 );
            else System.out.printf( "%02d-%02d: ",i * 10, i * 10 + 9 );
            
            for (int stars = 0; stars < ranges[ i ]; stars++ ){
                System.out.print( "*" );
            }
            System.out.println(); // start a new line of output
        }
    }
}

/*
* Data distribution:
* 00-09: 
* 10-19: *
* 20-29: 
* 30-39: 
* 40-49: 
* 50-59: **
* 60-69: *
* 70-79: 
* 80-89: ****
* 90-99: ****
* 100: *
*/