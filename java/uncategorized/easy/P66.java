package uncategorized.easy;

import java.util.Arrays;

public class P66 {
    public int[] plusOne(int[] digits) {
        boolean isAdd = true;
        if (digits[digits.length - 1] == 9) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    isAdd = false;
                    digits[i]++;
                    break;
                }
            }
            if (isAdd) {
                int[] result = new int[digits.length];
                Arrays.fill(result, 0);
                result[0] = 1;
                return result;
            }
        } else {
            digits[digits.length - 1] += 1;
        }
        return digits;
    }
}
