package dataStructures;

public class MergeSort {
	public static void main(String[] args) {
		
		int arr [] = {3,5,1,4,6,2};
		
		System.out.println("MERGE SORT");
		System.out.println("Before sorting:");
		for(int n : arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println("After sorting: ");
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}

	private static void mergeSort(int[] arr, int l, int r) {
		
		
		if(l<r) {
			int mid = (l+r)/2;
			
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			
			merge(arr,mid,l,r);
		}
		
	}

	private static void merge(int[] arr, int mid, int l, int r) {
		
		int n1 = mid-l+1;// size of first mirgesort call 3-0+1 = 4 for array of 6 
		int n2 = r-mid;// size of second mergesort call 6-3 = 3 for array of 6
		
		int lArr[]=new int[n1];
		int rArr[]=new int[n2];
		
		for(int x=0;x<n1;x++) {
			lArr[x] = arr[l+x];//splitting the array
		}
		for(int x=0;x<n2;x++) {
			rArr[x] = arr[mid+1+x];//splitting the array
		}
		
		int i =0;//counter for lArr
		int j =0;//counter for rArr
		int k =l;//counter for main array
		
		while(i<n1 && j<n2) {//when the values are less than the length of arrays
			
			if(lArr[i]<=rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}
			else {
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)//when elements are left in one of the arrays - left array elements remaining
		{
			arr[k]=lArr[i];
			i++;
			k++;
		}
		while(i<n1)//when elements are left in one of the arrays - right array elements remaining
		{
			arr[k]=rArr[j];
			j++;
			k++;
		}
	}

}
