package com.mycompany.basicjava;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        int Quotient;
        int Remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = input.nextInt();
        Quotient = dividend / divisor;
        Remainder = dividend % divisor;
        System.out.println("Value of Quotient = "+Quotient);
        System.out.println("Value of Remainder = "+Remainder);
    }
}
