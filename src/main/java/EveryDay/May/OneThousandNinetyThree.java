package EveryDay.May;

public class OneThousandNinetyThree {
    public static void main(String[] args) {
    }

    public double[] sampleStats(int[] count) {
        //最大最小值
        double minimum = Integer.MAX_VALUE;
        boolean flag = true;
        double maximum = Integer.MIN_VALUE;
        //平均数
        double mean = 0;
        long sum = 0;
        int amount = 0;
        //中位数
        double median = 0;
        //众数
        double mode = 0;
        for (int i = 0; i < 256; i++) {
            //寻找最小值
            if (flag && count[i] != 0) {
                minimum = i;
                flag = false;
            }
            //寻找最大值
            if (count[i] != 0) maximum = i;
            //寻找众数
            mode = count[i] > count[(int) mode] ? i : mode;
            //求总和以及有多少个数
            sum += (long) i * count[i];
            amount += count[i];
        }
        mean = (double) sum / amount;
        //寻找中位数
        int temp = 0;
        int i = 0;
        //偶数情况
        if(amount%2==0){
            while (temp<amount/2){
                temp+=count[i];
                i++;
            }
            if(temp==amount/2){
                int cur = i-1;
                while (count[i]==0) i++;
                median = (double) (i+cur)/2;
            }else median = i-1;
        }else {//奇数情况
            while(temp<(amount/2)+1){
                temp+=count[i];
                i++;
            }
            median = i-1;
        }
        return new double[]{minimum,maximum,mean,median,mode};
    }
}
