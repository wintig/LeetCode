package com.wintig.array;

import java.util.HashMap;
import java.util.Map;

/**
 给定一个整数数组，判断是否存在重复元素。

 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

 示例 1:

 输入: [1,2,3,1]
 输出: true
 示例 2:

 输入: [1,2,3,4]
 输出: false
 示例 3:

 输入: [1,1,1,3,3,4,3,2,4,2]
 输出: true

 https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
public class 存在重复 {

    public static void main(String[] args) {


        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int num : nums) {

            Boolean exist = map.get(num);

            if (exist != null) {
                return true;
            } else {
                map.put(num, true);
            }
        }

        return false;
    }

}
