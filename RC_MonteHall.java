/**
 * Test the following intuition by simulation. Take an integer command-line argument n, play Let's Make a Deal n 
 * times using each of the two strategies (switch or don't switch) and print the chance of success for each strategy.
 * 
 * In the game show Let's Make a Deal, a contestant is presented with three doors. Behind one door is a valuable prize, 
 * behind the other two are gag gifts. After the contestant chooses a door, the host opens up one of the other two doors 
 * (never revealing the prize). The contestant is then given the opportunity to switch to the other unopened door. 
 * Should the contestant do so? Intuitively, it might seem that the contestant's initial choice door and the other 
 * unopened door are equally likely to contain the prize, so there would be no incentive to switch.
 * 
 * Ruhika Chatterjee
 * 9/26/16
 */

import java.util.Scanner;
public class RC_MonteHall
{
    public static void main (String args [])
    {
        int n = Integer.parseInt (args [0]);
        Scanner scan = new Scanner (System.in);
        
        int sameRight = 0;
        int switchRight = 0;
        
        for (int i = 0; i < n; i ++){
            int door = (int) Math.ceil (Math.random()*3);
            
            System.out.print ("Choose a door: ");
            int choice = (int) scan.nextDouble ();
            System.out.println("Door: " + door);
            
            int gag = 0;
            {
                if ((door==1 && choice==2)||(door==2 && choice==1)) gag = 3;
                if ((door==2 && choice==3)||(door==3 && choice==2)) gag = 1;
                if ((door==3 && choice==1)||(door==1 && choice==3)) gag = 2;
                if (door==choice){
                    if (door != 1) gag = 1;
                    else gag = 2;
                }
                System.out.println ("Door " + gag + " is a gag.");
            }
            {
                System.out.print ("If the choice is the same...");
                if (door == choice){
                    System.out.println ("YOU CHOSE THE RIGHT DOOR!!");
                    sameRight ++;
                }
                else System.out.println("Sorry, you chose the wrong door");
            }
            {
                System.out.print ("If the choice is changed...");
                int originalChoice = choice;
                if ((originalChoice==1 && gag==2)||(originalChoice==2 && gag==1)) choice = 3;
                if ((originalChoice==2 && gag==3)||(originalChoice==3 && gag==2)) choice = 1;
                if ((originalChoice==3 && gag==1)||(originalChoice==1 && gag==3)) choice = 2;
                if (door == choice){
                    System.out.println ("YOU CHOSE THE RIGHT DOOR!!");
                    switchRight ++;
                }
                else System.out.println("Sorry, you chose the wrong door");
            }
            System.out.println();
        }
        {
            System.out.println ("When kept the same, the chance of success is: "+sameRight+"/"+n);
            System.out.println ("When changed, the chance of success is: "+switchRight+"/"+n);
        }
    }
}

/*
 *Sample Input: {"5"}
 *Sample Output:
 *Choose a door: 1
Door: 2
Door 3 is a gag.
If the choice is the same...Sorry, you chose the wrong door
If the choice is changed...YOU CHOSE THE RIGHT DOOR!!

Choose a door: 2
Door: 3
Door 1 is a gag.
If the choice is the same...Sorry, you chose the wrong door
If the choice is changed...YOU CHOSE THE RIGHT DOOR!!

Choose a door: 3
Door: 1
Door 2 is a gag.
If the choice is the same...Sorry, you chose the wrong door
If the choice is changed...YOU CHOSE THE RIGHT DOOR!!

Choose a door: 1
Door: 3
Door 2 is a gag.
If the choice is the same...Sorry, you chose the wrong door
If the choice is changed...YOU CHOSE THE RIGHT DOOR!!

Choose a door: 2
Door: 1
Door 3 is a gag.
If the choice is the same...Sorry, you chose the wrong door
If the choice is changed...YOU CHOSE THE RIGHT DOOR!!

When kept the same, the chance of success is: 0/5
When changed, the chance of success is: 5/5
 */
