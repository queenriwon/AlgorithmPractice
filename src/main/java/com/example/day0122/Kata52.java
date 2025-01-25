package com.example.day0122;

public class Kata52 {
    public static void main(String[] args) {
        Solution52 s = new Solution52();

        System.out.println(s.solution(2,1,20));
//        System.out.println(s.solution(3,1,20));
    }
}

class Solution52 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int num = (n / a) * b;
            answer += num;
            n = num + (n % a);
        }
        return answer;
    }
}
