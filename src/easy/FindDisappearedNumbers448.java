package easy;

public class FindDisappearedNumbers448 {
  public List<Integer> findDisappearedNumbers448(int[] nums){
	  List<Integer> ret =new ArrayList<Integer>();
	  
	  for(int i=0;i<nums.length;i++){
		  int val=Math.abs(nums[i])-1;  //绝对值
		  if(nums[val]>0){
			  nums[val]=-nums[val];
		  }
	  }
	  for(int i=0;i<nums.length;i++){
		  if(nums[i]>0){
			  ret.add(i+1);
		  }
	  }
	  return ret; 
  }
}
