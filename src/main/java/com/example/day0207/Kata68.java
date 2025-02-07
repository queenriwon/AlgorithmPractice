package com.example.day0207;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502

/*
[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
[1, 3, 2, 1, 2, 1, 3, 1, 2]	0
 */

public class Kata68 {
    public static void main(String[] args) {
        Solution68 s = new Solution68();

        System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
}

class Solution68 {
    public int solution(int[] ingredient) {
        int answer = 0;
        return answer;
    }
}