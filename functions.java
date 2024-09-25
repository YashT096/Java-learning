
import java.util.Scanner;

public class functions {

    public static void printHelloworld(){
        
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int multiply(int t, int y){
        int product = t * y;
        return product;
    }
    

public static void calculatesum(int a , int b){
        //Syntax with parameters
    Scanner sc = new Scanner(System.in);
    
    int sum = a + b;
    System.out.println("Sum is:" + sum);
    }
   
public static void swap(int k , int l )  {
    
        //swap
        int temp= k ;
        k = l;
        l = temp;

        System.out.println("k = " + k);
        System.out.println("l = " + l);

}

//main function
public static void main(String[] args) {
    printHelloworld();    //function call
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
     int b = sc.nextInt();
    calculatesum(a,b);

    //swap-value excahnge
    int k = 4;
    int l = 5;

    //swap
    int temp= k ;
    k = l;
    l = temp;

    System.out.println("k = " + k);
    System.out.println("l = " + l);

    int t = 3;
    int y = 8;
   // int prod = multiply(t, y);
    //1System.out.println("t*y= "+ prod);
    int prod = multiply(10, 23);
    System.out.println("t*Y="+prod);

     int number = 5;
     int result= factorial(number);
     System.out.println("Facorial " + result);
     
}
  
//factorial 
 
public static int factorial(int k){
    int result = 1;
    for(int i=1;i<=k;i++){
        result= result*1;

    }
    return result;  

}
 
}
