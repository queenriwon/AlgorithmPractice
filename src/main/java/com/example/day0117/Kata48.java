package com.example.day0117;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Kata48 {
    public static void main(String[] args) {
        Solution48 s = new Solution48();

        int [] result = s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        // [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
        // [5, 6, 3]

        Arrays.stream(result).forEach(System.out::println);
    }
}

class Solution48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            Arrays.stream(temp).forEach(System.out::println);
            System.out.println();
            result[i] = temp[commands[i][2] - 1];
        }
        return result;
    }
}
