import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sp = num/2;
        int st = 1;
        for(int row=1; row<=num; row++){
            System.out.print(sp+"--->"+st);
            
            for(int col=1; col<=sp; col++){
                if(row==num/2+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int col=1; col<=st; col++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=num/2){
                st++;
                
            }else{
                st--;
            }
            
        }
    }
}
