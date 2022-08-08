import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int row=1; row<=num; row++){
            for(int col=1; col<=num;col++){
                if(row==1){///first component
                    if(col<=num/2+1||col==num){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                else if(row<=num/2){//Second component
                    if(col==num/2+1||col==num){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                else if(row==num/2+1){//Third component
                    System.out.print("*");
                }
                else if(row<num){//fourth component
                    if(col==1||col==num/2+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                else { //fifth component
                    if(col==1||col>=num/2+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
