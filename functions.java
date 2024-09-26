import java.util.Scanner;

public class Functions {

    // Method to print "Hello World" multiple times
    public static void printHelloworld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // Method to multiply two numbers
    public static int multiply(int t, int y) {
        int product = t * y;
        return product;
    }

    // Method to calculate the sum of two numbers
    public static void calculatesum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    // Method to swap two numbers
    public static void swap(int k, int l) {
        int temp = k;
        k = l;
        l = temp;

        System.out.println("After swapping: k = " + k + ", l = " + l);
    }

    // Factorial method
    public static int factorial(int k) {
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * i;  // Correct multiplication by 'i'
        }
        return result;
    }

    // Binomial Coefficient method
    public static int binocoeff(int k, int r) {
        int fact_k = factorial(k);
        int fact_r = factorial(r);
        int nmrfact = factorial(k - r);  // k - r factorial

        // Calculate binomial coefficient using the formula: k! / (r! * (k-r)!)
        int binocoeff = fact_k / (fact_r * nmrfact);
        return binocoeff;
    }

    // Main function
    public static void main(String[] args) {
        // Call to printHelloWorld function
        printHelloworld();

        // Scanner to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking input for sum calculation
        System.out.print("Enter two numbers for sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a, b);

        // Swap two numbers using method
        int k = 4;
        int l = 5;
        swap(k, l);  // Swapping k and l

        // Multiply two numbers
        int t = 3;
        int y = 8;
        int prod = multiply(t, y);
        System.out.println("t * y = " + prod);

        // Multiply different numbers directly
        prod = multiply(10, 23);
        System.out.println("10 * 23 = " + prod);

        // Factorial calculation
        int number = 5;
        int factResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factResult);

        // Binomial coefficient calculation
        int r = 2;  // Second number for binomial coefficient
        int binomResult = binocoeff(number, r);
        System.out.println("Binomial Coefficient C(" + number + ", " + r + ") is: " + binomResult);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
