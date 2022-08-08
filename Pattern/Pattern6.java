import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sp = 1;
        int st = (num/2)+1;
        for(int row=1; row<=num; row++){
            System.out.println(st+"---->"+sp+"--->"+st);
            for(int col=1; col<=st; col++){
                System.out.print("*");
            }
            for(int col=1; col<=sp; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=st; col++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=num/2){
                st = st-1;
                sp = sp+2;
            }else{
                st = st+1;
                sp = sp-2;
            }


        }

    }
}