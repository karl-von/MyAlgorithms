package uncategorized.easy;

public class P27 {
    public int removeElement(int[] nums, int val) {
        int total = 0, len = nums.length;
        if (len == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] != val) {
                    total++;
                    if (j == len - 1 && nums[j] != val) {
                        total++;
                    }
                    break;
                } else {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        total++;
                        i++;
                    }
                }

            }
        }
        return total;
    }

    public static void main(String[] args) {
        P27 p27 = new P27();
//        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int[] arr = new int[]{3, 2, 2, 3};
        p27.removeElement(arr, 2);
    }
}
