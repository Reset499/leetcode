package EveryDay.June;

public class OneThousandOneHundredSeventy {
    public static void main(String[] args) {

    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];
        int[] queriesInt = new int[queries.length];
        int[] wordsInt = new int[words.length];
        for(int i = 0;i< words.length;i++){
            wordsInt[i] = s(words[i]);
        }
        for(int i = 0;i<queries.length;i++) {
            queriesInt[i] = s(queries[i]);
            int count = 0;
            for (int j = 0;j<words.length;j++){
                if(queriesInt[i]<wordsInt[j])
                    count++;
            }
            result[i] = count;
        }
        return result;
    }
    public int s(String string){
        int[] hashmap = new int[26];
        int min = 'z';
        for(int i = 0;i<string.length();i++){
            if(string.charAt(i)<min){
                min = string.charAt(i);
                hashmap[string.charAt(i)-'a']++;
            }else if(string.charAt(i)==min) {
                hashmap[min - 'a']++;
            }
        }
        return hashmap[min-'a'];
    }
}
