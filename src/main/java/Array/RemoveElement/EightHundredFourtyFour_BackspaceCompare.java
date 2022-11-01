package Array.RemoveElement;

public class EightHundredFourtyFour_BackspaceCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##","c#d#"));
    }

    public static boolean backspaceCompare(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int j = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != '#') {
                chars1[j] = chars1[i];
                j++;
            }else{
                j--;
            }
        }
        j = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars2[i] != '#') {
                chars2[j] = chars2[i];
                j++;
            }else{
                j--;
            }
        }
        s = String.valueOf(chars1);
        t = String.valueOf(chars2);
        if(s.equals(t)) return true;
        else return false;
    }
}
