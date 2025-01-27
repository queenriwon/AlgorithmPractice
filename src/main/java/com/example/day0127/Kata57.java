package com.example.day0127;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class Kata57 {
    public static void main(String[] args) {
        Solution57B s  = new Solution57B();

        int[] result = s.solution(new int[]{1,3,2,4,2});

        for (int i : result) {
            System.out.println(i);
        }
    }
}

// 속도
class Solution57B {
    public int[] solution(int[] answers) {
        int[][] ansArray = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] list = new int[3];
        for (int i = 0; i < ansArray.length; i++) {  // 0 ~ 2까지
            for (int j = 0; j < answers.length; j++) {  // 0 ~ 4까지
                if (answers[j] == ansArray[i][j % ansArray[i].length]) list[i]++;
            }
        }

        int max = Math.max(list[0], Math.max(list[1],list[2]));
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (max == list[i]) indexList.add(i + 1);
        }

        int[] cnt = new int[indexList.size()];
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = indexList.get(i);
        }
        return cnt;
//        return list;
    }
}

// 가독성
class Solution57A {
    public int[] solution(int[] answers) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5} ;

        List<Integer> list = new ArrayList<>(
                List.of(0,0,0)
        );
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) list.set(0, list.get(0) + 1);
            if (answers[i] == b[i % b.length]) list.set(1, list.get(1) + 1);
            if (answers[i] == c[i % c.length]) list.set(2, list.get(2) + 1);
        }
        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        return IntStream.range(0, list.size())
                .filter(i -> list.get(i) == max)
                .map(i -> i + 1).toArray();
    }
}