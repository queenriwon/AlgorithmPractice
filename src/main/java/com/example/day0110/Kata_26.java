package com.example.day0110;

import java.util.Arrays;

public class Kata_26 {
    public static void main(String[] args) {
        Solution26 solution = new Solution26();

        int[] arr = {4,7,12};
        boolean[] signs = {true, false, true};

        int result = solution.solution(arr, signs);

        System.out.println(result);
    }
}

class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {

        int result = 0;
        for (int i = 0; i< absolutes.length; i++){
            result += ((signs[i]) ? absolutes[i] : -1 * absolutes[i]);
        }
        return result;

//        for (int i = 0; i < absolutes.length; i++){
//            if(!signs[i]) absolutes[i] *= -1;
//        }
//        return Arrays.stream(absolutes).sum();

    }
}
