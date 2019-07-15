/**
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z 。
 */
public class 最长公共前缀 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        String[] strs3 = {};

        String[] strs4 = {"a"};

        System.out.println(longestCommonPrefix(strs4));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        int minLen = strs[0].length();
        StringBuffer result = new StringBuffer();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }

        for (int i = 0; i < minLen; i++) {
            int[] num = new int[26];
            for (int j = 0; j < strs.length; j++) {
                num[strs[j].charAt(i) - 'a']++;
            }
            if (num[strs[0].charAt(i) - 'a'] == strs.length) {
                result.append(strs[0].charAt(i));
            } else {
                return result.toString();
            }
        }

        return result.toString();
    }

}
