package implementation;

import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/15/2017.
 */
public class CatsAndMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int distanceA = Math.abs(z -x);
            int distanceB = Math.abs(z - y);

            String result = "Mouse C";

            if (distanceA>distanceB){
                result = "Cat B";
            }else if (distanceB>distanceA){

                result = "Cat A";
            }

            System.out.println(result);
        }

    }

}
