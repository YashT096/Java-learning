
import java.util.Scanner;

public class functions {

    public static void printHelloworld(){
        
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        printHelloworld();    //function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
        calculatesum(a,b);
    }

public static void calculatesum(int a , int b){
        //Syntax with parameters
    Scanner sc = new Scanner(System.in);
    
    int sum = a + b;
    System.out.println("Sum is:" + sum);
    }
   
    
}
