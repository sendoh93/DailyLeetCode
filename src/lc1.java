import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class lc1 {
    public static void main(String[] args) {
           twoSum(new int[]{1,2,3},3);
    }

    public static int[] twoSum(int[] nums, int target) {
        //方法1：暴利法
        //拿到题目，第一感觉就是将下标0的第一个数字作为基础，遍历往后的数组，如果未求得结果，则使用下标1.。依次往下循环
        //时间复杂度 O(n^2) 空间复杂度 O(1)
//        int[] item = new int[2];
//        for(int i=0;i<nums.length-1;i++){
//            for (int k=i+1;k<nums.length;k++){
//                if (nums[i]+nums[k]==target){
//                    item[0] = i;
//                    item[1] = k;
//                    return item;
//                }
//            }
//        }
//        return item;


        //方法2：
        //采用map数据结构，key保存数组的具体数值，value保存数值对应的数组下标。
        Map<Integer,Integer> map= new HashMap<>();
        for (int i =0;i<nums.length-1;i++){
            int otherNum = target - nums[i];
            if (map.containsKey(otherNum)){
                System.out.println(i);
                System.out.println(map.get(otherNum));
                return new int[]{i,map.get(otherNum)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
