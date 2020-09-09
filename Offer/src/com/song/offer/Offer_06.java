package com.song.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer_06 {

    public static void main(String[] args) {

    }

    public static int[] reversePrint(ListNode head) {
        List<Integer> result = new ArrayList<>();
        reversePoint(head,result);
        Integer[] i = result.toArray(new Integer[result.size()]);
        int[] r = new int[i.length];
        for (int j = 0; j < i.length; j++) {
            r[j] = i[j];
        }
        return r;
    }

    public static void reversePoint(ListNode head,List<Integer> list){
        if (head ==null) return;
        if (head!=null){
            reversePoint(head.next,list);
        }
        list.add(head.val);
    }

    static public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
}
