package uncategorized.starter.other;

import java.util.Arrays;
import java.util.Stack;

public class P739 {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        Arrays.fill(arr,0);
        for (int i = 0; i < temperatures.length; i++) {
            if(stack.isEmpty()){
                stack.add(i);
            }else{
                if(temperatures[stack.peek()]<temperatures[i]){
                    int tar = stack.pop();
                    arr[tar] = i - tar;
                }
                stack.add(i);
            }
        }
        return arr;
    }
//        int[] arr = new int[temperatures.length];
//        for (int i = 0; i < temperatures.length-1; i++) {
//            dfs(temperatures[i],i,temperatures,arr);
//        }
//        arr[arr.length-1] = 0;
//        return arr;
//    }
//    void dfs(int i, int index, int[] temperatures, int[] arr){
//        for (int j = index+1; j < temperatures.length; j++) {
//            if(temperatures[j]>i){
//                arr[index]=j - index;
//                break;
//            }
//        }
//    }
}
