package searching;

import java.util.Arrays;
import java.util.Scanner;

public class CompareCheck {
	
	public static class IceCream implements Comparable{
		
		int flavor;
		int index; 
		
		public IceCream(int flavor, int index){
			this.flavor = flavor;
			this.index = index; 
		}
		
		@Override
		public int compareTo(Object o) {
			IceCream cpCheck = (IceCream) o;
			return this.flavor - cpCheck.flavor;
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
				arr[i] = new IceCream(in.nextInt(), i+1);
			}
			
			
			Arrays.sort(arr);
			
			
			Solution solution = new Solution(arr);
			
			solution.solve(m, n);
			
		}
		
		in.close();
		
		
	}
	
	
	public static class Solution{
		
		IceCream[]iceCreams;
		
		public Solution(IceCream[]iceCreams){
			this.iceCreams = iceCreams;
		}
		
		public void solve(int m, int n){
			
			for(int i = 0; i<n; i++){
				
				
				int cost = m - iceCreams[i].flavor;
				
		/*		if (cost ) {
					
				}*/
				
			}
			
			
			
		}
		
	}

	private static void binarySearch(int searchKey) {
		
		
	}

}
