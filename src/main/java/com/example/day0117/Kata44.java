package com.example.day0117;

public class Kata44 {
    public static void main(String[] args) {
        Solution44 s = new Solution44();

//        [[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//                [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//                [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133

        int[][] a = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] b = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] c = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(s.solution(a));
        System.out.println(s.solution(b));
        System.out.println(s.solution(c));

    }
}

class Solution44 {
    public int solution(int[][] sizes) {
        int aMax = 0, bMax = 0;
        int temp;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            aMax = Math.max(aMax, sizes[i][0]);
            bMax = Math.max(bMax, sizes[i][1]);
        }
        return aMax * bMax;
    }
}