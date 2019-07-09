/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

 案例:

 s = "leetcode"
 返回 0.

 s = "loveleetcode",
 返回 2.


 注意事项：您可以假定该字符串只包含小写字母。

 https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/5/strings/34/
 */
public class 字符串中的第一个唯一字符 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar2("loveleetcode"));
    }

    // 时间换空间，暴利解法，没什么参考价值
    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            boolean uniq = true;

            for (int j = 0; j < s.length(); j++) {

                if (i == j ) {
                    continue;
                }

                if (s.charAt(i) == s.charAt(j)) {
                    uniq = false;
                    break;
                }
            }

            if (uniq) {
                return i;
            }
        }

        return -1;
    }

    // 空间换时间
    public static int firstUniqChar2(String s) {

        int[] nums = new int[26];

        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (nums[s.charAt(i) - 'a'] == 1) {
                return i;
            }

        }

        return -1;
    }

}
