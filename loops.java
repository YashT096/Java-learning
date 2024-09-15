
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
     // while loop ; for Loop ; do while loop

     //While loop
     int n = 3;
     while (n>5 ) {
        System.out.println("Hello World"); 
         
     }
    // int counter = 0 ;
    // while(counter < 110){
      //  System.out.println("Hello World, I am Yash");
      //  counter++;
     //}

    //int counter = 1;
    //while(counter <= 10 ){
      //  System.out.println(counter+"");
        //counter++;
    //}
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a range:");
       int counter = 1;
       int range=sc.nextInt();
      
       while( counter <= range ){
        System.out.println(counter + "" );
        counter++;
       }
       sc.close();
    }
}
