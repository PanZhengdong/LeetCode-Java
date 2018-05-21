package medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NumSquares279 {
	public int numsquares(int n) {
	Queue<Integer> queue = new LinkedList<>();
	Set<Integer> set =new HashSet<>();
	int step = 0;
	queue.offer(n);  // 添加一个元素并返回true
	while (!queue.isEmpty()) {
		int size = queue.size();
		step++;
		for(int i =0;i<size;i++) {
			int curr = queue .poll();  // 移除并返问队列头部的元素  
			if (!set.add(curr)) continue;  //结束判断、
			for (int j =1;j<Math.sqrt(curr);j++) {
				int next = curr - j *j;
				if(next == 0)return step;
				queue.offer(next);
				}
		}
	}
	return 0;
}
}
