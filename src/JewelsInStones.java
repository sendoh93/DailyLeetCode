import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JewelsInStones {
    /**
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
     * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * <p>
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     * <p>
     * 示例 1:
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     * <p>
     * 示例 2:
     * 输入: J = "z", S = "ZZ"
     * 输出: 0
     * <p>
     * 注意:
     * S 和 J 最多含有50个字母。
     *  J 中的字符不重复。
     */
    public static void main(String[] args) {
        System.out.print(numJewelsInStonesByList("aA","aAAbbbb"));
    }

    //暴利解法
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int k = 0; k < S.length(); k++) {
                if (J.charAt(i) == S.charAt(k)) {
                    count++;
                }
            }
        }
        return count;
    }

    //Hash Set
    public static int numJewelsInStonesBetter(String J, String S) {
        Set<Character> Jset = new HashSet<>();
        for (char i:J.toCharArray()){
            Jset.add(i);
        }
        int count = 0;
        for (char k :S.toCharArray()){
            if (Jset.contains(k)){
                count++;
            }
        }
        return count;
    }

    //By list
    public static int numJewelsInStonesByList(String J, String S) {
        List<Character> Jset = new ArrayList<>();
        for (char i:J.toCharArray()){
            Jset.add(i);
        }
        int count = 0;
        for (char k :S.toCharArray()){
            if (Jset.contains(k)){
                count++;
            }
        }
        return count;
    }
}
