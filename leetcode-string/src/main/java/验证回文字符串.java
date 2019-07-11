/**
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

 说明：本题中，我们将空字符串定义为有效的回文串。

 示例 1:

 输入: "A man, a plan, a canal: Panama"
 输出: true
 示例 2:

 输入: "race a car"
 输出: false
 */
public class 验证回文字符串 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("ab"));

    }

    public static boolean isPalindrome(String s) {

        if (null == s || s.equals("") || s.length() == 1) {
            return true;
        }

        // 先全部变成小写
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(s.charAt(i));
            }
        }

        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
