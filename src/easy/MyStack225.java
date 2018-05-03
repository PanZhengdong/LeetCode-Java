package easy;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack225 {
	Deque<Integer> queue;	
	public Mystack() {
		queue=new LinkedList<>();
	}
	
	public void push(int x) {
		queue.offer(x);
	}
	
	public int pop() {
		return queue.pollLast();
	}
	public int top() {
		return queue.peekLast();
	}
	public boolean empty() {
		return queue.isEmpty();   //事实上得益于java拥有队列和栈的数据结构  
	}
}
