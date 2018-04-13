package easy;

public class Rotate189 {
  public void retate(int[] nums,int k) {
	  k%=nums.length;
	  reverse(nums,0,nums.length-1);
	  reverse(nums,0,k-1);
	  reverse(nums,k,nums.length-1);//three reverse 
  }
  public void reverse(int[] nums,int start,int end) {
	  while(start<end) {
		  int temp=nums[start];
		  nums[start]=nums[end];
		  nums[end]=temp;
		  start++;
		  end--;
	  }
 }
}

