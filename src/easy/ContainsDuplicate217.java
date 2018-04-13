package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
  public boolean containsDuplicate(int [] nums) {
	  /*for(int i=0;i<nums.length;i++) {
		   for(int j=i+1;j<nums.length;i++) {
			   if(nums[i]==nums[j]) {
				   return true;
			   }
		   }
	   }
	   return false;*/
	  /*Arrays.sort(nums);
	  for(int ind=1;ind<nums.length;ind++) {
		  if(nums[ind]==nums[ind-1]) {
			  return true;
		  }
	  }
	  return false;*/
	  final Set<Integer> distinct=new HashSet<Integer>();
	  for(int num:nums) {
		  if(distinct.contains(nums)) {
			  return true;
		  }
		  distinct.add(num);
	  }
	  return false;
   }
	
}
