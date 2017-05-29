package warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/15/2017.
 */
public class BirthdayCakeCandle {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }


        int max  = 0;
        int count = 0;

        for (int i = 0; i<n; i++){

            int temp = height[i];

            if (temp == max){
                count++;
            }

            if (height[i] > max){
                count = 1;
                max = height[i];
            }


        }

        System.out.println(count);

    }

}
