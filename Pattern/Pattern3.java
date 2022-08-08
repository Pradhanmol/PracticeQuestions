

import java.util.Scanner;

public class Pattern3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sp = num-1;
        int st = 1;
        //Approach
/*       for(int row = 1; row<=num; row++){
                System.out.println(sp +" "+" "+st);
                sp--;
                st++;
            }*/ 
            for(int row = 1; row<=num; row++){
                System.out.println(sp+"---->"+st);
                for(int col=1; col<=sp; col++){
                    System.out.print(" ");
                }
                for(int col=1; col<=st; col++){
                    System.out.print("*");
                }
                System.out.println();
                sp--;
                st++;
            }
    }
}