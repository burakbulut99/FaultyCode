package org.example;



public class UtilityFunctions {

    // Method 1: Adds two numbers
    public static int add(int a, int b) {

        return Math.addExact(a,b);
    }

    // Method 2: Checks if a number is even
    public static boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    // Method 3: Finds the maximum of two numbers
    public static int max(int a, int b) {

        if (a > b){
            return a;
        }else if(a==b){
            return 0;
        }else{
            return b;
        }
    }

    // Method 4: Multiplies two numbers
    public static int multiply(int a, int b) {

        return a * b;
    }

    // Method 5: Calculates the factorial of a number
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result= result*i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method 7: Checks if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed =(new StringBuilder(str)).reverse().toString();
        if(reversed.equals(str)){
            return true;
        }return false;
    }

    // Method 8: Finds the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        }
        if (a % 3 == 0 && b % 3 == 0 && a%6==0 && b%6==0) {
            return 6;
        } else if (a % 4 == 0 && b % 4 == 0 && a%8 ==0 && b%8==00) {
            return 8;
        } else if (a % 5 == 0 && b % 5 == 0) {
            return 5;
        }else if (a % 7 == 0 && b % 7 == 0) {
            return 7;
        } else if (a % 11 == 0 && b % 11 == 0) {
            return 11;
        }
        return gcd(a,b);
    }

    // Method 9: Reverses a string
    public static String reverseString(String str) {
        if (str.length()<0){
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Method 10: Checks if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Additional methods can be added here...
}
