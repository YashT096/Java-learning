//Today are about to look about operators in java

/* Types of operators are :-
 * 1. Arithmetic Operators
 * 2. Relational Operators
 * 3. Logical operators
 * 4. Bitwise Operators
 * 5. Assignment Operators
 */

public class operators {
    public static void main(String[] args){
        
        int A = 10;
        int B = 5;
        int C = ++A;
        int D = A--;
        System.out.println("Add = " + (A + B));        // Using double quotes for strings
        System.out.println("Subtract = " + (A - B));
        System.out.println("Multiply = " + (A * B));
        System.out.println("Division = " + (A / B));
        System.out.println("Modulo = " + (A % B));
        System.out.println(A);
        System.out.println(C);
        System.out.println(D);

        /*Relational Operators
         *== (equality)
!= (inequality)
(greater than)
< (less than)
= (greater than or equal to)
<= (less than or equal to) 
         */
        System.out.println(A==B);
        System.out.println(A!=B);
        System.out.println(A>=B);
        System.out.println(A<=B);
        System.out.println(A<B);
        System.out.println(A>B);

/*Relational Operators
Logical Operators:
&& (logical and)
|| (logical or)
! (logical not)
*/      


       System.out.println((3>2) && (5>0));
       System.out.println((3>2) || (5<0));
       System.out.println(!(3>2));

       /* Assignment Operator
         = (assignment)
+= (addition assignment)
-= (subtraction assignment)
*= (multiplication assignment)
/= (division assignment)
%= (modulus assignment)
<<= (left shift assignment)
>>= (right shift assignment)
= (unsigned right shift assignment)
        */
        System.out.println(A +=10 );
        System.out.println(A -=10 );
        System.out.println(A *=10 );
        System.out.println(A /=10 );
        System.out.println(A %=10 );
    }
}
