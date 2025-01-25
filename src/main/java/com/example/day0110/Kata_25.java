package com.example.day0110;

import java.util.Arrays;


public class Kata_25 {
    public static void main(String[] args) {
        Solution25 solution = new Solution25();

        int[] arr = {3};
        int[] result = solution.solution(arr, 5);

        for(int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(arrValue -> arrValue % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
    }
}
