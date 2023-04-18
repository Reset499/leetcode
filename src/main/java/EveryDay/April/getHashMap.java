package EveryDay.April;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class getHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map  = new HashMap<>();
        map.put(3,3);
        map.put(2,2);
        map.put(1,1);
        map.put(4,4);
        map.put(5,5);
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey());
        }
    }
}
