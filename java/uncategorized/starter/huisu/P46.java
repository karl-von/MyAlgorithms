package uncategorized.starter.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class P46 {
    List<List<Integer>> lists = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < nums.length; i++){
        }
        return lists;
    }


    void hs(int length, int[] nums){
        if (path.size() == length) {
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i=0; i<length; ++i) {
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            hs(length,nums);
            path.removeLast();
        }
    }
    }

