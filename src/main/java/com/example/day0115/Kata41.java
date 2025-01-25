package com.example.day0115;

public class Kata41 {
    public static void main(String[] args) {
        Solution41 solution = new Solution41();

        System.out.println(solution.solution("try hello world"));
        System.out.println(solution.solution("trye hellor world"));
        System.out.println(solution.solution("trye hellor world dksljf"));
        System.out.println(solution.solution("a          a     "));



    }
}

class Solution41 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0; // 단어 내 위치 추적

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    sb.append(' '); break;
                } else {
                    if (j % 2 == 0) sb.append(Character.toUpperCase(c));
                    else sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }
}