package uncategorized.starter.huisu;

import java.util.ArrayList;
import java.util.List;

public class P401 {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++){
            int minute = Integer.bitCount(i);
//            if (minute > turnedOn) {
//                continue;
//            }
            for (int j = 0; j < 60; j++){
                int second = Integer.bitCount(j);
//                if (second > turnedOn) {
//                    continue;
//                }
                if (minute + second == turnedOn){
                    list.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return list;
    }
}
