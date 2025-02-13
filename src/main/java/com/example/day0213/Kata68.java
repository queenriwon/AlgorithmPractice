package com.example.day0213;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502

/*
[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
[1, 3, 2, 1, 2, 1, 3, 1, 2]	0
 */

import java.util.Stack;

public class Kata68 {
    public static void main(String[] args) {
        Solution68B s = new Solution68B();

        System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
}

// 스택을 사용하면 뽑은거 이후에도 이어지는 해당 내용이 있는지 확인 할 수 있음
// 실행시간 단축됨
class Solution68B {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i : ingredient) {          // 넣을때마다 확인
            stack.push(i);
            if (stack.size() >= 4) {
                int size = stack.size();    // 스택 크기확인
                if (stack.get(size - 4) == 1 && stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 && stack.get(size - 1) == 1) {     // 제일마지막에 넣은 것을 순서대로 확인
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    count++;
                }
            }
        }
        return count;
    }
}


// 문자열로 인한 시간초과에러
class Solution68A {
    public int solution(int[] ingredient) {
        String hbg = "1231";

        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
        }
        int count = 0;
        while (true) {
            int indexOf = sb.indexOf(hbg);
            if (indexOf == -1) {
                break;
            }
            sb.replace(indexOf, indexOf + hbg.length(), "");
            count++;
        }
        System.out.println(sb.toString());
        return count;
    }
}

// 배열을 하나씩 늘려가면서 stack 구현
class Solution68C {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;        // 배열에서 제거하는 것은 아니고 인덱스를 활용
                answer++;
            }
        }
        return answer;
    }
}