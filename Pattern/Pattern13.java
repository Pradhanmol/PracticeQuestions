import java.util.Scanner;
public class Pattern13{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int row=0; row<num; row++){
            int icj=1;
            for(int col=0; col<=row; col++){
                System.out.print(icj+"  ");
                int icjp1 = (icj * (row - col)) / (col + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}