package Array.BinarySearch;

public class SixtyNine_Mysqrt {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long)mid * mid == x) return mid;
            else if (((long)mid * mid) > x) {
                if (((long)mid - 1) * (mid - 1) < x) return mid - 1;
                else right = mid - 1;
            } else {
                if (((long)mid + 1) * (mid + 1) > x) return mid;
                else left = mid + 1;
            }
        }
        return -1;
    }
}
