import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Corrected to 'System.in'
       // String input = sc.next();  // Corrected spelling of 'input'
        // System.out.println(input);
        
        String name = scan.nextLine();
        System.out.println(name); 

        // for integer input
        int number = scan.nextInt();
        System.out.println(number);

        float price = scan.nextFloat();
        System.out.println(price);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = (x + y);
        System.out.println(sum);
    
    
    
    
    }
}
