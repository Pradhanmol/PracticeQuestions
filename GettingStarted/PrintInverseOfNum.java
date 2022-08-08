import java.util.Scanner;

public class PrintInverseOfNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int inv =0;
        int op = 1;
            while(num!=0){
                int od = num%10;
                int id = op;
                int ip = od;
                System.out.println(id +"--->"+ip);
                // make changes to invert using ip & id
                inv = inv + id * (int)Math.pow(10, ip-1);
                num = num/10;
                op++;
            }
            System.out.println(inv);

    }
}