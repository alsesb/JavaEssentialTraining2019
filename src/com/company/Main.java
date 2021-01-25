package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //var scanner = new Scanner(System.in);
        //System.out.print("Enter a month number (1-12): ");
        //var monthNumber = scanner.nextInt();
        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        String message = (monthNumber <= 3) ? "That's in Quarter 1!" : (monthNumber <= 6) ? "That's in Quarter 2" : (monthNumber <= 9) ? "That's in Quarter 3" : "That's in Quarter 4";

        System.out.println(message);

    }
}
