package com.wintig.array;

import java.util.*;

/**
 *
 给定两个数组，写一个方法来计算它们的交集。

 例如:
 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].

 注意：

 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 我们可以不考虑输出结果的顺序。
 跟进:

 如果给定的数组已经排好序呢？你将如何优化你的算法？
 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * @author shitian
 * @create 2018-07-16 下午9:54
 */
public class 两个数组的交集2 {


    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    /**
     * 爆力解法
     */
    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for (int i : nums1) {
            Integer value = numMap.get(i);
            numMap.put(i, value == null ? 1 : value + 1);
        }

        for (int i : nums2) {

            if (numMap.containsKey(i) && numMap.get(i) != 0) {
                result.add(i);
                numMap.put(i, numMap.get(i) - 1);
            }

        }

        int[] resultIntArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultIntArray[i] = result.get(i);
        }
        
        return resultIntArray;
    }


}
