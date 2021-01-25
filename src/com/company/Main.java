package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double getInput(Scanner sc){
        System.out.print("Enter a numeric value: ");

        double result = 0;
        while(true){
            if(sc.hasNextDouble()){
                result = sc.nextDouble();
                break;
            }
            else{
                System.out.println("This is an invalid input!");
                sc.next();
                System.out.print("Enter a numeric value: ");
            }
        }
        return result;
    }

    public static double calculate(char operation, double number1, double number2){
        double result = 0;
        switch (operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
        return result;
    }

    public static char getOperation(Scanner sc){
        System.out.print("Select an operator (+ - * /): ");
        String[] operations = {"+", "-", "*", "/"};

        String operation = "+";
        while(true){
            operation = sc.next();
            System.out.println();
            if (Arrays.stream(operations).anyMatch(operation::equals) && operation.length() == 1){
                break;
            }
            else{
                System.out.println("This is an invalid operator!");
                System.out.print("Select an operator (+ - * /): ");

            }
        }
        return operation.charAt(0);
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var d1 = getInput(sc);
        var d2 = getInput(sc);
        char operator = getOperation(sc);

        double result = calculate(operator, d1 ,d2);

        System.out.println("The answer is " + result);
    }

}

