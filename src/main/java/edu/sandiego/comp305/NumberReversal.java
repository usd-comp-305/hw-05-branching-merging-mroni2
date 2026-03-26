package edu.sandiego.comp305;


import java.util.Scanner;

public class NumberReversal {

    public static void main(String[] args) {
        Integer forwardNumber = retrieveNumber();
        int reverseNumber = reverseNumberForLoop(forwardNumber);

        System.out.println("Your reversed number is: " + reverseNumber);

    }

    private static int retrieveNumber() {
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);

        return in.nextInt();
    }

    private static int reverseNumberForLoop(Integer forwardNumber) {
        int reverseNumber = 0;

        int numDigits = forwardNumber.toString().length();

        for (int i = 0; i < numDigits; i++) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + forwardNumber%10;
            forwardNumber = forwardNumber/10;
        }

        return reverseNumber;
    }

    private static int reverseNumberWhileLoop(int forwardNumber) {
        int reverseNumber = 0;

        while (forwardNumber != 0) {
            reverseNumber = reverseNumber * 10+ forwardNumber%10;
            forwardNumber = forwardNumber/10;
        }

        return reverseNumber;

    }

}