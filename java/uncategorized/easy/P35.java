package uncategorized.easy;

public class P35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left<right) {
            int mid = (left + right) /2;
            if (target < nums[mid]) {
                right = mid-1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
return 0;

//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==target){
//                return i;
//            }
//            if(nums[i]>target){
//                return --i;
//            }
//        }
//        return nums.length;
    }
}
