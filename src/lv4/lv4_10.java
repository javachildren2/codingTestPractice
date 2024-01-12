package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv4_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum=1;
        int cnt=1;
        for(;;){
            if(a==1){

                break;
            }else{
                if(a>sum){
                    sum=sum+6*cnt;
                    cnt++;

                }else {
                    break;
                }
            }
        }
        System.out.println(cnt);


    }
}


