package main;
import java.lang.Math;

public class PrimeNumber {


    public static void main(String[] args) {
        int limit = 100;  // You can set the limit to whatever number you want
        System.out.println("Prime numbers up to " + limit + ":");

        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // num is divisible by i, so it's not prime
            }
        }

        return true;  // num is prime
    }
}


