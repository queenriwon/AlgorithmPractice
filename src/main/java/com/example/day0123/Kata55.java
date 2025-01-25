package com.example.day0123;

public class Kata55 {
    public static void main(String[] args) {
        Solution55 s = new Solution55();

        System.out.println(s.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(s.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}));

    }
}

class Solution55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int j = 0, k = 0;
        for (int i = 0; i < goal.length; i++) {
            String next = goal[i];

            if (j < cards1.length && next.equals(cards1[j])) {
                j++;
            } else if (k < cards2.length && next.equals(cards2[k])) {
                k++;
            } else return "No";
        }
        return "Yes";
    }
}
