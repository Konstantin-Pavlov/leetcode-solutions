package easy;

public class IsOneSetIncludedInAnother {
    public boolean canConstruct(String ransomNote, String magazine) {
        int charFrequency[] = new int[26];

        for (char character : ransomNote.toCharArray()) {
            int index = magazine.indexOf(character, charFrequency[character - 97]);
            if (index == -1) {
                return false;
            } else {
                charFrequency[character - 97] = index + 1;
            }
        }
        return true;
    }
}

