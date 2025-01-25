package com.example.day0122;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class kata49 {
    public static void main(String[] args) {
        Solution49 s = new Solution49();

        int[] result = s.solution(new int[]{2,1,3,4,1});

        for (int n : result) {
            System.out.println(n);
        }

    }
}

class Solution49 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j<numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        list.sort(Comparator.naturalOrder());

        return list.stream().distinct().mapToInt(i -> i).toArray();
    }
}
