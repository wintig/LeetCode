package com.wintig.array;

/**
 *
 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 示例:

 输入: [0,1,0,3,12]
 输出: [1,3,12,0,0]
 说明:

 必须在原数组上操作，不能拷贝额外的数组。
 尽量减少操作次数。

 *
 * @author shitian
 * @create 2018-07-20 下午11:00
 */
public class 移动零 {


    public static void main(String[] args) {

        int[] nums = new int[]{1,0,2,1,0,3};
        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num);
        }
    }

    public static void moveZeroes(int[] nums) {

        int leftZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                if (i > leftZeroIndex) {
                    nums[leftZeroIndex] = nums[i];
                    nums[i] = 0;
                }

                leftZeroIndex++;
            }
        }
    }

}
