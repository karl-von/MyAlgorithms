package uncategorized.starter.other;


import java.util.Arrays;

public class P34  {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                result[0] = i;
                if(i+1 >= nums.length){
                    result[1] = i;
                    return result;
                }
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=target){
                        result[1] = j-1;
                        return result;
                    }
                }
            }
        }
        Arrays.fill(result,-1);
        return result;
    }
}
