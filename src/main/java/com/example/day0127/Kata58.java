package com.example.day0127;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kata58 {
    public static void main(String[] args) {
        Solution58 s = new Solution58();

        System.out.println(s.solution(new int[]{1,2,3,4}));
    }
}

class Solution58 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length ; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int n) {
        // 에라토스테네스 체: Math.sqrt(n)
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


class Solution58B{
    public int solution(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        ans += 1;
                    }
                }
            }
        }
        return ans;
    }
    public Boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
            if(num % i == 0) cnt += 1;
        }
        return cnt == 1;
    }
}