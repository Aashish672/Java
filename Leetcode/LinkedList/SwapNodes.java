// Leetcode Question Number 24

public class SwapNodes {
    public static void main(String[] args){
        
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current=dummy;
        while(current.next!=null && current.next.next!=null){
            ListNode first=current.next;
            ListNode second=current.next.next;

            first.next=second.next;
            second.next=first;
            current.next=second;
            
            current=first;
        }
        return dummy.next;
    }
}
