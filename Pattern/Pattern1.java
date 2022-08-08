

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int row;
        int col;
        for(row=1; row<=num; row++){
            for(col=1;col<=row; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
