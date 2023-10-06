package uncategorized.easy;

public class P69 {
    public int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left+(right-left)/2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                if((mid+1)*(mid+1)>x){
                    return mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        P69 p69 = new P69();
        System.out.println(p69.mySqrt(2147395599));
    }
}
