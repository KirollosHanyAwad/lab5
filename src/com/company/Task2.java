package com.company;

import java.util.Random;
import static java.lang.Math.round;

public class Task2 {

    public static void main(String[] args) {
        int rnd, max = 0, min = 101;
        int random[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < random.length; i++) {

            rnd = round((r.nextInt(100) + 1));
            random[i] = rnd;
            System.out.print(random[i] + ", ");

            if (rnd < min) min = rnd;
            if (rnd > max) max = rnd;

        }
        System.out.println("\nThe smallest number: " + min);
        System.out.println("The largest number: " + max);


    }
}