package com.example.day0201;

// https://school.programmers.co.kr/learn/courses/30/lessons/131128

//"100"	"2345"	"-1"
//"100"	"203045"	"0"
//"100"	"123450"	"10"
//"12321"	"42531"	"321"
//"5525"	"1255"	"552"

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kata63 {
    public static void main(String[] args) {
        Solution63B solution63 = new Solution63B();

        System.out.println(solution63.solution("100", "2345"));
        System.out.println(solution63.solution("100", "203045"));
        System.out.println(solution63.solution("100", "123450"));
        System.out.println(solution63.solution("12321", "42531"));
        System.out.println(solution63.solution("5525", "1255"));
    }
}

class Solution63B {
    public String solution(String X, String Y) {
        int[] xArray = new int[10];
        int[] yArray = new int[10];

        for (int i = 0; i<X.length(); i++)
            xArray[Integer.parseInt(String.valueOf(X.charAt(i)))]++;

        for (int i = 0; i<Y.length(); i++)
            yArray[Integer.parseInt(String.valueOf(Y.charAt(i)))]++;

        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xArray[i], yArray[i]);
            for (int i1 = 0; i1 < count; i1++) {
                result.append(i);
            }
        }

        if (result.length() == 0) return "-1";
        if (String.valueOf(result.charAt(0)).equals("0")) return "0";

        return result.toString();
    }
}


// 시간을 많이 잡아먹음
class Solution63A {
    public String solution(String X, String Y) {
        List<Character> xChar = new ArrayList<>();
        for (char c : X.toCharArray()) {
            xChar.add(c);
        }

        List<Character> yChar = new ArrayList<>();
        for (char c : Y.toCharArray()) {
            yChar.add(c);
        }

        xChar.sort(Comparator.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (char c : xChar) {
            for (int i = 0; i < yChar.size(); i++) {
                Character character = yChar.get(i);
                if (c == character) {
                    result.append(c);
                    Character remove = yChar.remove(i);
                    break;
                }
            }
        }
        int i = result.isEmpty() ? -1 : Integer.parseInt(result.toString());

        return String.valueOf(i);
    }
}
