package com.example.day0117;

// "AB"	1	"BC"
//"z"	1	"a"
//"a B z"	4	"e F d"
public class Kata45 {
    public static void main(String[] args) {
        Solution45 s = new Solution45();

        // a : 97   A : 65
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
    }
}

class Solution45 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            if (sc == ' ') {
                answer.append(" "); continue;
            }
            char c = (char) (Character.isUpperCase(sc) ? ('A' + (sc - 'A' + n) % 26) :('a' + (sc - 'a' + n) % 26));
            answer.append(c);
        }
        return answer.toString();
    }
}

