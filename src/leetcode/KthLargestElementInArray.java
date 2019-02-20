package leetcode;

import java.util.*;

public class KthLargestElementInArray {
	//Simple two step approach using sorting api
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums); 
		return nums[nums.length-k];  
	}

	//custom approach using quick sort; best approach
	//     public int findKthLargest(int[] nums, int k) {
	//         int n=nums.length,target=n-k;
	//         quickSort(nums,0,n-1,target);
	//         return nums[target];
	//     }

	//     public void quickSort(int[] nums,int start,int end,int target){
	//         if(start==end) return;
	//         int mid=(start+end)/2;
	//         int pivot=findPivot(nums[start],nums[mid],nums[end]);
	//         int i=start,j=end;
	//         while(i<=j){
	//             while(nums[i]<pivot) i++;
	//             while(nums[j]>pivot) j--;
	//             if(i<=j){
	//                 swap(nums,i,j);
	//                 i++;
	//                 j--;
	//             }
	//         }
	//         if(target<=i-1) quickSort(nums,start,i-1,target);
	//         else{
	//             quickSort(nums,i,end,target);
	//         }        
	//     }

	//     public int findPivot(int a,int b, int c){
	//         int max=Math.max(Math.max(a,b),c);
	//         int min=Math.min(Math.min(a,b),c);
	//         return a+b+c-max-min;
	//     }

	//     public void swap(int[] nums, int i, int j){
	//         if(i==j) return;
	//         int temp=nums[i];
	//         nums[i]=nums[j];
	//         nums[j]=temp;
	//     }
}
