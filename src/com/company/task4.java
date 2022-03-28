package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first, second, firstConcatenatedString, secondConcatenatingString;

        System.out.println("This program concatenate words, please insert some text");
        System.out.println("Enter first text");
        first = br.readLine();
        System.out.println("Enter second text");
        second = br.readLine();
        first.concat(second);
        firstConcatenatedString = first.concat(second);
        secondConcatenatingString = second.concat(first);
        System.out.println(firstConcatenatedString);
        System.out.println(secondConcatenatingString);


       int a= firstConcatenatedString.compareTo(secondConcatenatingString);

       if(a>0) System.out.println("They are not alternating");
       else System.out.println("They are alternating");


    }
}
