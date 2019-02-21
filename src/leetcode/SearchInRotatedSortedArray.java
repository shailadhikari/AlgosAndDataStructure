package leetcode;

public class SearchInRotatedSortedArray {


	public int search(int[] nums, int target) {

		if(nums == null || nums.length == 0)
			return -1;

		if(nums.length == 1)
			if(nums[0] == target)
				return 0;
			else
				return -1;

		int first = nums[0];
		int last = nums[nums.length-1];

		if(target == first)
			return 0;
		if(target == last)
			return nums.length-1;



		if(target > first){//go from start
			int i = 1;
			while(i<nums.length){
				if(nums[i-1]>nums[i])
					return -1;

				if(nums[i] == target)
					return i;

				i++;
			}
		}
		else if(target < last){
			int i = nums.length-2;
			while(i>=0){
				if(nums[i+1] < nums[i])
					return -1;
				if(nums[i] == target)
					return i;

				i--;
			}
		}

		return -1;
	}

}
