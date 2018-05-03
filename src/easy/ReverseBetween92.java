package easy;

public class ReverseBetween92 {
	public ListNode reverseBetween(ListNode head,int m,int n) {
		int flag=0;
		ListNode k =new ListNode(0);
		k.next=head;
		if(m==n) {
			return head;
		}else {
			ListNode ps=k;
			while(flag!=m-1) {
				k=k.next;
				flag+=1;
			}
			ListNode pn=k.next;
			ListNode pivot=pn;
			k.next=null;
			ListNode front=null;
			while(flag!=n-1) {
				front=pivot.next;
				pivot.next=pivot.next.next;
				front.next=pn;
				flag+=1;
			}
			k.next=pn;
			return ps.next;
		}
	}
}
