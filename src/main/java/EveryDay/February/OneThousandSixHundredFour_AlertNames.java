package EveryDay.February;

import java.time.LocalDateTime;
import java.util.*;

public class OneThousandSixHundredFour_AlertNames {
    public static void main(String[] args) {
//        System.out.println(alertNames(new String[]{"daniel","daniel","daniel","luis","luis","luis","luis"},
//                new String[]{"10:00","10:40","11:00","09:00","11:00","13:00","15:00"}));
    }

    public  List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String,List<Integer>> timeMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(int i = 0;i<keyName.length;i++){
            timeMap.putIfAbsent(keyName[i],new ArrayList<>());
            int hour = (keyTime[i].charAt(0)-'0')*10+keyTime[i].charAt(1)-'0';
            int min = (keyTime[i].charAt(3)-'0')*10+keyTime[i].charAt(4)-'0';
            timeMap.get(keyName[i]).add(hour*60+min);
        }
        for(String name: timeMap.keySet()){
            List<Integer> list = timeMap.get(name);
            Collections.sort(list);
            for(int i = 2;i<list.size();i++){
                if(list.get(i)-list.get(i-2)<=60){
                    result.add(name);
                    break;
                }
            }
        }
        Collections.sort(result);
        return result;
    }

}
