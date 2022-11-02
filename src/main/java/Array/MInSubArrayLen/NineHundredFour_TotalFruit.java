package Array.MInSubArrayLen;

import java.util.HashMap;
import java.util.Map;

public class NineHundredFour_TotalFruit {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(totalFruit(nums));
    }

    public static int totalFruit(int[] fruits) {
        int basket = 2, j = 0, result = 0, count = 0;
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < fruits.length; i++) {
            if (hashtable.containsKey(fruits[i])) {
                hashtable.put(fruits[i], hashtable.get(fruits[i]) + 1);
            } else {
                hashtable.put(fruits[i], 1);
                basket--;
            }
            count++;
            if (basket >= 0)
                result = count > result ? count : result;
            while (basket < 0) {
                hashtable.put(fruits[j], hashtable.get(fruits[j]) - 1);
                if (hashtable.get(fruits[j]) == 0) {
                    hashtable.remove(fruits[j]);
                    basket++;
                }
                count--;
                j++;
            }
        }
        return result;
    }
}
