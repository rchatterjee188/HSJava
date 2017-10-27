
/**
 * Word and line count. Modify WordCount.java so that reads in text from standard input 
 * and prints out the number of characters, words, and lines in the text.
 * 
 * Write a program WordCount.java that reads in text from standard input and prints out the 
 * number of words in the text. For the purpose of this exercise, a word is a sequence of non-whitespace 
 * characters that is surrounded by whitespace.
 * 
 * Space doesn't count as a character.
 * 
 * Ruhika Chatterjee
 * 12/19/16
 */
public class RC_WordCount {
    public static void main(String[] args) {
        int countWord = 0;
        int countChar = 0;
        int countLine = 0;
        while (!StdIn.isEmpty()) {
            String line = StdIn.readLine();
            if (line.length() > 0) {
                countLine ++;
                
                String [] words = line.split(" ");
                countWord += words.length;
                
                for (int i = 0; i < words.length; i++) countChar += words[i].length();
            }
        }
      
        // output
        StdOut.println("Number of lines  = " + countLine);
        StdOut.println("Number of words  = " + countWord);
        StdOut.println("Number of characters  = " + countChar);
    }
}

/*
 * Input:
 * Stars are never sleeping
 * Dead ones and the living
 * 
 * We live closer to the earth
 * Never to the heavens
 * 
 * The stars are never far away
 * Stars are out tonight
 * 
 * Output:
 * Number of lines  = 6
 * Number of words  = 29
 * Number of characters  = 121
 */