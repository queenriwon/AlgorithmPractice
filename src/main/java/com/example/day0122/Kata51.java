package com.example.day0122;

public class Kata51 {
    public static void main(String[] args) {
        Solution51 s = new Solution51();

        System.out.println(s.solution(new int[]{1, 3, 4, 6}));

        System.out.println(s.solution(new int[]{1, 7, 1, 2}));


    }
}

class Solution51 {
    public String solution(int[] food) {

        for(int i = 1; i < food.length; i++) {
            food[i] = food[i] / 2;
            System.out.println(food[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i]));
        }
        sb.append("0");
        for(int i = food.length - 1; i >= 1; i--) {
            sb.append(String.valueOf(i).repeat(food[i]));
        }

        return sb.toString();
    }
}
