import java.util.Scanner;

public class Pattern8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int row =1; row<=num; row++){
            /* for(int col=1; col<=sp; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=st; col++){
                System.out.print("*");
            }
            sp++;*/
            for(int col=1; col<=num; col++){
                
                if((col+row)==(num+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
}
}