package com.mycompany.basicjava;

import java.util.Scanner;

public class PrintIntegerNumber {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your First Number = ");
        number=input.nextInt();
        System.out.println("Your First Number is = "+number);
    }
}
