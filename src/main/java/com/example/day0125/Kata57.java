package com.example.day0125;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840 - 모의고사

// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5,// 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,// 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

import java.util.*;

public class Kata57 {
    public static void main(String[] args) {
        Solution57 s = new Solution57();


        for (int i : s.solution(new int[]{1,2,3,4,5})) {
            System.out.println("1번: " + i);
        }

        for (int i : s.solution(new int[]{1,3,2,4,2})) {
            System.out.println("2번: " + i);
        }
    }
}


// TODO:
class Solution57 {
    public int[] solution(int[] answers) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5} ;

        List<Integer> list = new ArrayList<>(
                List.of(0,0,0)
        );
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length])
                list.set(0, list.get(0) + 1);
            if (answers[i] == b[i % b.length])
                list.set(1, list.get(1) + 1);
            if (answers[i] == c[i % c.length])
                list.set(2, list.get(2) + 1);
        }
        int maxValue = Collections.max(list);
        list = list.stream().filter(value -> value >= maxValue).toList();

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
