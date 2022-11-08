package HashTable.Anagrams;

import javax.print.DocFlavor;
import java.sql.Array;
import java.util.*;

public class FortyTwo_groupAnagrams {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> hashtable = new HashMap<String, List<String>>();
//        for (String str : strs) {
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars);
//            String key = new String(chars);
//            List<String> list = hashtable.getOrDefault(key,new ArrayList<String>());
//            list.add(str);
//            hashtable.put(key,list);
//        }
//        return new ArrayList<List<String>>(hashtable.values());

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++)
                count[str.charAt(i) - 'a']++;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    stringBuffer.append((char) (i + 'a'));
                    stringBuffer.append(count[i]);
                }
            }
            String key = stringBuffer.toString();
            List<String> list = new ArrayList<>();
            list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
