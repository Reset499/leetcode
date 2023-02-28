package EveryDay.February;

import java.util.ArrayList;
import java.util.List;

public class OneThousandTwoHundredThirtyEight {
    public static void main(String[] args) {

    }
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            ret.add((i >> 1) ^ i ^ start);
        }
        return ret;
    }

//    List<Integer> result = new ArrayList<>();
//
//    public List<Integer> circularPermutation(int n, int start) {
//        result.add(start);
//        backTracing(n,start);
//        return result;
//    }
//
//    public void backTracing(int n,int start) {
//        if (result.size() == n) return;
//        if(!result.contains()&&)
//        result.remove(result.size()-1);
//    }
}
