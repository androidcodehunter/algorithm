package implementation;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/16/2017.
 */
public class AcmIcpcTeam {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }

        final int size = topic.length;

        int max = 0, teams = 0;

        for (int i = 0; i<size-1; i++){

            for (int j = i+1; j<n; j++){
                int value = Integer.parseInt(topic[i], 2) | Integer.parseInt(topic[j], 2);
                value = Integer.parseInt(Integer.toBinaryString(value), 2);
                // Do or operation and check if it works.
                if (max <= value){

                    if (max != 0){
                        teams++;
                    }

                    max = value;
                }
            }
        }


        String topics = Integer.toBinaryString(max);

        int len = topics.length();
        int count = 0;
        for (int i = 0; i<len; i++){
            if (topics.charAt(i) == '1'){
                count++;
            }
        }

        System.out.println(count);
        System.out.println(teams);


    }

}
