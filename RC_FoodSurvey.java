/**
* Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the school 
* cafeteria, with 1 being “awful” and 5 being “excellent.” Randomly assign 20 responses to an 
* integer array and determine the frequency of each rating.
* 
* Display the rating and their frequency in two well formatted columns.
* 
* Ruhika Chatterjee
* 11/18/16
*/
public class RC_FoodSurvey
{
    public static void main (String args [])
    {
        int [] responses = new int [20];
        for (int i = 0; i < responses.length; i++) responses [i] = (int) (Math.random()*5+1);
        
        int [] frequency = new int[6];
        for (int i = 0; i < responses.length; i++) frequency[responses[i]]++;
        
        for(int stars = 1; stars < frequency.length; stars++){
            System.out.printf(stars + " ");
            for (int i = 0; i < frequency[stars]; i++) System.out.printf("%2s", "*");
            System.out.println();
        }
    }
}

/*
* 1 * * * * *
* 2 * * * * *
* 3 * * *
* 4 * * * *
* 5 * * *
*/