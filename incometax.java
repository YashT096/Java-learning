import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read Salary from user input
        System.out.print("Enter your salary: ");
        int Salary = sc.nextInt(); // Remove redeclaration
        
        int tax;

        // Calculate tax based on salary
        if (Salary < 500000) {
            tax = 0;  // No tax if salary is under 5L
        } 
        else if (Salary >= 500000 && Salary <= 1000000) {
            tax = (int) (Salary * 0.2);  // 20% tax for salary between 5L and 10L
        } 
        else {
            tax = (int) (Salary * 0.3);  // 30% tax for salary above 10L
        }

        // Display the tax
        System.out.println("Your income tax is: " + tax);
    }
}
