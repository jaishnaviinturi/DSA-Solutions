// Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/


//Definition for singly-linked list.
 public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int pairSum(ListNode head) {
        ListNode fast=head,slow=head;
        int max=Integer.MIN_VALUE;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        while(prev!=null){
            max=Math.max(max,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return max;
    }
}