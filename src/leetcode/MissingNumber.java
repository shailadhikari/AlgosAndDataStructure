package leetcode;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {     
        //calculate actual sum
        int sum = 0;
        for(int i:nums)
            sum+=i;
        
        //calculate the expected sum : (n*n-1)/2 and substract to get value
        int len = nums.length+1;
        int expectedSum = (len*(len-1))/2;
        
        return expectedSum - sum;
        
    }

}
