package com.example.day0129;

// https://school.programmers.co.kr/learn/courses/30/lessons/77484

/*
[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
 */
public class Kata61 {
    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();

        int[] result1 = solution61.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        int[] result2 = solution61.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        int[] result3 = solution61.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : result3) {
            System.out.print(i + " ");
        }
    }
}

class Solution61 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int countMatch = 0;
        int count0 = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                count0++;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    countMatch++; break;
                }
            }
        }
        int minRank = Math.min(7 - countMatch, 6);
        int maxRank = Math.max(minRank - count0, 1);

        int[] answer = {maxRank, minRank};
        return answer;
    }
}
