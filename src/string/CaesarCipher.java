package string;

import java.util.Scanner;

/**
 * Created by Sharif-PC on 5/28/2017.
 */
public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();

        k = k % 26;

        for(int i =0;  i< n;i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                int val = c+k;
                if (Character.isLowerCase(c) && val > (int)'z'){
                 val = val - 26;
                }else if (Character.isUpperCase(c) && val > (int)'Z'){
                    val = val - 26;
                }
                System.out.print(Character.toString((char) val));
            }else {
                System.out.print(Character.toString(c));
            }

        }
    }

}
