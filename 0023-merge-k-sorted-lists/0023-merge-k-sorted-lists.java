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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null){
            return null;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(ListNode node:lists){
            while(node!=null){
                pq.add(node.val);
                node=node.next;
            }
        }
        ListNode head;
        // Poll() - It will give the head element of the queue and will remove the head element from queue. If queue is empty then it will return null. Remove() - It will give the head element of the queue and will remove the head element from queue. If queue is empty then it will throw an Exception.(same but diff when empty)
        if(!pq.isEmpty()){
            head=new ListNode(pq.poll());
        }else{
            return null;
        }
        ListNode temp;
        temp=head;
        while(!pq.isEmpty()){
            temp.next=new ListNode(pq.poll());
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}