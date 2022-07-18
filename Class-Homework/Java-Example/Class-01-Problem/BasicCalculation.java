package com.mycompany.basicjava;

import java.util.Scanner;

public class BasicCalculation {

    public static void main(String[] args) {
        int number1;
        int number2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number = ");
        number1 = input.nextInt();
        System.out.print("Enter 2nd Number = ");
        number2 = input.nextInt();
        
        if (number1 > number2) {
            System.out.println("Number1 Bigger Than number2. Program Successfully Execute.");
            int add = number1 + number2;
            int sub = number1 - number2;
            int mul = number1 * number2;
            int div = number1 / number2;
            System.out.println("Addition = " + number1 + "+" + number2 + " = " + add);
            System.out.println("Subtraction = " + number1 + "-" + number2 + " = " + sub);
            System.out.println("Multiplication = " + number1 + "*" + number2 + " = " + mul);
            System.out.println("Division = " + number1 + "/" + number2 + " = " + div);
        } else {
            System.out.println("Number1 Smaller Than number2. Try Again");
        }
    }
}
