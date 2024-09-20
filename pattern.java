public class pattern {
    public static void main(String[] args) {
        //Square Pattern
      // for(int line=1; line<=4 ; line++){
        //System.out.println("****");
       //}
   // Sqaure Pattern by using while loop
       int sq =1;
       while(sq<=4){
        System.out.println("****");
        sq++;
       }
       
       // Star Pattern(nested Loop)
       for(int line =1;line<=6;line++){
        for(int star=1; star<=line ; star++){
            System.out.print("*");
        }
        System.out.println();
       }
       
      //Inverted Stars
      for(int i=1; i<=5;i++){
        for(int str=str-i+1; str>=i;str++){
            System.out.println("*");
        }
        System.out.println();
      }
        
    }
}
