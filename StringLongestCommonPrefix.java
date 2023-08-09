package org.leetcode;

import java.util.*;

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
public class StringLongestCommonPrefix {
    public String longestCommonPrefix(String[] str) throws ArrayIndexOutOfBoundsException {
        try {
            String[] matchedStr = new String[str.length - 1];
            if (str.length > 1 && str.length <= 200) {
                int i = 0;
                String newMatchedStr = "";
                outerloop:
                for (String name : str) {
                    int j = 0;
                    char[] ch = name.toCharArray();
                    if (ch.length <= 200 && str.length - 1 != i) {
                        i++;
                        innerloop:
                        for (char c : ch) {
                            String toStr = Character.toString(c);
                            if ((str[i].length() > j) && (c == str[i].charAt(j))) {
                                newMatchedStr += toStr;
                                matchedStr[i - 1] = newMatchedStr;
                            } else {
                                newMatchedStr = "";
                                break innerloop;
                            }
                            j++;
                        }
                    }
                }

                if (matchedStr.length > 0) {
                    boolean isEmpty = true;
                    for (String s : matchedStr) {
                        if (s == null) {
                            return "";
                        }
                    }

                    return Arrays.stream(matchedStr).filter(Objects::nonNull).min(Comparator.comparing(String::length)).get();

                } else {
                    return "";
                }
            }

            if (str.length == 1) {
                return str[0];
            }
            return "";
        }catch (ArrayIndexOutOfBoundsException exe) {
            System.out.println(exe.getMessage());
        }
        return "";
    }

    public static void main(String[] args) {
        String out = new StringLongestCommonPrefix().longestCommonPrefix(new String[]{"aab","aabb","aaa"});
        System.out.println(out);
    }
}
