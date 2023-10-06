package uncategorized.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P3 {
    public int lengthOfLongestSubstring(String s) {
return 0;
//        int index = 0;
//        String[] split = s.split("");
//        for (int i = 0; i < split.length - 1; i++) {
//            Map<String, String> map = new HashMap<>();
//            map.put(split[i], split[i]);
//            for (int j = i + 1; j < split.length; j++) {
//                String str = split[j];
//                if (map.containsKey(str)) {
//                    i = j - 1;
//                    break;
//                }else {
//                    map.put(str,str);
//                }
//            }
//            if (map.size() > index) {
//                index = map.size();
//            }
//        }
//        return index;
    }

    public static void main(String[] args) {
        P3 p3 = new P3();
        int i = p3.lengthOfLongestSubstring("cdd");
        System.out.println(i);
    }
}
