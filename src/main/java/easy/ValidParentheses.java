package easy;

import java.util.ArrayDeque;

public class ValidParentheses {
    // 15ms
    public boolean isValidWithStringBuilder(String s) {
        StringBuilder brackets = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            int i1 = brackets.indexOf("()");
            if (i1 >= 0) {
                brackets.replace(i1, i1 + 2, "");
            }
            int i2 = brackets.indexOf("[]");
            if (i2 >= 0) {
                brackets.replace(i2, i2 + 2, "");
            }
            int i3 = brackets.indexOf("{}");
            if (i3 >= 0) {
                brackets.replace(i3, i3 + 2, "");
            }

            if (brackets.isEmpty() || brackets.length() % 2 == 1) {
                break;
            }

        }
        return brackets.isEmpty();
    }

    // 32ms
    public boolean isValidWithString(String row) {
        String kv = "[]";
        String fg = "{}";
        String gl = "()";

        // Process the string as long as there are any pairs of brackets to remove
        boolean changed;
        do {
            int lenBefore = row.length();
            row = row.replace(kv, "");
            row = row.replace(fg, "");
            row = row.replace(gl, "");
            int lenAfter = row.length();
            changed = lenBefore != lenAfter;
        } while (changed);

        return row.isEmpty();
    }

    // 1ms - the best
    public boolean isValidWithStack(String brackets) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openingBracket = stack.pop();

                if (openingBracket == '(' && bracket == ')') {
                    continue;
                }
                if (openingBracket == '{' && bracket == '}') {
                    continue;
                }
                if (openingBracket == '[' && bracket == ']') {
                    continue;
                }
                return false;
            }
        }

        return stack.isEmpty();
    }
}
