package org.leetcode.lastwordlength;
//Example 1:
//
//        Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.
//        Example 2:
//
//        Input: s = "   fly me   to   the moon  "
//        Output: 4
//        Explanation: The last word is "moon" with length 4.
//        Example 3:
//
//        Input: s = "luffy is still joyboy"
//        Output: 6
//        Explanation: The last word is "joyboy" with length 6.

class BaseClass {
    public int lengthOfLastWord(String s) {
        if(s.trim().length() == 1) {
            return 1;
        }
        if(s.length() > 1) {
            String trimstr = s.trim();
            int getLastIndex = trimstr.lastIndexOf(" ");
            if(getLastIndex > -1) {
            int output = s.substring(getLastIndex, trimstr.length()-1).length();
            return output;
            } else {
                int output = trimstr.length();
                return output;
            }
        }
        return 0;
    }
}
public class LastWordLength {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.lengthOfLastWord("    day"));
    }
}
