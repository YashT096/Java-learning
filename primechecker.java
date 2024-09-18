import java.util.Scanner;

public class primechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if( n == 2){
            System.out.println("N is prime ");
        }
        else{
            boolean isPrime = true;

            for(int i=2; i<=Math.sqrt(n);i++){
                if(n% i==0){ // ni smultiple of i (i is not euqal to 1 or itself)
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is Prime number ");
            }
            else{
                System.out.println("n is not Prime Number");
            }
        }
        
    }
}
