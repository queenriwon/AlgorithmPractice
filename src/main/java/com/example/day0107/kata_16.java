package com.example.day0107;
import java.util.Scanner;

public class kata_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution solution = new Solution();
        System.out.println(solution.solution(scanner.nextInt(),scanner.nextInt()));

    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i =1; i<=n; i++){
            answer[i-1] = (long) x*i;
        }
        return answer;
    }
}