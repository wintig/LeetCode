package com.wintig.array;

/**
 *
 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

 eg:
 给定数组 nums = [1,1,2],

 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

 你不需要考虑数组中超出新长度后面的元素。

 https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
public class 从排序数组中删除重复项 {


    public static void main(String[] args) {

        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,2,3,3,4,4};

        //int[] nums = {1,1};

        System.out.println(从排序数组中删除重复项.removeDuplicates(nums));
    }

    /**
     * 因为是递增的数组，可以把问题转化成，求一个list中有多少段数据的问题
     * 123344  可以看成 1/2/33/44 这四段
     */
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Integer count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[count-1]) {
                nums[count] = nums[i];
                count++;
            }

        }
        
        return count;
    }


}
