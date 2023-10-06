package uncategorized.medium;

public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return getResult(nums, mid, target);
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    private int[] getResult(int[] nums, int mid, int target) {
        int[] result = new int[2];
        int left = --mid, right = ++mid;
        boolean l = true, r = true;
        while (l || r) {
            if (left < 0 || nums[left] != target) {
                result[0] = left + 1;
                l = false;
            } else if (nums[left] == target) {
                left--;
            }
            if (right == nums.length || nums[right] != target) {
                result[1] = right - 1;
                r = false;
            } else if (nums[right] == target) {
                right++;
            }
        }
        return result;
    }
}
