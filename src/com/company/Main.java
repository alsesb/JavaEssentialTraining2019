package com.company;

import java.util.Scanner;

public class Main {

    public static double getInput(Scanner sc, String prompt){
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var d1 = getInput(sc, "Enter a numeric value 1: ");
        var d2 = getInput(sc, "Enter a numeric value 2: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

}

