package com.example.day0116;

public class kata43 {
    public static void main(String[] args) {
        Solution43 s = new Solution43();

        System.out.println(s.solution("3141592", "271"));
        System.out.println(s.solution("500220839878", "7"));
        System.out.println(s.solution("10203", "15"));

    }
}

class Solution43 {
    public int solution(String t, String p) {
        int len = p.length();

        int result = 0;
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i <= t.length() - len; i++){
            int eq1 = Integer.parseInt(sb.substring(i,i+len));
            int eq2 = Integer.parseInt(p);
            if (eq1 <= eq2) {
                result++;
            }
        }
        return result;
    }
}