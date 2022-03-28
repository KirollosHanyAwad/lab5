package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class task5 {
    public static void main(String[] args) throws IOException {

        String str, reverse = "";


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program checks if a word is a palindrome.\nPlease write a word");
        str = br.readLine();




        for (int i = str.length() -1; i >=0; i--){
            reverse += str.charAt(i);
        }

        if (reverse.toLowerCase().equals(str.toLowerCase())) System.out.println(str.toLowerCase() + " is a palindrome");
        else System.out.println(str.toLowerCase() + " is not a palindrome");
    }
}
