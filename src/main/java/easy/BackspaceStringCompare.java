package easy;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        backspaceProcessing(s, sBuilder);
        backspaceProcessing(t, tBuilder);
        return sBuilder.toString().contentEquals(tBuilder);
    }

    public static boolean backspaceCompareWithOneFor(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        int sCounter = s.length() - 1;
        int tCounter = t.length() - 1;
        int sSkip = 0;
        int tSkip = 0;
        while (sCounter > -1 || tCounter > -1) {
            if (sCounter > -1) {
                sSkip = updateBuilderAndGetSkip(s, sBuilder, sCounter, sSkip);
                sCounter--;
            }
            if (tCounter > -1) {
                tSkip = updateBuilderAndGetSkip(t, tBuilder, tCounter, tSkip);
                tCounter--;
            }
        }
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

    private static int updateBuilderAndGetSkip(String line, StringBuilder lineBuilder, int index, int skip) {
        if (line.charAt(index) == '#') {
            skip++;
        } else if (skip == 0) {
            lineBuilder.append(line.charAt(index));
        } else {
            skip--;
        }
        return skip;
    }

}
