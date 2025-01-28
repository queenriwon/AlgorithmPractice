package com.example.day0128;

//https://school.programmers.co.kr/learn/courses/30/lessons/161989


public class Kata59 {
    public static void main(String[] args) {
        Solution59 s = new Solution59();

        int result = s.solution(8, 4, new int[]{2, 3, 6});          //2
        System.out.println(result);
        System.out.println(s.solution(5, 4, new int[]{1, 3}));      //1
        System.out.println(s.solution(4, 1, new int[]{1, 2, 3, 4}));//4
        System.out.println(s.solution(8, 2, new int[]{2, 6}));      //2
        System.out.println(s.solution(4, 2, new int[]{3, 4}));      //1
        System.out.println(s.solution(5, 2, new int[]{1, 4, 5}));      //2


    }
}

// 1, 2, 3, 4, 5, 6, 7, 8 의 배열이 있으면
// [1, 2, 3, 4], 5, 6, 7, 8 처럼 배열이 생기도록 만드는 방법
// 근데 만약 section이 2,3,6 이라면
// 2, 3, 4, 5, 6 까지만 배열을 만든뒤
// [2, 3, 4, 5], 6 같은 배열을 만들면 된다.
// 근데 만약 m이 4가 아닌 2라면?
// [2, 3], [4, 5], 6 처럼 배열을 만들어줘야하지 않을까?
// 그리고 만약 section이 2,6 이라면
// [2, 3], 4, 5, [6, 7] 처럼 중간을 칠해줄 이유가 없다.

// 1, 2, 3, 4, 5 일 경우 1, 3  / 4칸씩
// 1, 2, 3, 4 일 경우 1, 2, 3, 4  / 1칸씩


class Solution59 {
    public int solution(int n, int m, int[] section) {

        int count = 0;
        int j = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] <= j) continue;
            j = section[i] + m - 1; //칠해진 곳 까지
            count++;
        }

        return count;
    }
}