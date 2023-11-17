package problems.leetcode.grind75.binary;

public class AddBinary {

    // 101
    // 1
    public String addBinary(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) return "";
        StringBuilder builder = new StringBuilder();

        int length = Math.max(a.length(), b.length());
        int carry = 0;
        for (int i = 0; i < length; i++) {
            if (i < a.length() && a.charAt(a.length() - 1 - i) == '1') carry++;
            if (i < b.length() && b.charAt(b.length() - 1 - i) == '1') carry++;

            switch (carry) {
                case 0 -> builder.append('0');
                case 1 -> {
                    builder.append('1');
                    carry = 0;
                }
                case 2 -> {
                    builder.append('0');
                    carry = 1;
                }
                case 3 -> {
                    builder.append('1');
                    carry = 1;
                }
            }
        }
        if (carry == 1) builder.append('1');

        return builder.reverse().toString();
    }
}
