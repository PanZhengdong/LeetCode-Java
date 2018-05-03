package easy;

public class ReverseList206 {
	public ListNode reverseList(ListNode head) {
		ListNode p=null,q,r;
		q=head;
		if(head==null) 
			return head;
			while(q!=null) {
				r=q.next;
				q.next=p;
				if(r==null)
					head=q;
				p=q;
				q=r;
				
			}
			return head;
		}
	}
