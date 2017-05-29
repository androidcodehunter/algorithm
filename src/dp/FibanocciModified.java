package dp;

import java.math.BigInteger;
import java.util.Scanner;

public class FibanocciModified {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(fib(scan.nextInt(),scan.nextInt(),scan.nextInt()));
		
		scan.close();
	}

	private static BigInteger fib(int one, int two, int n) {
		
		BigInteger f = BigInteger.valueOf(0); 
		BigInteger first = BigInteger.valueOf(one);
		BigInteger second = BigInteger.valueOf(two);
		
		for(int i = 2; i<n; i++){
			f = first.add(second.multiply(second));
			first = second;
			second = f;
		}
		
		return (f);
	}

}
