import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sp = 0;
        int st = num;
        for(int row=1; row<=num; row++){
            
            for(int col=1; col<=sp; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=st; col++){
                if(row>1&&row<=num/2&&col>1&&col<st){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
            if(row<=num/2){
                st-=2;
                sp+=1;
            }else{
                st+=2;
                sp-=1;
            }
        }
    }
}
