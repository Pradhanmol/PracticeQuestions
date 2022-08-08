import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<=n; i++){
            int numEnter = in.nextInt();
            int count =0;
            // not optimize for loop 
          /*  for(int div=1; div <= num_enter; div++){
                if(n%div==0){
                    count++;
                }*/
                // optimize for loop
                for(int div=2; div * div <= numEnter; div++){
                    if(n%div==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not_Prime");
            }
        }
}
}