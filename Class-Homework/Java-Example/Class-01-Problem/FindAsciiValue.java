package com.mycompany.basicjava;

import java.util.Scanner;

public class FindAsciiValue {

    public static void main(String[] args) {
        char ch = 'a';
        int AsciiValue1 = ch;
        int castAscii = (int) ch;
        Scanner input=new Scanner(System.in);
        char text;
        System.out.print("Enter Character: ");
        text=input.next().charAt(0);
        int AsciiValue2=text;
        System.out.println("The Define Character is '"+ch+"'");
        System.out.println("The ASCII value of " + ch + " is: " + AsciiValue1);
        System.out.println("The Cast ASCII value of " + ch + " is: " + castAscii);
        System.out.println("The Input ASCII value of " + text + " is: " +AsciiValue2);
    }
}
