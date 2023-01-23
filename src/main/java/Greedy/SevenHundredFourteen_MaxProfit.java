package Greedy;

public class SevenHundredFourteen_MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {
        int buy = prices[0] + fee;
        int sum = 0;
        for (int p : prices) {
            if (p + fee < buy) {
                buy = p + fee;
            } else if (p > buy) {
                sum += p - buy;
                buy = p;
            }
        }
        return sum;
    }

}
