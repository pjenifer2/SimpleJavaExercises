package com.patrickjenifer;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // example of a line comment
        /*
            Example
            of
            a
            block
            comment
         */

        //example of string variable
        String description = "My best golf score is ";
        //int example
        int score = 76;
        //reference types
        Date date = new Date();

        System.out.println(description + score + " on this date " + date);

        String name = new String("Patrick's Code");
        System.out.println(name.toUpperCase());
    }
}
