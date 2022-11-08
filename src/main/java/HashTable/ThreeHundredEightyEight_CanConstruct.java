package HashTable;

public class ThreeHundredEightyEight_CanConstruct {
    public static void main(String[] args) {
        canConstruct("aa", "aab");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            table[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            table[magazine.charAt(i) - 'a']--;
        }
        for (int single : table) {
            if (single > 0) return false;
        }
        return true;
    }
}
