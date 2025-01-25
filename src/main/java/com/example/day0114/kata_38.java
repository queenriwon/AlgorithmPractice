package com.example.day0114;

public class kata_38 {
    public static void main(String[] args) {
        Solution38 solution = new Solution38();

        System.out.println(solution.solution(3, 12)[0]);
        System.out.println(solution.solution(3, 12)[1]);

    }
}

class Solution38 {
    public int[] solution(int n, int m) {
        int[] answer = { 1, Math.max(n,m) };
        for (int i = 1; i<n*m; i++){
            if ((n % i == 0 && m % i == 0)) answer[0] = i;
            int j = n * m - i + 1 ;
            if ((j % n == 0 && j % m == 0)) answer[1] = j;
        }
        return answer;
    }
}