package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        int cnt=0;
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i)==word.charAt(i)){
                cnt++;
            }
        }
        if(cnt==sb.length()){
            System.out.print(1);
        }else {
            System.out.println(0);
        }
    }
}
