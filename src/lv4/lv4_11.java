package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv4_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum=1;
        int cnt=0;
        for(;;){
            if(a==1){
                break;
            }else{
                if(a>sum){
                    cnt++;
                    System.out.println(cnt);
                    sum=sum+cnt;
                    System.out.println(sum);
                }else{
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
