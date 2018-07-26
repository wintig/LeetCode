package com.wintig.array;

/**
 *
 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 * @author shitian
 * @create 2018-07-26 下午9:17
 */
public class 两数之和 {

    public static void main(String[] args) {

        int[] nums = {0, 4, 3, 0};
        int target = 0;

        for (int i : twoSum(nums, target)) {
            System.out.print(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int firstIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            int j = 0;
            while (j < nums.length) {

                if (j == firstIndex) {
                    j++;
                    continue;
                }

                if (nums[firstIndex] + nums[j] == target) {
                    int[] array = {firstIndex, j};
                    return array;
                }
                j++;
            }
            firstIndex++;
        }

        return nums;
    }

}
