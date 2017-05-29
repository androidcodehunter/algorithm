package implementation;

import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/24/2017.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int fist;
        int last;

      //brute force will get timeout
        for(int i = 0; i< k; i++){
            fist = a[0];
            last = a[n-1];
            a[0] = last;
            for (int j = 1; j<n; j++){
                last = a[j];
                a[j] = fist;
                fist = last;
            }
        }

        for(int a0 = 0; a0 < q; a0++){
            System.out.println(a[in.nextInt()]);
        }


    }

}
