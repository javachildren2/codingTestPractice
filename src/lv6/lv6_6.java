package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class lv6_6 {
    // 10815 숫자 카드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> cMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            cMap.put(arr[i], 1);
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(cMap.getOrDefault(arr2[i], 0)).append(" ");
        }
        System.out.println(sb);
    }
}