package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        var n1 = scanner.nextDouble();
        System.out.print("Enter a numeric value: ");
        var n2 = scanner.nextDouble();

        System.out.println("The answer is: " + (n1 / n2));

    }
}
