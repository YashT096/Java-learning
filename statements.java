
public  class statements {
    
        public static void main(String[] args) {
        int age = 17;
        /* This is an If-Else Conditional statements... */
         if (age >=21){
            System.out.println("Your are an Adult");
         }
         if (age >=15){
            System.out.println("Your are  a Teen");
         }
         else{
            System.out.println("Your are still not Adult");
         }

         int A = 100;
         int B = 20;
         if(A >= B){
            System.out.println("A is Greater then B");
         }
         else{
            System.out.println("B is Greater then A");
         }
         /*Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();*/int n= 20;

         if( n % 2 == 0 ){
            System.out.println("The following number is Even"); 
            }
            else{
               System.out.println("The following nummber is odd");
            }
            int Aage = 21 
            ;
            if(Aage>= 18){System.out.println("You are an Adult");}
            else if(Aage >= 13 && Aage <=18){System.out.println("You are a Teen");}
            else{System.out.println("You are A Kid");}


            //Ternary Operator

            int number = 34;
            String type = ((number%2) ==0)? "Even" : "Odd";
            System.out.println(type);
            

            int grade = 9;
            String status = grade >=35 ? "Pass" : " Fail";
            System.out.println(status);

        //Switch Statement
        int pointer = 6;

if (pointer == 10) {
    System.out.println("Good !");
} else if (pointer == 5) {
    System.out.println("Distinction!!");
} else {
    System.out.println("Fail!");
    throw new AssertionError();
}

    }

}
 
