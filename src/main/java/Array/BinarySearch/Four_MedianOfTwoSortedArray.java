package Array.BinarySearch;

public class Four_MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = length1 + length2;
        //k:寻找第几小的数
        int k = length / 2;
        //若数组总长度为为偶数的话
        if (length % 2 == 0) {
            return (getResult(nums1, 0, length1 - 1, nums2, 0, length2 - 1, k) +
                    getResult(nums1, 0, length1 - 1, nums2, 0, length2 - 1, k + 1)) / 2;
        }//若数组总长度为奇数的话
        else return getResult(nums1, 0, length1 - 1, nums2, 0, length2 - 1, k + 1);
    }

    private static double getResult(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //若其中有一个数组的长度比k/2小,且在比较中被去除导致该数组的长度为0,则可以直接从数组2中得到第k小的数;
        if (len1 == 0) return nums2[start2 + k - 1];
        if (len2 == 0) return nums1[start1 + k - 1];
        //最终若k的值为1,则找出两个数数组最左边的数,比较哪个数小,则为最终的答案
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        //找到两个数组中各自第k/2小的数的下标(若数组的长度小于k/2,则直接取其队尾的下标)
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;
        //比较两个数组中各自第k/2小的数,小的一组则去掉比较数以及在其左边的所有数,再剩下的数中再寻找第k-(去除掉的数的数量)小的数
        if (nums1[i] < nums2[j]) {
            return getResult(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        } else return getResult(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = length1 + length2;
        double result = 0, temp = 0;
        int j = 0, k = 0;
        //无论奇数偶数都是要扫描这么多次,偶数则将length/2和length/2-1平均,奇数则直接返回length/2;
        for (int i = 0; i <= length / 2; i++) {
            //在数组1未扫描完时,若数组1的数更小,或者数组2已经扫描完了,则指向数组1的下一个
            temp = result;//上一次的扫描出来的结果给temp赋值,接下来result去获得新的结果
            if (j < length1 && (k >= length2 || nums1[j] < nums2[k])) {
                result = nums1[j++];
            }
            //若1已经扫描完了,或者数组2的值更大(且2并未越界)
            else {
                result = nums2[k++];
            }
        }
        if (length % 2 == 0) {
            return (result + temp) / 2;
        } else return result;
    }
}
