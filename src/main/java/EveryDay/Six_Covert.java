package EveryDay;

import java.util.ArrayList;
import java.util.List;

public class Six_Covert {
    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> strings = new ArrayList<>();
        for(int i = 0;i<numRows;i++) strings.add(new StringBuilder());
        int row = 0, col = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            strings.get(row).append(s.charAt(i));
            if (flag) {
                if (row == numRows - 1) {
                    row--;
                    col++;
                    flag = false;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    row++;
                    flag = true;
                } else {
                    row--;
                    col++;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb:strings) result.append(sb);
        return result.toString();
    }
}
