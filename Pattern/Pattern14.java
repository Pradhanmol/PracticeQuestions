import java.util.Scanner;

public class Pattern14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //for printing row
        for(int row=1; row<=10; row++){
            //for printing columun 
            int mul = num*row;
            System.out.println(num+" * "+row+"="+mul); 
        }
    }
}