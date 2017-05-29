package competition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/16/2017.
 */
public class FightTheMonster {

    static int getMaxMonsters(int n, int hit, int t, int[] h){
        // Complete this function

        Arrays.sort(h);

        int i = 0;

        int hitCount = 0, result = 0;

        while (i != -1){

            int diff = h[i] - hit;

            if (diff <= 0){
                result++;
                i= i+1;
            }else {
                h[i] = diff;
            }

            hitCount++;

            if (hitCount == t)break;
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }

}
