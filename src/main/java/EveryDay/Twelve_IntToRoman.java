package EveryDay;

import java.util.HashMap;
import java.util.Map;

public class Twelve_IntToRoman {
    public static void main(String[] args) {

    }
    public String intToRoman(int num) {
        String result  = "";
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");map.put(2,"V");map.put(3,"X");map.put(4,"L");map.put(5,"C");map.put(6,"D");map.put(7,"M");
        int level = 1;
        while(num!=0){
            String s1 = map.get(level);
            String s2 = map.get(level+1);
            switch (num%10){
                case 0:break;
                case 1:result = s1+result;
                case 2:result = s1+s1+result;
                case 3:result = s1+s1+s1+result;
                case 4:result = s1+s2+result;
                case 5:result = s2+result;
                case 6:result = s2+s1+result;
                case 7:result = s2+s1+s1+result;
                case 8:result = s2+s1+s1+s1+result;
                case 9:result = s1+map.get(level+2)+result;
            }
            level+=2;
        }
        return result;
    }
}
