package easy;

public class MaxConsecutiveOnes485 {
  public int findMaxConsecutive(int[] nums){
	  int maxHere=0,max=0;
	  for(int n:nums){
		  max=math.max(max,maxHere=n==0?0:maxHere+1);
		  return max;
	  }
  }
}
