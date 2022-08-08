

import java.util.Scanner;

public class Pattern4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int st = num;
        int sp = 0;
        for(int row =1; row<=num; row++){
            System.out.println(sp+"---->"+st);
                for(int col=1; col<=sp; col++){
                    System.out.print(" ");
                }
                for(int col=1; col<=st; col++){
                    System.out.print("*");
                }
                System.out.println();
            st--;
            sp++;
        }
    }
}