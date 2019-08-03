
public class 非递减数列0665 {

    public static void main(String[] args) {
        //int[] nums = {4, 2, 3};     // true
        int[] nums = {4, 2, 1};    // false
        //int[] nums = {3, 4, 2, 3};      // false
        System.out.println(checkPossibility(nums));
    }


    /**
     * 这道题看起来简单，其实比较的4个元素的位置关系
     *
     * 当数组元素个数为3个的时候，很好比较 [4, 2, 1] 如果num[0] < num[1]这时候使用改变机会。然后当num[2] < num[1]的时候，我们的change机会已经使用了，那么直接出结果了
     *
     * 当数组元素为4个的时候[3, 4, 2, 3]  当num[1] < num[2]的时候，好了我们直接使用跳过机会吗？你如果跳过后，你会发现num[2] < num[3]他是成立的，但是整个数列不是成立的了
     * 所以我们不能单单的把题目中给的一次机会称谓跳过机会，而是改变机会。
     *
     * 至于怎么覆盖当前位置的元素呢？肯定是和左边的元素一模一样喽。  继续回到[3, 4, 2, 3] 当检查到num[2] < num[1]，我们把num[2]换成4。
     * 这样当num[2] < num[3]这时候，就发现违背规则了
     *
     */
    public static boolean checkPossibility(int[] nums) {

        boolean change = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {

                if (change) {
                    return false;
                }

                if (i >= 2 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }

                change = true;
            }
        }

        return true;
    }

}
