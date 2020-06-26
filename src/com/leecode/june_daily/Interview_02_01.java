package com.leecode.june_daily;

import java.util.HashSet;
import java.util.Set;

public class Interview_02_01 {
    static public ListNode removeDuplicateNodes(ListNode head) {
        ListNode p = head,q;
        if (p==null)
            return head;
        Set<Integer> nodeVal = new HashSet<>();
        nodeVal.add(p.val);
        while(p!=null&&p.next!=null){
            q = p.next;
            if (nodeVal.add(q.val)){
                p=q;
            }else{
                p.next=q.next;
            }
        }
        return head;
    }

    private static ListNode removeLianxuNode(ListNode head) {
        ListNode p = head,q = head;
        while(p!=null){
            if (p.next==null)
                break;
            while(p.next!=null&&p.val==p.next.val){
                if (p==head){
                    p=p.next;
                    head = p;
                }else{
                    q.next = p.next;
                    p=q.next;
                }
            }
            q=p;
            p=p.next;
        }
        return head;
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a= new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);

        head.next=a;
        a.next = b;
        b.next = c;
        c.next = null;
        head = removeDuplicateNodes(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
