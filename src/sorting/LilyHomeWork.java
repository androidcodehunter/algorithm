package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LilyHomeWork {
	
	private static int swapCount = 0; 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] ar = new Integer[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		
		final int len = ar.length;
	
		int []oldAr = new int[n];
		for(int i = 0; i<n; i++){
			oldAr[i] = ar[i];
		}
		
		Arrays.sort(ar);
		
		int swapCount = 0; 
		for(int i = 0; i<n; i++){
			if(oldAr[i] != ar[i]){
				swapCount++;
			}
		}
		
		Arrays.sort(ar, Collections.reverseOrder());
		int count = 0; 
		for(int i = 0; i<n; i++){
			if(oldAr[i] != ar[i]){
				count++;
			}
		}
		
		System.out.println(--swapCount);
		System.out.println(--count);
	}
	
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}


}
