package com.example.day0107;

import java.util.Scanner;
import java.util.Arrays;

public class kata_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution20 solution = new Solution20();
        System.out.println(solution.solution(scanner.nextLong()));
    }
}

class Solution20 {
    public long solution(long n) {

        String[] array = String.valueOf(n).split("");
        Arrays.sort(array);  // 정렬

        StringBuilder sb = new StringBuilder();
        for(String s: array) sb.append(s);

        System.out.println(sb);  //112378

        long result = Long.parseLong(sb.reverse().toString());  // 987631
        return result;


//        long[] input = new long[array.length];
//        int j = 0;
//        for(String s : array){
//            input[j] = Long.parseLong(s);
//            j++;
//        }
//
////        StringBuilder sb = new StringBuilder();
//
//
//
////        long[] input = new long[(int)(Math.log10(n) + 1)];
////        for(int i = 0; i<input.length;i++){
////            input[i] = n % 10;
////            n /= 10;
////        }
////
////        long temp = 0;
////        for(int i = 0; i<input.length;i++){
////            for(int j = 0; j<input.length;j++){
////                if(input[i]<input[j]){
////                    temp = input[i];
////                    input[i] = input[j];
////                    input[j] = temp;
////                }
////            }
////        }
//
//        long result = 0;
//        for(int i =0; i<input.length;i++){
//            result += Math.pow(10,i-1) * 10 * input[i];
//        }

//        return 0;
    }
}
