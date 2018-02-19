package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] position = new int[n];
        for(int position_i = 0; position_i < n; position_i++){
            position[position_i] = in.nextInt();
        }
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        String ret = checkAll(n, height, position);
        System.out.println(ret);
        in.close();

    }

    static String checkAll(int n, int[] height, int[] position) {
        // Complete this function
        String result = "NONE";

        if (n < 2)
            return result;

        //test left
        boolean left = true;
        for (int ndx = 1; ndx < n; ndx++) {
            if (position[ndx - 1] + height[ndx - 1] < position[ndx]) {
                //how many does it take out?


                left = false;
                break;
            }
        }

        //Test Right
        boolean right = true;
        for (int ndx = (n-1); ndx > 0; --ndx) {
            if (position[ndx] - height[ndx] > position[ndx - 1]) {
                right = false;
                break;
            }
        }

        if (right && left){
            result = "BOTH";
        }else if (right){
            result = "RIGHT";
        }else if (left){
            result = "LEFT";
        }
        return result;
    }
}