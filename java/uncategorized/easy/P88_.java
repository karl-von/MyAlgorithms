package uncategorized.easy;

public class P88_ {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n - 1;
        int j = n - 1;
        int i = m - 1;
        while (j >= 0 || i >= 0) {
            if (j < 0) {
                nums1[total--] = nums1[i--];
            } else if (i < 0) {
                nums1[total--] = nums2[j--];
            } else if (nums1[i] > nums2[j]) {
                nums1[total--] = nums1[i--];
            } else {
                nums1[total--] = nums2[j--];
            }
        }

    }
}
