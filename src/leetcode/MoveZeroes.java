package leetcode;

public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        if(nums.length <= 1)
            return;
        
        //Maintain a zero pointer
        int zeroPointer = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                continue;
            
            nums[zeroPointer] = nums[i];
            zeroPointer++; // increment with each shift
                
        }
        
        for(int i= zeroPointer; i<nums.length; i++){
            nums[i] = 0;
        }
    }

}
