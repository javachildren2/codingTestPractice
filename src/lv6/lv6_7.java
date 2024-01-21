package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class lv6_7 {
    //14425 문자열 집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Set<String> setS = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            setS.add(br.readLine());
        }


        int count = 0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (setS.contains(str)) {
                count++;
            }
        }

        System.out.println(count);
    }
}