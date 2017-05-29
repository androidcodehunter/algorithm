package competition;

import java.util.Scanner;

public class Duplication {

	public static final String values = preLoadValues().toString();

	private static StringBuilder preLoadValues() {
		StringBuilder stringBuilder = new StringBuilder();
		String s = "0";
		String t = "1";

		boolean running = true;
		while(running){
			stringBuilder = new StringBuilder();
			stringBuilder.append(s);
			stringBuilder.append(t);
			s= stringBuilder.toString();
			t = getReplaceString(s.toString());

			if (stringBuilder.length() >=10001)running = false;
		}
		return stringBuilder;
	}

	private static String getReplaceString(String s) {
		int size = s.length();

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i<size; i++){
			if (s.charAt(i) == '1'){
				stringBuilder.append("0");
			}else {
				stringBuilder.append("1");
			}
		}

		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {

/*		StringBuilder stringBuilder = preLoadValues();

		System.out.println(stringBuilder.toString());*/


		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			int x = in.nextInt();
			String result = duplication(x);
			System.out.println(result);
		}

	}

	static String duplication(int x){
		// Complete this function
		return String.valueOf(values.charAt(x));
	}



}
