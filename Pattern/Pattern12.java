import java.util.Scanner;
public class Pattern12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a=0;
        int b=1;
        for(int row=1; row<=num; row++){
            for(int col=1; col<=row; col++){
                int fib = a+b;
                a = b;
                b = fib;
                System.out.print(fib+" ");
            }
            System.out.println();
        }
    }
}