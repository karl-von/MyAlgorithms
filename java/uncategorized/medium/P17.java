package uncategorized.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17 {
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        tool(digits, map, 0, new StringBuilder());
        return result;
    }

    private void tool(String digits, Map<Character, char[]> map, int step, StringBuilder path) {
        int len = digits.length();
        if (path.length() == len) {
            result.add(path.toString());
            return;
        }

//        for (int i = 0; i < len; i++) {
                char[] chars = map.get(digits.charAt(step));
                for (int j = 0; j < chars.length; j++) {
                    path.append(chars[j]);
                    tool(digits, map, step+1, path);
                    path.delete(path.length() - 1, path.length());
                }
//        }
    }

    public static void main(String[] args) {
        P17 p17 = new P17();
        List<String> strings = p17.letterCombinations("23");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
