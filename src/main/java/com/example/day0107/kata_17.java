package com.example.day0107;

import java.util.Scanner;

public class kata_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution17 solution = new Solution17();
        int[] result = solution.solution(scanner.nextLong());

        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}

class Solution17 {
    public int[] solution(long n) {
        int size = (int)( Math.log10(n)+1 );
        int[] answer = new int[size];

        for (int i =0;i<size; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }
}