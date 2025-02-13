package com.example.day0214;

// https://school.programmers.co.kr/learn/courses/30/lessons/118666

/*
["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	"TCMA"
["TR", "RT", "TR"]	[7, 1, 3]	"RCJA"
 */
public class Kata69 {
    public static void main(String[] args) {
        Solution69 s = new Solution69();

        System.out.println(s.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
        System.out.println(s.solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));

    }
}

class Solution69 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        return answer;
    }
}