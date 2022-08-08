import java.util.Scanner;

public class PrintPrime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
        //taking range of input which user want
        for(int i=low; i<=high; i++){
            int count = 0;
            //try to divide n & increase count
            // here we check if no. is divide till their own sqrt then it is prime otherwise itsn't prime
            for(int div=2; div * div <= i; div++){
            if(i%div==0){
                count++;
                break;
            }
        }
        //check count value if it is 0 then no. is prime other wise it is not prime 
        if(count==0){
            System.out.println("Prime"+i);
        }
        else{
            System.out.println("Not_prime"+i);
    }
    }
    }
}