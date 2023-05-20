package EveryDay.May;

import java.util.PriorityQueue;

public class LCP_ThirtyThree_StoreWater {
    public static void main(String[] args) {

    }
//    public int storeWater(int[] bucket, int[] vat) {
//        int result = 0;
//        for(int i = 0;i< bucket.length;i++){
//            if(vat[i]==0) break;
//            int count = 0;
//            if(bucket[i]==0){
//                bucket[i]++;
//                count++;
//            }
//            int cur = vat[i]%bucket[i]==0?vat[i]/bucket[i]:vat[i]/bucket[i]+1;
//            int next = (vat[i]%(bucket[i]+1)==0?vat[i]/(bucket[i]+1):vat[i]/(bucket[i]+1)+1)+1;
//            while(next<cur){
//                bucket[i]++;
//                cur = next-1;
//                next = (vat[i]%(bucket[i]+1)==0?vat[i]/(bucket[i]+1):vat[i]/(bucket[i]+1)+1)+1;
//                count++;
//            }
//            count+=cur;
//            result = Math.max(count,result);
//        }
//        return result;
//    }
public int storeWater(int[] bucket, int[] vat) {
    int n = bucket.length;
    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> b[0] - a[0]);
    int cnt = 0;
    for (int i = 0; i < n; ++i) {
        if (bucket[i] == 0 && vat[i] != 0) {
            ++cnt;
            ++bucket[i];
        }
        if (vat[i] > 0) {
            pq.offer(new int[]{(vat[i] + bucket[i] - 1) / bucket[i], i});
        }
    }
    if (pq.isEmpty()) {
        return 0;
    }
    int res = Integer.MAX_VALUE;
    while (cnt < res) {
        int[] arr = pq.poll();
        int v = arr[0], i = arr[1];
        res = Math.min(res, cnt + v);
        if (v == 1) {
            break;
        }
        int t = (vat[i] + v - 2) / (v - 1);
        cnt += t - bucket[i];
        bucket[i] = t;
        pq.offer(new int[]{(vat[i] + bucket[i] - 1) / bucket[i], i});
    }
    return res;
}
}
