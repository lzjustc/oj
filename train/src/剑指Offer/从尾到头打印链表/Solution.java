package src.剑指Offer.从尾到头打印链表;

/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = solution.printListFromTailToHead(null);
        for(int i : arrayList){
            System.out.println(i);
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        LinkedList<Integer> linkedList = new LinkedList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(listNode == null){
            return arrayList;
        }
        while(listNode.next != null){
            linkedList.addFirst(listNode.val);
            listNode = listNode.next;
        }
        linkedList.addFirst(listNode.val);
        for(int i:linkedList){
            arrayList.add(i);
        }
        return arrayList;
    }
}
