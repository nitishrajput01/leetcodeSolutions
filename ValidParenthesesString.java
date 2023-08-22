package org.leetcode.validparentheses;

//Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false

// Input: s = "{[]}"
// output : true

import java.util.Arrays;
import java.util.regex.Pattern;

class BaseClass {

    public boolean isValid(String s) {

        String str [] = s.split("");

        boolean isMacthed = Arrays.stream(str).allMatch(s1 -> s1.equals("{") || s1.equals("}") || s1.equals("(") || s1.equals(")") || s1.equals("[") || s1.equals("]"));

        if(isMacthed && str.length % 2 == 0) {

            for(int i =0 ;i<str.length; i++) {

                switch (str[i]){
                    case "(":
                        if(str[i+1].equals(")")){
                            break;
                        } else if(str[str.length-1].equals(")")) {
                            break;
                        } else {
                            return false;
                        }
                    case "[":
                        if(str[i+1].equals("]")){
                            break;
                        } else if(str[str.length-1].equals("]")) {
                            break;
                        } else {
                            return false;
                        }
                    case "{":
                        if(str[i+1].equals("}")){
                            break;
                        } else if(str[str.length-1].equals("}")) {
                            break;
                        } else {
                            return false;
                        }

                    case "}":
                        if(i > 0 && str[i-1].equals("{")) {
                            break;
                        } else if(str[0].equals("{")) {
                            break;
                        } else {
                            return false;
                        }


                    case ")":
                        if(i > 0 && str[i-1].equals("(")) {
                            break;
                        } else if(str[0].equals("(")) {
                            break;
                        } else {
                            return false;
                        }

                    case "]":
                        if(i > 0 && str[i-1].equals("[")) {
                            break;
                        } else if(str[0].equals("[")) {
                            break;
                        } else {
                            return false;
                        }
                    default:
                        return true;
                }
            }

        } else {
            return false;
        }

        return true;
    }
}
public class ValidParenthesesString {

    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass();

        boolean b = baseClass.isValid("{[]}");

        System.out.println(b);

    }
}
