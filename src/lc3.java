import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */

public class lc3 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }

    public static int lengthOfLongestSubstring(String s) {

//        int count = 0;
//        if (s!=null && !s.equals("")){
//            //第一想法是双遍历  时间复杂度O(n^2)
//            for (int i=0;i<s.length();i++){
//                int num = 0;
//                HashMap<String,String> snap = new HashMap<>();
//                for (int k=i;k<s.length();k++){
//                    snap.put(String.valueOf(s.charAt(k)),null);
//                    if (snap.size()>num){
//                        num++;
//                    }else {
//                        break;
//                    }
//                }
//                count = Math.max(count,num);
//            }
//            System.out.println(count);
//            return count;
//        }else {
//            System.out.println(count);
//            return count;
//        }

        //优化解
//        int size = s.length();
//        int count = 0;
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (int start = 0, end = 0; end < size; end++) {
//            char snap = s.charAt(end);
//            if (hashMap.containsKey(snap)) {
//                start = Math.max(start, hashMap.get(snap));
//            }
//            count = Math.max(end - start + 1, count);
//            hashMap.put(snap, end + 1);
//        }
//        System.out.println(count);
//        return count;

        /**
         * 官方解
         */
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        System.out.println(ans);
        return ans;

    }
}
