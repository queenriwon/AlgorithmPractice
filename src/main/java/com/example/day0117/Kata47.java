package com.example.day0117;

import java.util.Arrays;
import java.util.Comparator;

//["sun", "bed", "car"]	1	["car", "bed", "sun"]
//["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
public class Kata47 {
    public static void main(String[] args) {
        Solution47 s = new Solution47();

        String[] result = s.solution(new String[]{"cnbc", "anbcd"}, 1);

        for (String string : result) {
            System.out.println(string);
        }

    }
}

class Solution47 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing(s -> s.charAt(n)));
        return strings;
    }
}
