package dataStructures;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int nums[]= {6,3,4,8,22,9,1};
		
		int sorted[]=insertionSort(nums);
		
		System.out.println("Sorted array: ");
		
		for(int num : sorted) {
			System.out.print(num+" ");
			
		}
		
		
		
		
	}

	public static int[] insertionSort(int nums[]) {
		
		int size = nums.length;
		
		for(int i=1;i<size;i++) {
			
			int key = nums[i];
			int j = i-1;
			
			while(j>=0 && nums[j]>key) {
				
				nums[j+1]=nums[j];
				j--;
			
			}
			nums[j+1]=key;
		}
		
		return nums;
	}

}
