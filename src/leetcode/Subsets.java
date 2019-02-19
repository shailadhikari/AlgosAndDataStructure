package leetcode;
import java.util.*;

public class Subsets {
	
	public static void main(String[] args) {
		subsets(new int[] {1,2,3,4});
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
	
    static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        if(nums.length == start){
        	System.out.println(Arrays.toString(tempList.toArray()));
            result.add(new ArrayList<>(tempList));    
            return;
        }
        tempList.add(nums[start]);
        backtrack(result, tempList, nums, start+1);
        tempList.remove(tempList.size()-1);
        backtrack(result, tempList, nums, start+1);
    }

}
