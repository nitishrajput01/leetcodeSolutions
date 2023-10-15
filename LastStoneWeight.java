package org.leetcode.laststoneweight;

import java.util.*;
import java.util.stream.Collectors;

//You are given an array of integers stones where stones[i] is the weight of the ith stone.
//
//        We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
//
//        If x == y, both stones are destroyed, and
//        If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//Example 1:
//
//        Input: stones = [2,7,4,1,8,1]
//        Output: 1
//        Explanation:
//        We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//        we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//        we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//        we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
class Base {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int left = list.size();
        while(list.size() > 1)  {
            int x = list.get(list.size() - 2);
            int y = list.get(list.size() -1);
            if(x == y) {
                list.remove(list.size()-2);
                list.remove(list.size()-1);
                Collections.sort(list);
                if(list.isEmpty()) {
                    return 0;
                }
            }
            if(x != y) {
                list.remove(list.size()-2);
                list.remove(list.size() -1);
                if(list.isEmpty()) {
                    list.add(0, y-x);
                } else {
                list.add(list.size()-1, y-x);
                }
                Collections.sort(list);
            }
        }
        return list.get(0);
    }
}
public class LastStoneWeight {
    public static void main(String[] args) {
        Base base = new Base();
        base.lastStoneWeight(new int[] {1,3});
    }
}
