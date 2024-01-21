package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class lv6_5 {
    //18870 좌표압축
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] Arr = new int[N];
        int[] sArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Arr[i] = Integer.parseInt(st.nextToken());
            sArr[i] = Arr[i];
        }

        Arrays.sort(sArr);

        HashMap<Integer, Integer> compressionMap = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0 || sArr[i] != sArr[i - 1]) {
                compressionMap.put(sArr[i], cnt++);
            }
        }
        System.out.println(compressionMap);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            System.out.println("i = " +Arr[i]);
            sb.append(compressionMap.get(Arr[i])).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}