package com.example.day0201;

// https://school.programmers.co.kr/learn/courses/30/lessons/140108

import java.util.ArrayList;
import java.util.List;

//"banana"	3
//"abracadabra"	6
//"aaabbaccccabba"	3
public class Kata65 {
    public static void main(String[] args) {
        Solution65 s = new Solution65();

        System.out.println(s.solution("banana"));
        System.out.println(s.solution("abracadabra"));
        System.out.println(s.solution("aaabbaccccabba"));
    }
}

class Solution65 {
    public int solution(String s) {

        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        int result = 0;
        while (!list.isEmpty()) {
            result++;
            char c = list.get(0);
            int cCount = 1;
            int aCount = 0;
            for (int i = 1; i < list.size(); i++) {
                if (c == list.get(i)) {
                    list.remove(i);
                    cCount++;
                } else {
                    list.remove(i);
                    aCount++;
                }
                if (cCount == aCount || list.isEmpty()) {
                    break;
                }
            }
            list.remove(0);
        }

        return result;
    }
}
