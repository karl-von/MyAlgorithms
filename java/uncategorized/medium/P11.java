package uncategorized.medium;

public class P11 {
    public int maxArea(int[] height) {
        int len = height.length, j = len - 1, i = 0;
        int big = 0;
        while (j > i) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            big = Math.max(h * w, big);
            if (height[i] < height[j]) {
                i++;
            }else {
                j++;
            }
        }
        return big;
//        if (height.length <= 1) {
//            return 0;
//        }
//        while (j >= 1) {
//            for (int i = 0; i < len; i++) {
//                int h = Math.min(height[i], height[j]);
//                int w = j - i;
//                big = Math.max(h * w, big);
//            }
//            j--;
//        }
//        return big;
    }
}
