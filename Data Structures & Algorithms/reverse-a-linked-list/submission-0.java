/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        while(temp!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            temp.val=stack.pollFirst();
            temp=temp.next;
        }
        return head;
    }
}
