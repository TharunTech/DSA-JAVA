package dataStructures;

public class SelectionSort {
	public static void main(String[] args) {
		
		int nums[]= {6,3,4,8,7};
		
		int sorted[]=selectionSort(nums);
		
		System.out.println("Sorted array: ");
		
		for(int num : sorted) {
			System.out.print(num+" ");
			
		}
	}
		
		public static int[] selectionSort(int nums[]) {
			
			int size = nums.length;
			int minIndex = 0;
			int temp=0;
			
			for(int i=0;i<size-1;i++) {
				minIndex=i;
				
				
				for(int j=i+1;j<size;j++) {
					if(nums[minIndex]> nums[j]) {
						minIndex=j;
					}
				}
					temp=nums[minIndex];
					nums[minIndex]=nums[i];
					nums[i]=temp;		
			}
			
			
			return nums;
		}
}
