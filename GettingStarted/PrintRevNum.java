import java.util.Scanner;

public class PrintRevNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>0){
            int dig = n%10;
            n = n/10;
            System.out.println(dig);
        }
    }
}