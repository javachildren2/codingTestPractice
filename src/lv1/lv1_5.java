package lv1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class lv1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=1;i<=num;i++){
            st = new StringTokenizer(br.readLine()," ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
}

