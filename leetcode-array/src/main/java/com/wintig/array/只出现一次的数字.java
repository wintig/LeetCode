package com.wintig.array;

/**
 *
 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

 说明：

 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

 示例 1:

 输入: [2,2,1]
 输出: 1

 示例 2:
 输入: [4,1,2,1,2]
 输出: 4
 */
public class 只出现一次的数字 {

    public static void main(String[] args) {

        //System.out.println(4^4);

        int[] nums = {2,2,1};

        System.out.println(singleNumber(nums));

    }

    /**
     * 使用 ^ 异或运算符
     */
    public static int singleNumber(int[] nums) {

        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }

        return num;
    }

}
