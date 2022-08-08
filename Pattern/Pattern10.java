import java.util.Scanner;

public class Pattern10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int os = num/2;
        int is = -1;
        int row =1;
        int col =1;
        for(row=1; row<=num; row++){
            
            for(col=1; col<=os; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(col=1; col<=is; col++){
                System.out.print(" ");
            }
            if(is>-1){
                System.out.print("*");
            }
            if(row<=num/2){
                os-=1;
                is+=2;
            }
            else{
                os+=1;
                is-=2;
            }
            System.out.println();
        }
    }
}