
/**
 * Type conversion. We often find ourselves converting data from one type to another using one of the following approaches.
Explicit type conversion. Call methods such as Math.round(), Integer.parseInt(), and Double.parseDouble().
Automatic type conversion. For primitive numeric types, the system automatically performs type conversion when we use a value whose type has a larger range of values than expected.
Explicit casts. Java also has some built-in type conversion methods for primitive types that you can use when you are aware that you might lose information, but you have to make your intention using something called a cast. RandomInt.java reads an integer command-line argument n and prints a "random" integer between 0 and n−1.
Automatic conversions for strings. The built-in type String obeys special rules. One of these special rules is that you can easily convert any type of data to a String by using the + operator.
 * 
 * Ruhika Chatterjee
 * 9/16/16
 */
public class RC_TypeConversions
{
    public static void main (String args [])
    {
        /*
         * Explicit type conversion
         */
        float num1 = 34.5765f;
        int num2 = Math.round(num1);
        System.out.println (num2 + " is an integer");
        
        String literalInt = "98";
        int num3 = Integer.parseInt(literalInt);
        System.out.println (num3 + " is an integer");
        
        String literalDouble = "567.89999";
        double num4 = Double.parseDouble(literalDouble);
        System.out.println (num4 + " is a double");
        
        
        /*
         * Automatic Type Conversion
         */
        long bigNum = 345678924;
        System.out.println (bigNum + " is a long integer");
        
        /*
         * Explicit cast
         */
        int integralPart = (int)71.67; // (int) is  casting operator
        System.out.println (integralPart + " is the integral part of 71.67");
        
        /*
         * Automatic conversions for strings
         */
        System.out.println (2 + 3 + " There is no automatic conversion here.");
        System.out.println ("There is automatic conversion here " + 2 + 3);
    }
}
/*
35 is an integer
98 is an integer
567.89999 is a double
345678924 is a long integer
71 is the integral part of 71.67
5 There is no automatic conversion here.
There is automatic conversion here 23
 */