package easy;

import java.util.LinkedList;
import java.util.Stack;

public class IsPalindrome234 {
	public boolean isPalindrome(ListNode head) {
		LinkedList<Integer> queue =new LinkedList<Integer>();
		Stack<Integer> stack =new Stack<Integer>();
		while(head!=null) {
			queue.add(head.val);
			stack.push(head.val);
			head=head.next;
		}
		while(queue.size()>0) {
			try {
				if(!queue.remove().equals(stack.pop())) return false;
			}
			catch(Exception e) {
				return false;
			}
		}
		return true;
	}
}
