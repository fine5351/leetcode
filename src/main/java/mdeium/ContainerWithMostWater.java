package mdeium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 1}));
    }

    public int maxArea(int[] height) {
        int maxContain = 0;
        if (height.length < 1) {
            return maxContain;
        }
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            maxContain = Math.max(maxContain, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxContain;
    }
//    public int maxArea(int[] height) {
//        int maxContain = 0;
//        if (height.length < 1) {
//            return maxContain;
//        }
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int tempContain = Math.min(height[i], height[j]) * (j - i);
//                maxContain = Math.max(maxContain, tempContain);
//            }
//        }
//        return maxContain;
//    }
}
