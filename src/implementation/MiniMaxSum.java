package implementation;

import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/15/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long sum = 0;
        for (int i : arr) {
            sum += i;
        }

        long min = Long.MAX_VALUE, max = 0;


        long diff = 0;
        for (int i : arr) {
            diff = sum - i;
            if(diff>max){
                max = diff;
            }
            if (diff < min){
                min = diff;
            }
        }

        System.out.println(min + " " +max);


    }

}
