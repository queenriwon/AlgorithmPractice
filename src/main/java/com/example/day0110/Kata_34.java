package com.example.day0110;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Kata_34 {
    public static void main(String[] args) {
        Solution34 solution = new Solution34();

        String ans = "Zbcdefg";
        System.out.println(solution.solution(ans));
    }
}

class Solution34 {
    public String solution(String s) {
        String[] ss = s.split("");
        Arrays.sort(ss, Comparator.reverseOrder());

        String answer = "";
        for (String str: ss) answer += str;
        return answer;
    }
}
