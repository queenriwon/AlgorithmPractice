package com.example.day0122;

public class Kata50 {
    public static void main(String[] args) {
        Solution50 s = new Solution50();

        for (int a : s.solution("banana")){
            System.out.println(a);
        }

    }
}

class Solution50 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        char[] c = s.toCharArray();

        for (int i = 0; i<c.length; i++) {
            for (int j = 0 ; j<i ; j++) {
                if (c[i] == c[j]) answer[i] = i-j;
            }
            if (answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}
