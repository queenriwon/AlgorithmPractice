package com.example.day0205;

// https://school.programmers.co.kr/learn/courses/30/lessons/160586

//["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
//["AA"]	["B"]	[-1]
//["AGZ", "BSSS"]	["ASA","BGZ"]	[4, 6]
/*
["ABACD", "BCEFD"], ["ABCD","AABB"] # 9, 4
["ABACD", "BCEFD"], ["ABCD","DG", "AABB"] # 9, -1, 4
["AGZ", "BSSS"], ["ASA","BGZ"] # 4, 6
["ABCDE"], ["FGHIJ"] # -1
["AA"], ["B"] # -1
["ABC"], ["DA"] # -1
["ABC"], ["AD"] # -1
 */

import java.util.*;

public class Kata66 {
    public static void main(String[] args) {
        Solution66 s = new Solution66();

        for (int i : s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : s.solution(new String[]{"AA"}, new String[]{"B"})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : s.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","DG", "AABB"})) {
            System.out.print(i + " ");
        }

    }
}


class Solution66 {
    public int[] solution(String[] keymap, String[] targets) {

        List<Integer> list = new ArrayList<>();

        for (String target : targets) {
            int result = 0;
            char[] charArray = target.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                TreeSet<Integer> set = new TreeSet<>();
                boolean found = false;
                for (int j = 0; j < keymap.length; j++) {
                    if (keymap[j].contains(String.valueOf(charArray[i]))) {
                        set.add(keymap[j].indexOf(String.valueOf(charArray[i])) + 1);
                        found = true;
                    }
                }
                if (!found) {
                    result = -1;
                    break;
                }
                result += set.isEmpty() ? 0 : set.first();
            }
            list.add(result);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
