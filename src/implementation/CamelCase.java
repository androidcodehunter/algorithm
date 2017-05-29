package implementation;

import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/15/2017.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int size = s.length();

        int count = 1;

        for (int i = 0; i< size; i++){

            if (Character.isUpperCase(s.charAt(i))){
                    count++;
            }

        }


        System.out.println(count);


    }
}

