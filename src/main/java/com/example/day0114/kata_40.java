package com.example.day0114;

public class kata_40 {
    public static void main(String[] args) {
        Solution40 s = new Solution40();

        System.out.println(s.solution(45));
    }
}

class Solution40 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n,3));
        sb.reverse();
        return Integer.parseInt(sb.toString(),3);
    }
}