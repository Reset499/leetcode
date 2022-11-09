package HashTable;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoHundredTwo_IsHappy {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = newN(n);
        }
        if(n == 1) return true;
        return false;
    }

    public static int newN(int n) {
        int result = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            result = result + temp * temp;
        }
        return result;
    }
}
