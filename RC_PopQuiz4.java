
/**
 * Write a description of class RC_PopQuiz4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RC_PopQuiz4
{
    public static void main (String args [])
    {
        int f = 0;
        int g = 1;
        
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
