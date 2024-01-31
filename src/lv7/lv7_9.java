package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv7_9 {
    // 13909 창문 닫기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i * i <= N; i++) {      // N이 5라 가정할경우 1 2 3 4 5 중 1 과 4를 살펴보면 1의 약수 1
            cnt++;                              // 4의 약수는 1 2 4 로 약수의 갯수가 3개이다
        }                                       // 약수의 갯수가 홀 수 일 경우 창문이 열려있다는 뜻이고 그러므로 cnt를 증가시킴
        System.out.println(cnt);
    }
}

