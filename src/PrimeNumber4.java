import java.util.Scanner;

public class PrimeNumber4 {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle special cases
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Other even numbers are not prime
        }

        // Check for factors from 3 to the square root of the number
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // Found a factor, so the number is not prime
            }
        }

        // No factors found, the number is prime
        return true;
    }
}