package com.example.day0114;

public class kata_36 {
    public static void main(String[] args) {
        Solution36 solution = new Solution36();

        System.out.println(solution.solution("12"));
    }
}

class Solution36 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        for (char c : s.toCharArray()){
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}