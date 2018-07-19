package com.wintig.array;

/**
 *
 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。

 示例 1:

 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。
 示例 2:

 输入: [4,3,2,1]
 输出: [4,3,2,2]
 解释: 输入数组表示数字 4321。

 https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/

 * @author shitian
 * @create 2018-07-19 下午9:45
 */
public class 加一 {

    public static void main(String[] args) {

        //int[] digits = {1, 2, 3, 4};

        int[] digits = {9, 9, 9, 9};


        for (int digit :  plusOne(digits)) {
            System.out.print(digit);
        }
    }



    public static int[] plusOne(int[] digits) {

        boolean plusFlag = true;   //标记下一位是否进位

        for (int i = digits.length - 1; i >= 0 ; i--) {

            if (digits[i] == 9 && plusFlag) {
                digits[i] = 0;
                plusFlag = true;
            } else if (plusFlag){
                digits[i] += 1;
                plusFlag = false;
            }
        }

        if (plusFlag) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            newDigits[1] = 0;

            for (int i = 2; i < digits.length; i++) {
                newDigits[i] = digits[i];
            }

            return newDigits;
        }

        return digits;
    }

}













