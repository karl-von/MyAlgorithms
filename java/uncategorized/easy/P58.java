package uncategorized.easy;

public class P58 {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String result = s1[s1.length-1];
        return result.length();
    }
}
