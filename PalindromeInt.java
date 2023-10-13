package org.leetcode.palindromeint;

//Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
class Base {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reversedStr= "";
        for(int i =0; i<str.length();i++) {
            reversedStr =  str.charAt(i) + reversedStr;
        }
        if(reversedStr.equals(str)) {
            return true;
        }
        return false;
    }
}
public class PalindromeInt {

    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(base.isPalindrome(121));
    }
}

