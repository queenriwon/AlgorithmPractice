package com.example.day0110;

public class Kata_30 {
    public static void main(String[] args) {
        Solution30 solution = new Solution30();

        String s1 = "abcde";
        String s2 = "qwer";

        System.out.println(solution.solution(s1));
        System.out.println(solution.solution(s2));
    }
}
class Solution30 {
    public String solution(String s) {
        return s.substring((s.length()-1)/2,(s.length()/2+1));
    }
}
