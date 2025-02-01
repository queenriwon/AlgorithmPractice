package com.example.day0129;

// https://school.programmers.co.kr/learn/courses/30/lessons/133499

/*
["aya", "yee", "u", "maa"]	1
["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	2
 */
public class Kata62 {
    public static void main(String[] args) {
        Solution62 s = new Solution62();

        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
        System.out.println(s.solution(new String[]{"ayayeayayeaya"}));
    }
}

class Solution62 {
    public int solution(String[] babbling) {
        String[] can = {"aya", "ye", "woo", "ma"};
        String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};

        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            System.out.print(babbling[i] + " ");
            for (String cantString : cant) {
                if(babbling[i].contains(cantString)){
                    babbling[i] += "1";
                }
            }
            for (String canString : can) {
                babbling[i] = babbling[i].replace(canString, "0");
            }
            System.out.println(babbling[i]);
        }
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("0", "");
            if (babbling[i].equals("")) count++;
        }
        return count;
    }
}