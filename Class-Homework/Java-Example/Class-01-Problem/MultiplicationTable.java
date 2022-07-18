package com.mycompany.basicjava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Table Value: ");
        int number1=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(number1+"x"+i+"="+number1*i); 
            i++;
        }
        System.out.print("Enter 2nd Table Value: ");
        int number2=input.nextInt();
        int j;
        for(j=1; j<=10; j++){
            System.out.println(number2+"x"+j+"="+number2*j); 
        }
    }
}
