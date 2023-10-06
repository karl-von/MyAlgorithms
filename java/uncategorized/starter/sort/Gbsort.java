package uncategorized.starter.sort;

public class Gbsort {
    final int LENGTH = 10;
    public int[] sortArray(int[] nums) {
        int length = nums.length;
        int[] temp = new int[length];
        runSort(nums,0, length-1 , temp);
        return nums;
    }
    private void runSort(int[] nums, int left, int right,int[] temp){
        if(nums.length < LENGTH){
            inputsort(nums);
            return;
        }
        int mid = (left + right) >>>1;
        runSort(nums, left, mid, temp);
        runSort(nums, mid + 1, right, temp);
        if(nums[mid]<nums[mid+1]){
            return;
        }
        magerTwo(nums, left, mid, right,temp);
    }
    void magerTwo(int[] nums, int left, int mid, int right, int[] temp){
//        System.arraycopy(nums, left, temp, left, right + 1 - left);
        System.arraycopy(nums, left, temp, left, right + 1 - left);

        int i = left;
        int j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                // 注意写成 < 就丢失了稳定性（相同元素原来靠前的排序以后依然靠前）
                nums[k] = temp[i];
                i++;
            } else {
                // temp[i] > temp[j]
                nums[k] = temp[j];
                j++;
            }
        }
    }

    void inputsort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i;
            while(j > 0 && nums[j - 1] > temp){
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
        }
    }
}
