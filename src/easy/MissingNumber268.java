package easy;

public class MissingNumber268 {
  public static int missingNUmber(int[] nums) {
	  int sum=nums.length;
	  for(int i=0;i<nums.length;i++) 
		  sum+=i-nums[i]; 
	     return sum;
  }
}
