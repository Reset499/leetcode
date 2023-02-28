package EveryDay.February;

import java.util.HashMap;
import java.util.Map;

public class OneThousandOneHundredThirtyEight_AlphabetBoardPath {
    public static void main(String[] args) {

    }

    public String alphabetBoardPath(String target) {
        String result = "";
        int preRow = 0, preCol = 0, curRow = 0, curCol = 0;
        for (int i = 0; i < target.length(); i++) {
            curRow = (target.charAt(i) - 'a') / 5;
            curCol = (target.charAt(i) - 'a') % 5;
            if (preRow == 5) {
                if (curRow > preRow) for (int j = 0; j < curRow - preRow; j++) result += 'D';
                else for (int k = 0; k < preRow - curRow; k++) result += 'U';
                if (curCol > preCol) for (int m = 0; m < curCol - preCol; m++) result += 'R';
                else for (int n = 0; n < preCol - curCol; n++) result += 'L';
            } else {
                if (curCol > preCol) for (int m = 0; m < curCol - preCol; m++) result += 'R';
                else for (int n = 0; n < preCol - curCol; n++) result += 'L';
                if (curRow > preRow) for (int j = 0; j < curRow - preRow; j++) result += 'D';
                else for (int k = 0; k < preRow - curRow; k++) result += 'U';
            }
            result += '!';
            preRow = curRow;
            preCol = curCol;
        }
        return result;
    }
}
