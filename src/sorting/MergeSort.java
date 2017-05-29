package sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int ar[] = {5, 8, 1, 3, 4, 2, 10};
		
		mergeSort(ar, 0, ar.length - 1);
		
	}

	private static void mergeSort(int[] ar, int start, int end) {
		
		if (start >= end) {
			return; 
		}
		
		int middle = (start + end)/2;
		// divide left half.
		mergeSort(ar, start, middle);
		// divide right half.
		mergeSort(ar, middle + 1, end);
		// merge left and right half
		mergeHalves(start, end);
	
	}

	private static void mergeHalves(int start, int end) {
		
	}

}
