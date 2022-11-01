package Array.BinarySearch;

public class ThreeHundredSixtySeven_IsPerfectSquare {
    public static void main(String[] args) {
        int x = 16;
        System.out.println(isPerfectSquare(x));
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        int mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if ((long) mid * mid == num) return true;
            else if ((long) mid * mid > num) {
                if ((long) (mid - 1) * (mid - 1) < num) return false;
                else right = mid - 1;
            } else {
                if ((long) (mid + 1) * (mid + 1) > num) return false;
                else left = mid + 1;
            }
        }
        return false;
    }
}
