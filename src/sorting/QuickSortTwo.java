package sorting;

import java.util.Scanner;

public class QuickSortTwo {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		
		final int len = ar.length;
		
		if(len<=1){
			return;
		}
		
		quickSort(ar, 0, len -1);

		//printArray(ar);
	}

	static void quickSort(int[] ar, int left, int right) {
		
		if(left < right){
			int pIndex = partition(ar, left, right);
			//System.out.println(pIndex);
			
			// left quick sort
			quickSort(ar, left, pIndex-1);
			
			// right quick sort
			quickSort(ar, pIndex + 1, right);
			
		}
		
	}

	private static int partition(int[] ar, int left, int right) {
		
		int pivot = ar[right];
		
		int pIndex = left - 1;
		
		
		for(int j = left; j<right; j++){
			
			if(ar[j] <= pivot){
				pIndex = pIndex + 1;
				
				swap(ar, pIndex, j);
			}
			
		}

		swap(ar, pIndex + 1, right);
		
		return pIndex + 1;
	}
	
	
	private static void swap(int[]arr, int sourceIndex, int destIndex){
		int temp = arr[sourceIndex];
		arr[sourceIndex] = arr[destIndex];
		arr[destIndex] = temp;
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}


}
