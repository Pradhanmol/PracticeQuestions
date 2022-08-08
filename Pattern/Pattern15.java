import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sp = num/2;
        int st = 1;
        int val = 1;
        for(int row=1; row<=num; row++){
            System.out.print(sp+"--->"+st);
            for(int col =1; col<=sp; col++){
                System.out.print(" ");
            }
            int cval = val;
            for(int col =1; col<=st; col++){
                System.out.print(cval);
                if(col<=st/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            System.out.println();
            if(row<=num/2){
                sp--;
                st+=2;
                val++;
            }else{
                sp++;
                st-=2;
                val--;
            }
        }
    }
}
