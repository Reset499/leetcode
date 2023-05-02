package EveryDay.May;

import java.util.*;

public class NineHundredSeventy_PowerfulIntegers {
    public static void main(String[] args) {
    }
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int[] X = new int[20];
        int[] Y = new int[20];
        X[0] = 1;
        Y[0] = 1;
        for(int i = 1;i<20;i++){X[i] = X[i-1]*x;Y[i] = Y[i-1]*y;}
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<20&&X[i]<=bound-1;i++){
            for(int j = 0;j<20&&X[i]+Y[j]<=bound;j++){
                    set.add(X[i]+Y[j]);
            }
        }
        List<Integer> result = new ArrayList<>(set);
        return result;
    }
}
