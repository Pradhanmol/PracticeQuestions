import java.util.Scanner;
//The Curious Case Of Benjamin Bulbs
/*Problem - You are given n number of bulbs. They are all switched off. 
A weird fluctuation in voltage hits the circuit n times. 
In the 1st fluctuation, all bulbs are toggled, 
in the 2nd fluctuation every 2nd bulb is toggled, 
in the 3rd fluctuation, every 3rd bulb is toggled, and so on. 
You've to find which bulbs will be switched on after n fluctuations.
Take as input a number n, representing the number of bulbs.
Print all the bulbs that will be on after the nth fluctuation in voltage */
//===========================================================//
/* Solution - Let us start off with an example of 20 given bulbs. 
Every voltage change will change the state of the bulb, 
either from on or off, or off from on.
Now according to the given problem, after the first fluctuation, 
all the bulbs will be turned on.In the second fluctuation, 
every second bulb will be affected.
For illustration purposes, let us denote the effect of fluctuation with a tick against the 20 given bulbs.
On the first fluctuation, all the bulbs' states will change (on from off).
On the second fluctuation, every 2nd bulb, that is, 2 4 6 8 10 12 14 16 18 20 states will be changed (off from on).
On the third fluctuation, every third bulb will be affected by the voltage, 
that is, 3 6 9 12 15 18 (the bulbs that are on will turn off and bulbs that were off will turn on).
Carrying on this process for 20 fluctuations and maintaining the pattern of ticking off, we end up with the following results.
 */
public class BenjaminBulbs{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i =1; i*i <=num;i++){
            System.out.println(i*i);
        }
    }
}