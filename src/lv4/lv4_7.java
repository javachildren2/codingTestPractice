package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lv4_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String snum = s[0];
        int num = Integer.parseInt(s[1]);

        int[] arr = new int[snum.length()];
        for (int i = 0; i < snum.length(); i++) {
            if (snum.charAt(i) >= 65) {
                arr[i] = snum.charAt(i) -55;
            } else {
                arr[i] = snum.charAt(i) - 48;
            }

        }
        int rsum=0;
        for(int i=0;i<snum.length();i++){
            int sum =0;
            int a=(int)Math.pow(num,snum.length()-i-1);
            sum=a*arr[i];
            rsum=rsum+sum;

        }
        System.out.println(rsum);
    }
}
