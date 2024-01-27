package dataStructures;

public class BinarySearch {
	public static void main(String[] args) {
		
		int nums[]= {5,7,9,11,54};
		int target = 5;
		
		int result = BSearch(nums,target);
		if(result!=-1)
		System.out.println("Element is found at index: "+result);
		else
			System.out.println("Element not found");
		
		
	}

	private static int BSearch(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<target){
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		
		return -1;
	}

}
