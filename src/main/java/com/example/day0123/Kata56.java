package com.example.day0123;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Kata56 {
    public static void main(String[] args) {
        Solution56 s = new Solution56();

        System.out.println(s.solution(3,	4,	new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}

class Solution56 {
    public int solution(int k, int m, int[] score) {
        int sumCount = (score.length / m) * m;

        int[] newArray = Arrays.stream(score)
                .boxed()
                .sorted((a,b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();

        int result = 0;
        for (int i = 0; i < sumCount; i++) {
            if (i % m == (m - 1)) result += newArray[i];
        }
        return result * m;
    }
}
