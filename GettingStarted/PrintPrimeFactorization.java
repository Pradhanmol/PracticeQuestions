import java.util.Scanner;

public class PrintPrimeFactorization{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int div = 2; div *div <= num; div++){
            while(num%div == 0){
                num = num/div;
                System.out.print(div+" ");
            }
        }
        //this is for last digit which not divisible any no. expect one so that num is also prime factor of that no.
        if(num!=1){
            System.out.println(num);
        }
    }
}