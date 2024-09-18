
import java.util.Scanner;





public class loops {
    public static void main(String[] args) {
     // while loop ; for Loop ; do while loop

     //While loop
     int n = 4 ;
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
    
   // Scanner sc = new Scanner(System.in);
    //System.out.println("Enter a range:");
      // int counter = 1;
       //int range=sc.nextInt();
      
       //while( counter <= range ){
        //System.out.println(counter + "" );
        //counter++;
       //}
       //sc.close();

       // For Loop
       //int = 1 ;
      for (int i = 1; i<=10; i++ ){
      System.out.println("Hello Its Yash!");
      }
   // Reverse of a number
    int random = 123456789;

  while(random >0){
    int lastdigit = random % 10;
    System.out.print(lastdigit+"");
    random = random / 10;

  }
  System.out.println("");

  int k = 124345;
  int rev = 0;
  while(k>0){
    int last = k%10;
    rev = (rev*10) + last;
    k= k/10;

  }    
  System.out.println(rev);

  //do-While loop
int counter =1 ;
  do { 
      System.out.println("Hey! ,Hello");
      counter++;
  } while (counter<=10);
  

 //  Breal statement :- to break the loop 
 
 for(int j =1;j<=5;j++){
 if(j ==3){
  break;}
  System.out.println(j); }
    
    System.out.println("I am out of the loop");

  Scanner sc = new Scanner (System.in);
  
 do {
      System.out.println("Enter Your Number:-");
       int p = sc.nextInt();

  if (p % 10 == 0 ){
    break;
  }

  System.out.println(p);
}
 while (true); 
 sc.close();
      
 // continue Statement

 for(int q = 1; q <=5 ;q++){
  if(q == 3){
    continue;
  }System.out.println(q);
 }
 

 for (int h = 1; h <= 25;h ++ ){
  if (h % 5 == 0){
    continue;
  }
  System.out.println(h);
 }
    }
}
