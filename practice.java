
import java.util.*;


public class practice {

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public ListNode revList(ListNode head){
    if(head == null) return null;

    ListNode prev = null;
    ListNode pres = head;
    ListNode nex = pres.next;

    while(pres != null){
        pres.next = prev;
        prev = pres;
        pres = nex;
        if(nex != null){
            nex = nex.next;
        }
    }
    return prev;
}