package lv4;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class lv4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] snum =br.readLine().split(" ");
        int[] card={1,1,2,2,2,8};


        for(int i=0;i<card.length;i++){
            System.out.print(card[i]-Integer.valueOf(snum[i])+" ");

        }
    }
}
