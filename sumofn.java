import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        int k =sc.nextInt();
        int sum = 0;
        while( i <= k){
          sum += i;
          
          i++;
          sc.close();
        }
        System.out.println("The Sum is :"+ sum);
    }
}
