package com.company;

public class Main {

    public static void main(String[] args) {

	    String s = "";
        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer: " + e.getMessage());
        }
        catch (StringIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("String index out of bound: " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("This is a general Exception: " + ex.getMessage());
        }
    }
}
