package com.company;

public class Main {

    public static void main(String[] args) {

        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println();

        for (String month: months){
            System.out.println(month);
        }

        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println();

        var counter = 0;
        while(counter < months.length){
            System.out.println(months[counter]);
            counter++;
        }

        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println();

        var counter2 = 0;
        do {
            System.out.println(months[counter2]);
            counter2++;
        }
        while(counter2 < months.length);

    }
}
