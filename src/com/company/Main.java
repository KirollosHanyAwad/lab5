package com.company;

import java.util.Random;
import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
// task 1


    int nums[] = new int[10];

    for (int i = 0; i < nums.length; i++){
        nums[i] = nums.length-1-i;
    }

    for(int x : nums)
    System.out.println("nums["+ x + "] " + nums[x]);

    }



}
