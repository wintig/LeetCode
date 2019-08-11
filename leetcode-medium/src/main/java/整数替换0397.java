
public class 整数替换0397 {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(5 & 2);

        System.out.println(integerReplacement(8));
    }

    public static int integerReplacement(int n) {

        int count = 0;
        long m = n;

        while (m != 1) {

            if (m % 2 == 0) {
                n >>= 1;
                m >>= 1;
            } else if (m == 3) {
                return count + 2;
            } else if ((m & 2) == 2) {  //(m & 2) == 2 等价于 ( (m+1)/2 ) % 2 == 0     就是说加一后可以被2整除两次
                m += 1;
            } else {
                m -= 1;
            }

            count ++;
        }

        return count;
    }

}
