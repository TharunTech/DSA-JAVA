package dataStructures;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int nums[]= {6,3,4,8,22,9,1,13,25};
		
		int sorted[]=quickSort(nums, 0,nums.length-1);		
		System.out.println("Sorted array: ");
		
		for(int num : sorted) {
			System.out.print(num+" ");
			
		}
		
		
		
		
	}

	public static int[] quickSort(int arr[],int low,int high) {
		
		
		if(low<high) {
			
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
		return arr;
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low -1;
		
		for(int j=low;j<high;j++){
			if(arr[j]<pivot) {
				i++;
				//swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			//swap arr[i+1] and high
			int temp = arr[i+1];
			arr[i+1]=arr[high];
			arr[high]=temp;
			
			return i+1;
	}

}
//O(nlog(n))- avg case - only 1 for loop and parallel execution of code
//O(n^2)- worst case
