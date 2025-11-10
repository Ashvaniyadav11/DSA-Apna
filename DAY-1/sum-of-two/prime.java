import java.util.Scanner;

public class prime {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // found a divisor
            }
        }
        return true; // no divisors found
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        
    }
}
