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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode list: lists){
            if(list != null){
                pq.offer(list);
            }
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            cur.next = node;
            cur = cur.next;

            node = node.next;
            if(node!=null){
                pq.offer(node);
            }
        }
        return res.next;
    }
}