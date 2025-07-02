//Question Number 2487

 class RemoveNodes {
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        int max=curr.val;
        while(curr!=null && curr.next!=null){
            if(curr.next.val<max){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
                max=curr.val;
            }
        }
        return reverse(dummy.next);
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
