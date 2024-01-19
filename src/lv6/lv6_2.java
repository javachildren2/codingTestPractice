package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lv6_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 반복 횟수 입력
        int N = Integer.parseInt(br.readLine());

        // A 배열과 B 배열 초기화
        int[] Aarr = new int[N];
        int[] Barr = new int[N];

        // 배열에 데이터 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Aarr[i] = Integer.parseInt(st.nextToken());
            Barr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Aarr);
        Arrays.sort(Barr);


        for(int i=0;i<N;i++){
            System.out.print(Aarr[i]+" ");
            System.out.println(Barr[i]);
        }
            
        }
}