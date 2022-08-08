import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sp = 2*num-3;
        int st = 1;
        int col = 1;
        
        for(int row=1; row<=num; row++){
            int val = 1;
            for(col =1; col<=st; col++){
                System.out.print(val);
                val++;
            }
            for(col =1; col<=sp; col++){
                System.out.print(" ");
            }
            if(row==num){
                st--;
                val--;
            }
            for(col =1; col<=st; col++){
                val--;
                System.out.print(val);
            }
            System.out.println();
            sp = sp-2;
            st++;
        }
    }
    
}
