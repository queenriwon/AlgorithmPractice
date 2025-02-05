package com.example.day0205;

// https://school.programmers.co.kr/learn/courses/30/lessons/160586

//["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
//["AA"]	["B"]	[-1]
//["AGZ", "BSSS"]	["ASA","BGZ"]	[4, 6]

public class Kata66 {
    public static void main(String[] args) {
        Solution66 s = new Solution66();

        for (int i : s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"})) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i : s.solution(new String[]{"AA"}, new String[]{"B"})) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i : s.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})) {
            System.out.println(i + " ");
        }

    }
}


class Solution66 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        return answer;
    }
}
