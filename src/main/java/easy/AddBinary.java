package easy;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int resultLength = aLength;
        if (aLength > bLength) {
            b = "0".repeat(resultLength - bLength) + b;
        } else if (bLength > aLength) {
            resultLength = bLength;
            a = "0".repeat(resultLength - aLength) + a;
        }

        int carry = 0;
        StringBuilder result = new StringBuilder(resultLength);
        for (int i = resultLength - 1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry > 0) {
                    result.append('1');
                } else {
                    result.append('0');
                    carry++;
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '1') {
                if (carry > 0) {
                    result.append('0');
                } else {
                    result.append('1');
                }
            } else if (a.charAt(i) == '1' && b.charAt(i) == '0') {
                if (carry > 0) {
                    result.append('0');
                } else {
                    result.append('1');
                }
            } else {
                if (carry > 0) {
                    result.append('1');
                    carry--;
                } else {
                    result.append('0');
                }
            }
        }
        if (carry != 0) {
            result.append("1".repeat(carry));
        }
        return result.reverse().toString();
    }

}
