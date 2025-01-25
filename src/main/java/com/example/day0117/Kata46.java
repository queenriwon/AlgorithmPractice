package com.example.day0117;

//"one4seveneight"	1478
//"23four5six7"	234567
//"2three45sixseven"	234567
//"123"	123

import java.util.Arrays;

public class Kata46 {
    public static void main(String[] args) {
        Solution46 s = new Solution46();

        System.out.println(s.solution("one4seveneight"));
    }
}

class Solution46 {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        String[] ss = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < ss.length; i++) {
            int index;
            while (sb.indexOf(ss[i]) != -1){
                index = sb.indexOf(ss[i]);
                sb.replace(index, index + ss[i].length(), String.valueOf(i));
            }
        }
        return Integer.parseInt(sb.toString());

//        for (int i = 0; i<s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                for (int k = 0; k<ss.length; k++) {
//                    String sbSubstring = sb.substring(i,j);
//                    if (sbSubstring.equals(ss[k])) {
//                        sb.replace(i,j, String.valueOf(k));
//                    }
//                    System.out.println(sbSubstring);
//                }
//            }
//        }
//        return Integer.parseInt(sb.toString());
    }
}

