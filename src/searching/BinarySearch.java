package searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		int key = 12;
		
		int searchValue = binarySearchIterative(arr, key);
		System.out.println("Iterative: " + searchValue);
		searchValue = binarySearchRecursive(arr, key, 0, arr.length - 1);
		System.out.println("Recursive: " + searchValue);
		
	}

	private static int binarySearchRecursive(int[] arr, int key, int start, int end) {
	
		int middle = (start + end) >> 1; 
		
		if(arr[middle] == key){
			return arr[middle];
		}else if(key < arr[middle]){
			return binarySearchRecursive(arr, key, start, middle - 1);
		}else if(key > arr[middle]){
			return binarySearchRecursive(arr, key, middle + 1, end);
		}
		
		return - 1; 
	}

	private static int binarySearchIterative(int[] arr, int key) {
		
		int left = 0;
		int right = arr.length - 1;
		int middle = 0;
		
		while(left<= right){	
			
			middle = (left + right) >> 1;
		
			if(arr[middle] == key){
				return arr[middle];
			}else if(key < arr[middle]){
				right = middle - 1; 
			}else if(key > arr[middle]){
				left = middle + 1; 
			}
		}
		
		return -1; 
	}

}
