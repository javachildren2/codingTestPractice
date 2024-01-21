package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lv6_4 {
    //10814 나이순 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][3];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = Integer.toString(i);
            arr[i][2] = st.nextToken();
        }Arrays.sort(arr, (e1, e2) -> {
            if (e1[0].equals(e2[0])) {
                return Integer.parseInt(e1[1]) - Integer.parseInt(e2[1]);
            } else {
                return e1[0].compareTo(e2[0]);
            }
        });
        for(int i = 0 ; i< N ; i++) {
            sb.append(arr[i][0] + " " + arr[i][2]).append('\n');
        }
        System.out.print(sb);
        }

        }

