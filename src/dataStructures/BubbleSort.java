package dataStructures;

public class BubbleSort {
	public static void main(String[] args) {
		
		int nums[]= {6,3,4,8};
		
		int sorted[]=bubbleSort(nums);
		
		System.out.println("Sorted array: ");
		
		for(int num : sorted) {
			System.out.print(num+" ");
			
		}
		
		
		
		
	}

	public static int[] bubbleSort(int nums[]) {
		
		int size = nums.length;
		int temp =0;
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			}
		}
		
		return nums;
	}
}
