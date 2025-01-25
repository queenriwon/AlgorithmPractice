package com.example.day0116;

import java.util.Arrays;

public class kata42 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();

        System.out.println(s.solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println("\n");
        System.out.println(s.solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }
}

class Solution42 {
    public int solution(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) count++;
                }
            }
        }
        return count;
    }
}
