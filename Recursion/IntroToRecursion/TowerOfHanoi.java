package Recursion.IntroToRecursion;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader()
        // write your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int twr1 = in.nextInt(); //act as source 
        int twr2 = in.nextInt(); //act as destination
        int twr3 = in.nextInt(); //act as helper 
        TowerOfHanoi.toh(num, twr1, twr2, twr3);
    }

    public static void toh(int num, int twr1, int twr2, int twr3){
         if(num==0){
            return;
        }
        // use euler tree for visulazing the o/p
        TowerOfHanoi.toh(num-1, twr1, twr3, twr2); // it is use for the left call 
        System.out.println(num +"["+twr1+" -> "+twr2+"]"); // print the inner value 
        TowerOfHanoi.toh(num-1, twr3, twr2, twr1); // it is used for the right call 
    }
}
