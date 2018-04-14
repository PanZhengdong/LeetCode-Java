package easy;

public class MoveZeros283 {
    public void moveZeros(int[] nums) {
	if(nums==null||nums.length==0) return ;
	
	int insertPos=0;
	for(int num:nums) {
		if(num!=0) nums[insertPos]=num;
		
	}
	while(insertPos<nums.length) {
		nums[insertPos++]=0;
	}
    }
}
