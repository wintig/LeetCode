
public class 合并两个有序数组0088 {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        merge(num1, m, num2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0, j = 0; i < n; i++) {
            if (nums2[i] >= nums1[j]) {
                for (int k = m; k > j ; k--) {
                    nums1[k] = nums1[k - 1];
                }
                nums1[j + 1] = nums2[i];
                j++;
            }
            j++;
        }

    }

}
