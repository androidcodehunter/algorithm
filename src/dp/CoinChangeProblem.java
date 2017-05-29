package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/15/2017.
 */
public class CoinChangeProblem {

    public static long makeChange(int[] coins, int money) {

        //{1,2,3}
        // We need money 4
        int len = coins.length;

        int arr[] = new int[len + 1];

        Arrays.fill(arr, 0);

        arr[0] = 1;

        int count = 0;
        for (int i = 0; i<len; i++ ){
            int value = coins[i];
            for (int j = value; j<=money; j++){
                if (money - value == 0){
                    count++;
                    break;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }

    static long countWays(int S[], int m, int n)
    {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)

        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];

        return table[n];
    }


}
