package org.leetcode.palindrome;

import org.springframework.util.StringUtils;

import java.util.*;
import java.util.regex.Pattern;
//Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.
class BaseClass {
    public boolean isPalindrome(String s) {
        if(s.length() >= 1) {
            String matchedString = "";
            String arr [] = s.split("\\W");
            String[] list = Arrays.stream(arr).filter(c-> !c.isEmpty()).map(x -> x.toLowerCase()).toArray(String[]::new);
            if(list.length <= 0) {
                return true;
            }
            for(String str: list) {
                matchedString += str;
            }
            String text = matchedString;
            text = text.replaceAll("[^a-z0-9]", "");
            int centerIndex = text.length()/2;

            StringBuilder stringBuilder = new StringBuilder();
            if(text.length() % 2 == 0) {
            stringBuilder.append(text.substring(centerIndex, text.length()));
            } else {
            stringBuilder.append(text.substring(centerIndex+1, text.length()));
            }
            stringBuilder.reverse();

            if(text.substring(0, centerIndex).equals(stringBuilder.toString())) {
                return true;
            }
            return false;
        }else if(s.trim().equals("")) {
            return true;
        } else {
        return false;
        }
    }
}
public class PalindromeString {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.isPalindrome("ab_a"));
    }
}
