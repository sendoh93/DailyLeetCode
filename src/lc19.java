import java.util.Stack;

public class lc19 {
    public static void main(String[] args){

    }

    public static lc2.ListNode removeNthFromEnd(lc2.ListNode head , int n){
        Stack<lc2.ListNode> stack = new Stack<>();
        lc2.ListNode temp = new lc2.ListNode(0);
        temp.next = head;
        while (true){
            if (temp.next == null){
                break;
            }else {
                stack.add(temp.next);
                temp = temp.next;
            }
        }

        int last = 1;
        while (true){
            if (last == n){
                stack.pop()
                break;
            }else {
                stack.pop();
                last++;
            }
        }

    }
}
