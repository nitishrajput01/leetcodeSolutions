package org.leetcode.defangedip;

//Example 1:
//
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"
class Base {
    public String defangIPaddr(String address) {
        String newStr = address.replaceAll("[.]", "[.]");
        System.out.println(newStr);
        return newStr;
    }
}
public class DefangedIP {

    public static void main(String[] args) {
        Base base = new Base();
        base.defangIPaddr("1.1.1.1");
    }
}
