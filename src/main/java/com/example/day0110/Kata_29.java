package com.example.day0110;

import java.util.Arrays;

public class Kata_29 {
    public static void main(String[] args) {
        Solution29 solution = new Solution29();

        int[] arr = {4,3,2,1};
        int[] result = solution.solution(arr);

        for(int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}

class Solution29 {
    public int[] solution(int[] arr) {
        int [] result = Arrays.stream(arr)
                .filter(arrValue -> arrValue != Arrays.stream(arr).min().getAsInt()).toArray();
        if (result.length == 0) return new int[] {-1};
        return result;
    }
}