package Array;

public class Eleven_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int length = height.length;
        int result = 0;
        int left = 0, right = length - 1;
        while (left<right){
            result = result>(right-left)*Math.min(height[left],height[right])
                    ?result:(right-left)*Math.min(height[left],height[right]);
            if(height[left]<height[right]) left++;
            else right--;
        }
            return result;
    }
}
