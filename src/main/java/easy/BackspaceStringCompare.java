package easy;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        backspaceProcessing(s, sBuilder);
        backspaceProcessing(t, tBuilder);
        return sBuilder.toString().contentEquals(tBuilder);
    }

    private static void backspaceProcessing(String line, StringBuilder sBuilder) {
        int skip = 0;
        for (int i = line.length() - 1; i >= 0; i--) {
            if (line.charAt(i) == '#') {
                skip++;
            } else if (skip == 0) {
                sBuilder.append(line.charAt(i));
            } else {
                skip--;
            }
        }
    }
}
