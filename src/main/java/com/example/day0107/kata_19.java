package com.example.day0107;
import java.util.Scanner;

public class kata_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution19 solution = new Solution19();
        System.out.println(solution.solution(scanner.nextLong()));
//        solution.solution(scanner.nextLong());
    }
}

class Solution19 {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n) % 1 > 0) answer = -1;
        else answer = (long) Math.pow(Math.sqrt(n)+1,2);

        return answer;
    }
}
