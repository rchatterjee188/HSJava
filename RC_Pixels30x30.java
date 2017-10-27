
/**
 * Display the R,G,B values of the upper right corner of 30x30 pixels from the image.
 * 
 * Ruhika Chatterjee
 * 3/27/17
 */

import java.awt.Color;
public class RC_Pixels30x30
{
    public static void main (String args [])
    {
        RC_Picture candyLand = new RC_Picture ("Candy-Land.jpg");
        Color color;
        
        System.out.printf ("%6s%6s%6s", "R", "G", "B");
        System.out.println ();
        for (int i = 0; i < 30; i ++){
            for (int j = 0; j < 30; j ++){
                color = candyLand.get (i, j);
                System.out.printf ("%6d%6d%6d", color.getRed(), color.getGreen(), color.getBlue());
                System.out.println ();
            }
        }
    }
}
/* Last values displayed after printing
     R     G     B
   236   248    44
   184   230    79
   101   177    69
    75   173   100
    65   177   121
    66   181   124
    69   184   127
    71   184   130
    74   182   130
    78   178   128
    79   175   127
    79   175   127
    75   174   127
    67   175   125
    61   175   124
    60   177   125
    64   178   127
   249   244     4
   251   242     3
   255   240     1
   255   239     0
   253   243     0
   253   245     0
   253   245     0
   253   245     0
   250   239     7
   254   241    12
   255   239     5
   255   239     3
   252   240     8
   239   248    43
   185   231    73
   103   177    64
    77   173    99
    67   174   120
    66   178   120
    68   180   122
    73   180   124
    81   181   127
    88   180   129
    92   180   130
    91   179   129
    83   177   125
    73   176   123
    63   174   121
    61   174   122
    63   176   124 
 */