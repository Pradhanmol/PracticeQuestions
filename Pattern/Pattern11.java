import java.util.Scanner;
public class Pattern11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum =0;
        for(int row = 1;row<=num; row++){
            for(int col =1; col<=row; col++){
                sum =1+sum;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        }
}