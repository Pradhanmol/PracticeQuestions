import java.util.Scanner;

public class PrintFibbonaci{
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt(); 
            int a = 0;
            int b = 1;
            for(int i = 0; i<num; i ++){
                System.out.println(a);
                int c = a + b;
                a= b;
                b= c;
            }
        }
    }
}