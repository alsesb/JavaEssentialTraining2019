package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        var result = (s1 == s2) ? "This is the same!" : "Not the same";
        System.out.println(result);

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        var result2 = (s3 == s4) ? "This is the same!" : "Not the same";
        System.out.println(result2);

        var result3 = (s3.equals(s4)) ? "This is the same" : "Not the same";
        System.out.println(result3);

        var s5 = "HELLO!";

        var result4 = (s3.equalsIgnoreCase(s5)) ? "This is the same" : "Not the same";
        System.out.println(result4);
    }
}
