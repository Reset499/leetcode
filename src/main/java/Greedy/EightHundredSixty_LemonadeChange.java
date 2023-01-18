package Greedy;

public class EightHundredSixty_LemonadeChange {
    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        int[] changes = {0, 0};
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) changes[0]++;
            else if (bills[i] == 10) {
                changes[1]++;
                changes[0]--;
            } else if (bills[i] == 20) {
                if (changes[1] == 0) {
                    changes[0] = changes[0] - 3;
                } else {
                    changes[1]--;
                    changes[0]--;
                }
            }
            if (changes[0] < 0) return false;
        }
        return true;
    }
}
