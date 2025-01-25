package com.example.day0122;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kata53 {
    public static void main(String[] args) {
        Solution53 s = new Solution53();

        for(int i : s.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})) {
            System.out.println(i);
        }

    }
}

class Solution53 {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0 ; i < score.length; i++) {
            list.sort(Comparator.naturalOrder());
            if (list.size() == k) {
                Integer min = list.remove(0);
                list.add(((min > score[i]) ? min : score[i]));
            } else {
                list.add(score[i]);
            }
            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(0);
        }

        return answer;
    }
}