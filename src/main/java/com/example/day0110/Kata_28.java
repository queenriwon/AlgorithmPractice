package com.example.day0110;

import java.util.Arrays;

public class Kata_28 {
    public static void main(String[] args) {
        Solution28 solution = new Solution28();

        int[] arr = {1,2,3,4,6,7,8,0};
        int result = solution.solution(arr);

        System.out.println(result);
    }
}

class Solution28 {
    public int solution(int[] numbers) {

        int result = 0;
        int temp = 0;
        Arrays.sort(numbers);
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] != temp){
                result += temp;
                i--;
            }
            temp++;
        }
        while (temp <= 9){
            result += temp;
            temp++;
        }
        return result;
    }
}
