package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv5_1 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt=0;
        int x=0;
        int y=0;
        String arr[]=new String[] {"neither","factor","multiple"};
        for(;;) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x=Integer.parseInt(st.nextToken());
            y=Integer.parseInt(st.nextToken());
            if (x==0&&y==0) {
                break;
            }
            else if(y%x==0) {
                cnt=1;
            }else if(x%y==0) {
                cnt=2;
            }else {
                cnt =0;
            }
            System.out.println(arr[cnt]);
        }


    }

}