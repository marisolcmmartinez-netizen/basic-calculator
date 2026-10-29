package com.pluralsight;
    import java.io.InputStream;
    import java.util.*;
public class CalcApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // get two numbers
        System.out.print("enter first number: ");
        int firstNumber = myScanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = myScanner.nextInt();

        //show the options
        System.out.println();
        System.out.println("Calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select a option");
        String option = myScanner.next();
        // Per the instructions, always multiply and ignore the option
        int result = firstNumber * secondNumber;
        System.out.println();
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);

    }
}

