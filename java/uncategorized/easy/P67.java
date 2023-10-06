package uncategorized.easy;

public class P67 {
    public String addBinary(String a, String b) {
        Long tar = Long.parseLong(a) + Long.parseLong(b);
        String str = tar + "";
        String[] split = str.split("");
        for (int i = split.length - 1; i > 0; i--) {
            if (split[i].equals("2")) {
                split[i] = "0";
                int ints = Integer.parseInt(split[i]);
                split[i - 1] = ints + 1 + "";
            } else if (split[i].equals("3")) {
                split[i] = "1";
                int ints = Integer.parseInt(split[i]);
                split[i - 1] = ints + 1 + "";
            }
        }
        String result = String.join("", split);
        if (result.charAt(0) == '2') {
            StringBuilder sb = new StringBuilder("1" + result);
            sb.setCharAt(1, '0');
            return sb.toString();
        } else if (result.charAt(0) == '3') {
            StringBuilder sb = new StringBuilder("1" + result);
            sb.setCharAt(1, '1');
            return sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        P67 p67 = new P67();
        p67.addBinary("1110110101","1110111011");
    }
}
