public class DecompressionCodeList {
    /**
     * 给你一个以行程长度编码压缩的整数列表 nums 。
     * <p>
     * 考虑每相邻两个元素 [a, b] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后有 a 个值为 b 的元素。
     * <p>
     * 请你返回解压后的列表。
     * <p>
     *  
     * <p>
     * 示例：
     * <p>
     * 输入：nums = [1,2,3,4]
     * 输出：[2,4,4,4]
     *  
     * <p>
     * 提示：
     * <p>
     * 2 <= nums.length <= 100
     * nums.length % 2 == 0
     * 1 <= nums[i] <= 100
     * <p>
     * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
     */
    public static void main(String[] args) {
        decompressRLElist(new int[]{1, 2, 3, 4});
    }

    public static int[] decompressRLElist(int[] nums) {
        int[] decompressNumbs = new int[]{};
        int size = nums.length / 2;
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < nums[i]; k++) {
                decompressNumbs[0] = 1;
            }
        }
        return decompressNumbs;
    }
}
