package com.example.day0207;

// https://school.programmers.co.kr/learn/courses/30/lessons/155652

// "aukks"	"wbqd"	5	"happy"
// 입력값 〉 "bcdefghijklmnopqrstuvwxyz", "a", 1
// 기댓값 〉 "cdefghijklmnopqrstuvwxyzb"

import java.util.Arrays;

public class Kata67 {
    public static void main(String[] args) {
        Solution67 s = new Solution67();

        System.out.println(s.solution("aukks", "wbqd",	5));
        System.out.println(s.solution("z", "a", 1));


    }
}

class Solution67 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        char[] sCharArray = s.toCharArray();

        for (char c : sCharArray) {
            int shift = 0;
            for (int i = 0; i < index; i++, shift++) {
                c = (char) ('a' + (c - 'a' + 1) % 26);
                if (skip.contains(String.valueOf(c))) i--;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
