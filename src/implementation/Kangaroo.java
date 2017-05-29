package implementation;

import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/24/2017.
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if(x2>x1 && v2>=v1){
            System.out.println("NO");
        }else{
            while (x1<x2){
                x1 += v1;
                x2 +=v2;
            }

            if (x1 == x2){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


        }
    }

}
