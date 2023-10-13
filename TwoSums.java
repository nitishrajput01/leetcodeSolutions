package org.leetcode.twosums;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
class BaseClass {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        while(left < nums.length) {
            for(int i=left; i<nums.length; i++) {
                if(i<nums.length-1 && nums[left] + nums[i+1] == target) {
                    return new int[] {left, i+1};
                }
            }
            left++;
        }
        return new int[] {0,0};
    }
}
public class TwoSums {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        baseClass.twoSum(new int[]{3,2,3}, 6);
    }
}
