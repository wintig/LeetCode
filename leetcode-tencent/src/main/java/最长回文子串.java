/**
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。
 示例 2：

 输入: "cbbd"
 输出: "bb"
 * https://leetcode-cn.com/explore/interview/card/tencent/221/array-and-strings/896/
 */
public class 最长回文子串 {

    public static void main(String[] args) {



    }

    public String longestPalindrome(String s) {

        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {

            if (s.charAt(leftIndex) == s.charAt(rightIndex)) {
                leftIndex ++;
                rightIndex --;
                continue;
            }

        }

        return s.substring(leftIndex, rightIndex);

    }

}
