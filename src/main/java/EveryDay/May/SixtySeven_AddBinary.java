package EveryDay.May;

import javax.sound.midi.Soundbank;

public class SixtySeven_AddBinary {
    public static void main(String[] args) {
    }
    public String addBinary(String a, String b) {
        String result = "";
        int lenA = a.length();
        int lenB = b.length();
        int i = 0;
        boolean flag = false;
        while(i<lenA&&i<lenB){
            String tmp = "";
            if(a.charAt(lenA-1-i)=='0'&&b.charAt(lenB-1-i)=='0') {tmp = flag?"1":"0";flag = false;}
            else if((a.charAt(lenA-1-i)=='1'&&b.charAt(lenB-1-i)=='0')||
                    (a.charAt(lenA-1-i)=='0'&&b.charAt(lenB-1-i)=='1')) tmp = flag?"0":"1";
            else {tmp = flag?"1":"0";flag = true;}
            result  = tmp + result;
            i++;
        }
        if(lenA>i){
            while (i<lenA){
                String tmp = "";
                if(a.charAt(lenA-1-i)=='1') tmp = flag?"0":"1";
                else if(a.charAt(lenA-1-i)=='0'){ tmp = flag?"1":"0";flag = false;}
                result = tmp+result;
                i++;
            }
        }else if(lenB>i){
            while (i<lenB){
                String tmp = "";
                if(b.charAt(lenB-1-i)=='1') tmp = flag?"0":"1";
                else if(b.charAt(lenB-1-i)=='0'){ tmp = flag?"1":"0";flag = false;}
                result = tmp+result;
                i++;
            }
        }
        return flag?"1"+result:result;
    }
}
