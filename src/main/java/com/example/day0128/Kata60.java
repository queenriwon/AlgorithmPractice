package com.example.day0128;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Kata60 {
    public static void main(String[] args) {
        Solution60 s = new Solution60();

        System.out.println(s.solution(5,3,2));  // 10
        System.out.println(s.solution(10,3,2));  // 21

    }
}

class Solution60 {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) count++;
                }
            }
            sum += (count > limit) ? power : count;
        }
        return sum;
    }
}