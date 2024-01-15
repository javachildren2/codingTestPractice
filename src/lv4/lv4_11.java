package lv4;

import java.util.Scanner;

public class lv4_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int cnt = 1;
        int psum = 0;

        while (true) {

         
            if (a <= psum + cnt) {

                if (cnt % 2 == 1) {	
                    
                    System.out.print((cnt - (a-psum-1)) + "/" + (a-psum));
                    break;
                }

                else {
                    System.out.print((a-psum) + "/" + (cnt - (a-psum-1)));
                    break;
                }

            } else {
                psum += cnt;
                cnt++;
            }
        }
    }
}