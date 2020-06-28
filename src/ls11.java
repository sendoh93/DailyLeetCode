/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class ls11 {
    public static void main(String[] arg) {
        maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public static int maxArea(int[] height) {
        //题目相当于求组成的最大面积，高度由两端的最小值决定，长度由下标跨度决定
        //初始点为左右两边，然后一直将最短版的进行往内侧靠近，求得最大值。时间复杂度O(n)
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int snapArea;
            if (height[left] >= height[right]) {
                snapArea = height[right] * (right - left);
                right--;
            } else {
                snapArea = height[left] * (right - left);
                left++;
            }
            maxArea = Math.max(snapArea,maxArea);
        }
        return maxArea;

    }
}
