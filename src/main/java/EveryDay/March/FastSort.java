package EveryDay.March;

public class FastSort {
    public static void main(String[] args) {
        fast(0,9,new int[]{5,2,7,3,9,4,6,1,8,0});
    }
    public static void fast(int left,int right,int[] ints){
        if(left>=right) return;
        int p = quick(left,right,ints);
        fast(left,p-1,ints);
        fast(p+1,right,ints);
    }
    public static int quick(int left,int right,int[] ints){
        int p = left;
        while (left<right){
            while (ints[right]>ints[p]&&left<right) right--;
            while (ints[left]<=ints[p]&&left<right) left++;//多加一层判断保证left和right不越界;
            swap(left,right,ints);
        }
        swap(p,left,ints);
        return left;
    }
    public static void swap(int a,int b,int[] ints){
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }
}
