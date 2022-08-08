import java.util.Scanner;


public class Pattern20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int row=1; row<=num; row++){
            for(int col=1; col<=num; col++){
                if(row==1||row==2){
                    if(col==1||col==num){
                        System.out.println("*");
                    }
                }
                 else if (row==num/2+1){
                    if(col==1||col==num/2+1||col==num){
                        System.out.println("*");
                    }else if(row<num){
                        if(col==1||col<num/2||col==num){
                            System.out.println("*");
                        }
                    }else{
                        if(col==1||col==num){
                            System.out.println("*");
                        }
                    }
                }
            }
        }
    }
}
