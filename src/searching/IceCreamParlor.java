package searching;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor {
	
	public static class IceCream implements Comparable<IceCream>{
		int flavor;
		int index;
		
		@Override
		public int compareTo(IceCream o) {
			return this.flavor - o.flavor;
		}
		
	}
	

	public static void main(String[] args) {

		int t;
		int n, m;

		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		for (int test = 0; test < t; test++) {

			m = in.nextInt();
			n = in.nextInt();
			IceCream[] arr = new IceCream[n];
			

			for (int i = 0; i < n; i++){
				IceCream iceCream = new IceCream();
				iceCream.flavor = in.nextInt();
				iceCream.index = i + 1; 
				arr[i] = iceCream;
			}
			
			Arrays.sort(arr);
			
			binarySearch(arr, m);
			
		}

	}

	private static void binarySearch(IceCream[] arr, int m) {
		
		
		final int count = arr.length ;
		
		for(int i = 0; i< count -1; i++){
			
			int search = m - arr[i].flavor;
			
			if(search != -1){
				
				int bIndex  = myBinarySearch(arr, search);
				if(bIndex != -1){
					System.out.println((i+1) + " " + bIndex);
					break;
				}
			}
			
		}
		
	}

	private static int myBinarySearch(IceCream[] arr, int search) {
		
		int start = 0; 
		int end = arr.length - 1; 
		
		int mid = 0;
		
		while(start <= end){
			mid = start + (end - start)/2;
			if(arr[mid].flavor == search){
				return arr[mid].index;
			}else if(arr[mid].flavor < search){
				end = mid; 
			}else{
				start = mid; 
			}
		}
		
		return -1;
	}
}
