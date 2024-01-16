package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int box=0;

        for(int i=1;i<x;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(i);

            int sum=0;
            for(int j=0;j<sb.length();j++){
                sum=sum+(sb.charAt(j)-48);
             }
            if(i+sum==x){
                box=i;
                break;
            }
        }
        System.out.println(box);
    }
}
