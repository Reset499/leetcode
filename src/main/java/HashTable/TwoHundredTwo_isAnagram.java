package HashTable;

public class TwoHundredTwo_isAnagram {
    public static void main(String[] args) {
        String t = "cat";
        String s = "car";
        isAnagram(s,t);
    }

    public static boolean isAnagram(String s, String t) {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            table[index] = table[index] + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            table[index] = table[index] - 1;
        }
        for(int each:table){
            if(each!=0) return false;
        }
        return true;
    }
}
