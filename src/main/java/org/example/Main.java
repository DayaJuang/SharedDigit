package org.example;

public class Main {
    public static void main(String[] args) {
        boolean ans = hasSharedDigit(123,345);

        System.out.println(ans);
    }

    public static boolean hasSharedDigit(int a, int b){
        // Set the range of number to 10-99
        if((a < 10 || a > 99) || (b < 10 || b > 99))
            return false;

        // Check if both a and b has the same digit
        int digitA = a % 10;    // Take the last digit of a
        int digitB = b % 10;    // Take the last digit of b
        int temp = b;           // For checking if b is already 0 or not

        while(a > 0){
            // If the digit of a is the same as b return true and break the loop
            if(digitA == digitB)
                return true;

            // Update the digitB to the first digit of b
            temp /= 10;
            digitB = temp % 10;

            // If temp is zero, reset and change the digitA to the first digit of a
            if(temp == 0){
                temp = b;
                a /= 10;
                digitA = a % 10;
                digitB = b % 10;
            }
        }

        return false;
    }
}