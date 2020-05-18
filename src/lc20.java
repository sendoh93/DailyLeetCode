import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例:
 * 输入: "()"
 * 输出: true
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * <p>
 * 输入: "([)]"
 * 输出: false
 */
public class lc20 {
    public static void main(String[] args) {
        System.out.print(isValid("}"));
    }

    public static boolean isValid(String s) {
        //第一想法可通过栈的先进后出
        Stack<Character> snapStack = new Stack<>();
        Map<Character, Character> referMap = new HashMap<>();
        referMap.put('(', ')');
        referMap.put('[', ']');
        referMap.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char snapChar = s.charAt(i);
            if (!referMap.containsKey(snapChar)) {
                if (!snapStack.isEmpty() && snapChar == referMap.get(snapStack.peek())) {
                    snapStack.pop();
                }else {
                    return false;
                }
            } else {
                snapStack.push(snapChar);
            }
        }

        return snapStack.isEmpty();
    }

}
