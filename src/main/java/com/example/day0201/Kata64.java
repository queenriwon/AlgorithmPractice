package com.example.day0201;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862

//5	[2, 4]	[1, 3, 5]	5
//5	[2, 4]	[3]	4
//3	[3]	[1]	2
//5, [4, 2], [3, 5] 5
//입력값 〉 5, [1, 4], [2, 4] 5
//입력값 〉 5, [1, 2], [3, 4] 4
//입력값 〉 5, [2, 3], [3, 4] 4

//입력값 〉 5, [4, 5], [3, 4] 4
//입력값 〉 5, [5, 3], [4, 2] 5

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata64 {
    public static void main(String[] args) {
        Solution64 s = new Solution64();

        System.out.println(s.solution(5, new int[]{2,4}, new int[]{1,3,5}));
        System.out.println(s.solution(5, new int[]{2,4}, new int[]{3}));
        System.out.println(s.solution(3, new int[]{3}, new int[]{1}));
        System.out.println(s.solution(5, new int[]{4,2}, new int[]{3,5}));
        System.out.println(s.solution(5, new int[]{1,4}, new int[]{2,4}));
        System.out.println(s.solution(5, new int[]{1,2}, new int[]{3,4}));
        System.out.println(s.solution(5, new int[]{2,3}, new int[]{3,4}));
        System.out.println();
        System.out.println(s.solution(5, new int[]{4,5}, new int[]{3,4}));
        System.out.println(s.solution(5, new int[]{5,3}, new int[]{4,2}));
    }
}

class Solution64 {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    result++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    result++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return result;
    }
}
