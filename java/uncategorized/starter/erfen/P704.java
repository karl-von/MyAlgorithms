package uncategorized.starter.erfen;

import java.util.ArrayList;
import java.util.List;

public class P704 {

    public int search(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
