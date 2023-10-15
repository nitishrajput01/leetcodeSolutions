package org.leetcode.medianarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//        The overall run time complexity should be O(log (m+n)).
//
//
//
//        Example 1:
//
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//        Example 2:
//
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
class Base {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mergedArray = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
        Arrays.sort(mergedArray);
        if(mergedArray.length % 2 !=0) {
            int middleIndex = mergedArray.length / 2;
            return  Math.round((double)mergedArray[middleIndex] * 10000) / 10000.0;
        }
        int middleIndex = mergedArray.length / 2;
        double meddian = (double) (mergedArray[middleIndex] +  mergedArray[middleIndex -1]) / (double)2;
        return meddian;
    }

}
public class MedianArray {
    public static void main(String[] args) {
        Base base = new Base();
        double result = base.findMedianSortedArrays(new int [] {1,2}, new int[] {3,4});
        System.out.println(result);
    }
}
