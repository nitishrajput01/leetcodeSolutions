package org.leetcode.firstoccurence.string;
class BaseClassSolution {
    public int strStr(String haystack, String needle) {
        String stringArr[] = new String[haystack.length() ];

        if(haystack.length() == 1 && needle.length() == 0) {
            return -1;
        }

        if(haystack.length() >= 1 && needle.length() <= 10000) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        BaseClassSolution baseClassSolution = new BaseClassSolution();
        int index = baseClassSolution.strStr("mississippi", "issip");
        System.out.println(index);
    }
}
