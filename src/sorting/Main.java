package sorting;

public class Main {

	public static void main(String[] args) {
		int arr[] = {5, 8, 1, 3, 7, 9, 2};
		sort(arr);
		printArray(arr);
	}

	private static void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		//mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int left, int right) {
		
		if(left >= right)return;
	
		int middle = (left + right)/2;

		mergeSort(arr, left, middle);
		mergeSort(arr, middle+1, right);
		
		
		
	}

	private static void quickSort(int[] arr, int left, int right) {
		
		if (left >= right)return; 
		
		int pIndex = partition(arr, left, right);
		quickSort(arr, left, pIndex - 1);
		quickSort(arr, pIndex, right);
	}
	
	private static int partition(int[] arr, int left, int right) {
		
		int pivot = arr[left];
		
		while(left <= right){
			while(arr[left]<pivot){
				left++;
			}
			
			while(arr[right] > pivot){
				right--;
			}
			
			if(left <= right){
				swap(arr, left, right);
				left++;
				right--;
			}
			
		}
		
		return left;
	}

	private static void swap(int[]arr, int sourceIndex, int destIndex){
		int temp = arr[sourceIndex];
		arr[sourceIndex] = arr[destIndex];
		arr[destIndex] = temp;
	}

	 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
	
}
