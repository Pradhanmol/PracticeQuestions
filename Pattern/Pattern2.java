import java.util.Scanner;

public class Pattern2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int row;
        int col;
        for(row=num; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print("* ");
        }
        System.out.println(" ");
}
}
}