
/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
 示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 注意:

 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

 https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/
 */
public class 整数反转 {

    public static void main(String[] args) {
        System.out.println(reverse(901000));
    }

    public static int reverse(int x) {

        if (0 == x) {
            return 0;
        }

        String reverse = x + "";
        StringBuffer result = new StringBuffer();

        if (x < 0) {
            result.append("-");
        }

        boolean isLast = false;
        for (int i = reverse.length() - 1; i >= 0 ; i--) {
            if (reverse.charAt(i) == '-') {
                continue;
            }

            if (reverse.charAt(i) == '0' && !isLast) {
                continue;
            }

            result.append(reverse.charAt(i));
            isLast = true;
        }

        int resultInt;

        try {
            resultInt = Integer.parseInt(result.toString());
        } catch (Exception e) {
            resultInt = 0;
        }

        return resultInt;
    }

}
