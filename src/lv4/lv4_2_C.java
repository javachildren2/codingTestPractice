package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;

public class lv4_2 {
    public static void main(String[] args) throws IOException {
        //1 3 5 7 9

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] star = new String[2 * n - 1];

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-(i+1);j++) {
                if (j == 0) {
                    star[i] = " ";
                    star[(star.length - 1) - i] = " ";
                } else {
                    star[i] += " ";
                    star[(star.length - 1) - i] += " ";
                }
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<2*i+1;j++) {
                star[i]+="*";
                star[(star.length-1)-i]+="*";
             }
            }
        for(int x=0;x<2*n-1;x++){
            if(x==0){
                star[n-1]="*";
            }else {
                star[n - 1] +="*";
            }
        }
        for(int x=0;x<2*n-1;x++){
            System.out.println(star[x]);
        }
        }
    }




